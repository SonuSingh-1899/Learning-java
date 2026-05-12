package multithreading_ex;
class BankAccount {
    private int balance = 1000;

    // synchronized method
    public synchronized void withdraw(String name, int amount) {
        if (balance >= amount) {
            System.out.println(name + " is withdrawing " + amount);
            balance -= amount;
            System.out.println(name + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(name + " cannot withdraw. Insufficient balance!");
        }
    }
}

class CustomerThread extends Thread {
    BankAccount account;
    String customerName;
    int amount;

    CustomerThread(BankAccount account, String customerName, int amount) {
        this.account = account;
        this.customerName = customerName;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(customerName, amount);
    }
}

public class ATMExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        CustomerThread c1 = new CustomerThread(account, "Sonu", 500);
        CustomerThread c2 = new CustomerThread(account, "Aman", 700);

        c1.start();
        c2.start();
    }
}
