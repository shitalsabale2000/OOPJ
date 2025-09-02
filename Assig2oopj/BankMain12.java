class BankAccount {
    private String accountHolder;
    private double balance;

    // Parameterized constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to print account details
    public void printDetails() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
    }
}

public class BankMain12 {
    public static void main(String[] args) {
        // Create one account
        BankAccount account = new BankAccount("Yash", 10000.0);

        // Update balance using setter
        account.setBalance(12000.0);

        // Display account details
        account.printDetails();
    }
}
