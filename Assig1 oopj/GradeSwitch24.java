import java.util.Scanner;

public class GradeSwitch24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks (0–100): ");
        int marks = sc.nextInt();

        String grade;
        switch (marks / 5) {
            case 0: case 1: case 2: case 3: case 4:
                grade = (marks < 25) ? "F" : "E";
                break;
            case 5: case 6:
                grade = "C";
                break;
            case 7:
                grade = "B";
                break;
            case 8: case 9: case 10:
                grade = (marks <= 84) ? "B" : "A";
                break;
            default:
                grade = "Invalid marks";
        }

        System.out.println("Grade: " + grade);
    }
}
