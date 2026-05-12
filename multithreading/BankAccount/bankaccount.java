package BankAccount;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class bankaccount {
    private int balance = 100;

    private final Lock lock = new ReentrantLock();
     
    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + "  attempting to withdrow  ::  "+ amount);
        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                   if(balance >= amount){
                   try {
                     System.out.println(Thread.currentThread().getName() + "process withdrowl ");
                    Thread.sleep(3000);
                    balance -= amount;
                    System.out.println(Thread.currentThread().getName()+" complated withdrowl. Remaining balance: " + balance);
                   } catch (Exception e) {
                    
                   }finally {
                    lock.unlock();
                   }
                   }else {
                    System.out.println(Thread.currentThread().getName() + " insufficient balance");
                   }
            }else {
                System.out.println((Thread.currentThread().getName() + " could not aquire the lock, will try aagin later :"));
            }
        } catch (Exception e){

        }
    }

}


