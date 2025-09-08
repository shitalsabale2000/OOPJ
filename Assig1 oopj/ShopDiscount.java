import java.util.Scanner;

public class ShopDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total purchase amount: ");
        double amount = scanner.nextDouble();

        double finalCost;
        if (amount > 1000) {
            finalCost = amount - (amount * 0.10);
        } else {
            finalCost = amount;
        }

        System.out.println("Final cost after discount: " + finalCost);
        scanner.close();
    }
}