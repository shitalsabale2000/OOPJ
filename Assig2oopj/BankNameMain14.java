class BankAccount {
    private String accountHolder;
    private double balance;

    // Static variable for bank name
    static String bankName = "CDAC Bank";

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Static method to display bank name
    public static void displayBankName() {
        System.out.println("Bank Name: " + bankName);
    }

    // Method to print account details
    public void printDetails() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: ₹" + balance);
    }
}

public class BankNameMain14 {
    public static void main(String[] args) {
        // Display bank name
        BankAccount.displayBankName();

        // Create one account
        BankAccount account = new BankAccount("Rohit", 10000);

        // Print account details
        account.printDetails();
    }
}

   