import java.util.Scanner;
public class StudentmarkQ2 {
    private int marks;

   
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks. Must be between 0 and 100.");
        }
    }
      public int getMarks() {
        return marks;
    }

public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
        Student s = new Student();
		System.out.println("Enter the number");
		int inputmarks = sc.nextInt();
        s.setMarks(inputmarks); 
        System.out.println("Marks = " + s.getMarks()); 
    }
}
