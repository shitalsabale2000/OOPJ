class Student {
    private int rollNo;
    private String name;
    private int marks;

    // Parameterized constructor
    public Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Getter for marks
    public int getMarks() {
        return marks;
    }

    // Setter for marks
    public void setMarks(int marks) {
        this.marks = marks;
    }

    // Method to print student details
    public void printDetails() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks);
    }
}

public class StudentMain10 {
    public static void main(String[] args) {
        // Create student
        Student s1 = new Student(101, "Amit", 45);

        // Update marks using setter
        s1.setMarks(88);

        // Print student details
        s1.printDetails();
    }
}
