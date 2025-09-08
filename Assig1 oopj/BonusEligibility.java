import java.util.Scanner;

public class BonusEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter years of service: ");
        int years = scanner.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus awarded.");
        }

        scanner.close();
    }
}