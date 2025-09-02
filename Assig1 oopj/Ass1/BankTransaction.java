import java.util.Scanner;

public class BankTransaction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter transaction amount: ");
        int amount = scanner.nextInt();

       
        if (amount > 0) {
            System.out.println("Deposit transaction.");
        } else if (amount < 0) {
            System.out.println("Withdrawal transaction.");
        } else {
            System.out.println("No transaction occurred.");
        }

        scanner.close();
    }
}