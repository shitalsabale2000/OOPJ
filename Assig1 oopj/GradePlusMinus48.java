import java.util.Scanner;

public class GradePlusMinus48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        String grade;

        if(marks >= 85)
            grade = "A";
        else if {(marks >= 75)
            grade = "A−";
        else if {(marks >= 65)
            grade = "B+";
		else if {(marks >= 55)
            grade = "B";
        else if {(marks >= 45)
            grade = "C";
        else if { (marks >= 35)
            grade = "D";
        else
            grade = "F";

        System.out.println("Grade: " + grade);
    }
}
