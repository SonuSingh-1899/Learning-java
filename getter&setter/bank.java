class BankAccount {
    // Private data (Data hiding)
    private String accountHolder;
    private double balance;

    // Getter for accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Setter for accountHolder
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance with validation
    public void setBalance(double balance) {
        if(balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("❌ Balance negative नहीं हो सकता!");
        }
    }
}

public class bank {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.setAccountHolder("Sonu Singh");
        acc.setBalance(5000);  // Valid
        acc.setBalance(-1000); // Invalid

        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Balance: " + acc.getBalance());
    }
}
