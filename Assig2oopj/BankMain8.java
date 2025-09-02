class BankAccount {
    private String name;
    private double balance;
    private static double interestRate;

    // Static block to initialize interest rate
    static {
        interestRate = 4.0;
        System.out.println("Bank Interest Rate Initialized: " + interestRate + "%");
    }

    // Constructor
    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to print account details
    public void printDetails() {
        System.out.println("Name=" + name + ", Balance=" + balance + ", Interest Rate=" + interestRate + "%");
    }
}

public class BankMain8 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Rohit", 5000);
        BankAccount acc2 = new BankAccount("Priya", 15000);

        System.out.print("Account1: "); acc1.printDetails();
        System.out.print("Account2: "); acc2.printDetails();
    }
}
