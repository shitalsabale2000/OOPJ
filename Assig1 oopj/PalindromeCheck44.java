import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 4-digit number: ");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;

        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }

        System.out.println("Reversed number: " + reverse);
        if (reverse == original)
            System.out.println("Palindrome: Yes");
        else
            System.out.println("Palindrome: No");
    }
}
