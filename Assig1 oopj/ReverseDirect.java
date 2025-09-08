import java.util.Scanner;

public class ReverseDirect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 4-digit number: ");
        String num = sc.next();  // Take input as string

        String reversed = new StringBuilder(num).reverse().toString();

        System.out.println("Reversed number: " + reversed);
    }
}