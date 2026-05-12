class DepositTask implements Runnable {
    public void run() {
        System.out.println("Depositing money...");
        try { Thread.sleep(2000); } catch(Exception e) {}
        System.out.println("Deposit Completed!");
    }
}

class WithdrawTask implements Runnable {
    public void run() {
        System.out.println("Withdrawing money...");
        try { Thread.sleep(2000); } catch(Exception e) {}
        System.out.println("Withdraw Completed!");
    }
}

public class BankApp {
    public static void main(String[] args) {
        Runnable deposit = new DepositTask();
        Runnable withdraw = new WithdrawTask();

        Thread t1 = new Thread(deposit);
        Thread t2 = new Thread(withdraw);
        System.out.println("my name is sonu singh ");
        System.out.println("kya tum mujhe jante ho ");

        t1.start();   // deposit parallel start hoga
        t2.start();   // withdraw parallel start hoga
    }
}
