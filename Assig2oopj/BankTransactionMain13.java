class BankAccount {
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter and Setter for balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(accountHolder + " deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(accountHolder + " withdrew $" + amount);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }

    // Method to print account details
    public void printDetails() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: $" + balance);
    }
}

public class BankTransactionMain13 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Rohit", 10000);
        BankAccount acc2 = new BankAccount("Priya", 15000);

        acc1.deposit(2000);
        acc1.withdraw(500);
        
		acc2.deposit(3000);
        acc2.withdraw(15000);
        
		System.out.println("\nUpdated Account Details:");
        acc1.printDetails();
        acc2.printDetails();
    }
}
