import java.util.Scanner;

public class DaysInMonth19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number (1–12): ");
        int month = sc.nextInt();

        if (month == 2) {
            System.out.println("28 or 29 days");
        } else if (month >= 1 && month <= 12) {
            if (month == 4 || month == 6 || month == 9 || month == 11)
                System.out.println("30 days");
            else
                System.out.println("31 days");
        } else {
            System.out.println("Invalid month number");
        }
    }
}

