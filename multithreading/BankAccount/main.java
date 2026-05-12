package BankAccount;

public class main {
    public static void main(String[] args) {
        bankaccount SBI = new bankaccount();

        Runnable task = new Runnable(){
            @Override
            public void run(){
                SBI.withdraw(30);
            }
        }; 

        Thread t1 = new Thread(task, "thread 1");
        Thread t2 = new Thread(task, "thread 2");

        t1.start();
        t2.start();
    }
}
