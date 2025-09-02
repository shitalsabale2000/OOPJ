class Student {
    private String name;
    private String className;
    private static int tuitionFee;

    // Static block to initialize tuition fee
    static {
        tuitionFee = 30000;
        System.out.println("School Tuition Fee Initialized: " + tuitionFee);
    }

    // Constructor
    public Student(String name, String className) {
        this.name = name;
        this.className = className;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public static int getTuitionFee() {
        return tuitionFee;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    // Method to print student details
    public void printDetails() {
        System.out.println("Name=" + name + ", Class=" + className + ", Tuition Fee=" + tuitionFee);
    }
}

public class SchoolMain9 {
    public static void main(String[] args) {
        Student s1 = new Student("Anjali", "10th");
        Student s2 = new Student("Vikram", "12th");

        System.out.print("Student1: "); s1.printDetails();
        System.out.print("Student2: "); s2.printDetails();
    }
}

