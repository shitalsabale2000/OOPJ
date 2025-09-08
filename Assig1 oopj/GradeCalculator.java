import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter percentage marks: ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 76) {
            System.out.println("Grade: A");
        } else if (marks >= 66) {
            System.out.println("Grade: B+");
        } else if (marks >= 51) {
            System.out.println("Grade: B");
        } else if (marks >= 36) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}