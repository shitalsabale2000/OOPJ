import java.util.Scanner;

public class AttendanceCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total classes held: ");
        int totalClasses = scanner.nextInt();

        System.out.print("Enter classes attended: ");
        int attendedClasses = scanner.nextInt();

        double attendancePercentage = (attendedClasses * 100.0) / totalClasses;

        if (attendancePercentage >= 75) {
            System.out.println("Student is allowed");
        } else {
            System.out.println("Student is not allowed");
        }

        scanner.close();
    }
}