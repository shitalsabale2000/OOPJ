import java.util.Scanner;

public class LuckyNumber15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 4-digit number: ");
        String num = sc.next();

        if (num.length() == 4) {
            int a = Character.getNumericValue(num.charAt(0));
            int b = Character.getNumericValue(num.charAt(1));
            int c = Character.getNumericValue(num.charAt(2));
            int d = Character.getNumericValue(num.charAt(3));

            if (a + b == c + d) {
                System.out.println("Lucky number");
            } else {
                System.out.println("Not a lucky number");
            }
        } else {
            System.out.println("Invalid input. Enter a 4-digit number.");
        }
    }
}