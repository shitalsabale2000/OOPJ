import java.util.Scanner;

public class ExamResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();

        if (marks >= 35) {
            System.out.println("Student has passed.");
        } else {
            System.out.println("Student has failed.");
        }

        scanner.close();
    }
}