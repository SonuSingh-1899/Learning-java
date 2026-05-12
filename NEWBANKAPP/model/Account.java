package NEWBANKAPP.model;

public class Account {
    private final String accountno;
    private double balance;
    private final User owner;
    
    public Account(String accountno, double balance, User owner) {
        this.accountno = accountno;
        this.balance = balance;
        this.owner = owner;
    }

    public String getAccountno() {
        return accountno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public User getOwner() {
        return owner;
    }
    
}
