import java.util.Scanner;
class Account {
    protected int accountNo;
    protected double balance;

    public Account(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("Account → " + accountNo + ", Balance = " + balance);
    }
}


class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(int accountNo, double balance, double interestRate) {
        super(accountNo, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Saving → " + accountNo + ", Balance = " + (int)balance + ", Interest = " + interestRate + "%");
    }
}


class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int accountNo, double balance, double overdraftLimit) {
        super(accountNo, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void displayDetails() {
        System.out.println("Current → " + accountNo + ", Balance = " + (int)balance + ", Overdraft = " + (int)overdraftLimit);
    }
}

public class BankAccountTypesQ11 {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount(101, 5000, 5);
        CurrentAccount ca = new CurrentAccount(102, 10000, 2000);

        sa.displayDetails();
        ca.displayDetails();
    }
}
