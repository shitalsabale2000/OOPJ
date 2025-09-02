class Student {
    private int rollNo;
    private String name;
    private int marks;

    // Constructor
    public Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Getter and Setter for marks
    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    // Method to calculate grade
    public String calculateGrade() {
        if (marks >= 80) {
            return "A";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 40) {
            return "C";
        } else {
            return "Fail";
        }
    }

    // Method to print student details
    public void printDetails() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks + ", Grade: " + calculateGrade());
    }
}

public class GradeMain11 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Anjali", 85);
        Student s2 = new Student(102, "Vikram", 58);

        s1.printDetails();
        s2.printDetails();
    }
}
