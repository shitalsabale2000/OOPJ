import java.util.Scanner;

public class SimpleCalculator30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Add\n2 - Subtract\n3 - Multiply\n4 - Divide");
        System.out.print("Choose: ");
        int choice = sc.nextInt();

        System.out.print("First number: ");
        double a = sc.nextDouble();

        System.out.print("Second number: ");
        double b = sc.nextDouble();

        if (choice == 1)
            System.out.println("Result: " + (a + b));
        else if (choice == 2)
            System.out.println("Result: " + (a - b));
        else if (choice == 3)
            System.out.println("Result: " + (a * b));
        else if (choice == 4)
            System.out.println(b != 0 ? "Result: " + (a / b) : "Cannot divide by zero");
        else
            System.out.println("Invalid choice");
    }
}
