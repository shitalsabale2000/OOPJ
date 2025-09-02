import java.util.Scanner;

public class EvenOddStatus47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a % 2 == 0 && b % 2 == 0)
            System.out.println("Both numbers are even");
        else if (a % 2 != 0 && b % 2 != 0)
            System.out.println("Both numbers are odd");
        else
            System.out.println("Numbers are mixed (one even, one odd)");
    }
}
