
import java.util.Scanner;

public class AgeComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age of Friend 1: ");
        int age1 = sc.nextInt();
        System.out.print("Enter age of Friend 2: ");
        int age2 = sc.nextInt();
        System.out.print("Enter age of Friend 3: ");
        int age3 = sc.nextInt();

        // Oldest
        if (age1 >= age2 && age1 >= age3) {
            System.out.println("Oldest: Friend 1");
        } else if (age2 >= age1 && age2 >= age3) {
            System.out.println("Oldest: Friend 2");
        } else {
            System.out.println("Oldest: Friend 3");
        }

        // Youngest
        if (age1 <= age2 && age1 <= age3) {
            System.out.println("Youngest: Friend 1");
        } else if (age2 <= age1 && age2 <= age3) {
            System.out.println("Youngest: Friend 2");
        } else {
            System.out.println("Youngest: Friend 3");
        }
    }
}