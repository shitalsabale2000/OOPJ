class Employee {
    private int id;
    private String name;
    private double basicSalary;
    private static int idCounter = 1001;

    // Default constructor
    public Employee() {
        this.id = idCounter++;
        this.name = "Unknown";
        this.basicSalary = 20000;
    }

    // Parameterized constructor
    public Employee(String name, double basicSalary) {
        this.id = idCounter++;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    // Method to calculate net salary
    public double calculateNetSalary() {
        double hra = basicSalary * 0.10;
        double da = basicSalary * 0.05;
        double pf = basicSalary * 0.02;
        return basicSalary + hra + da - pf;
    }

    // Method to print employee details
    public void printDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Basic Salary: ₹" + basicSalary + ", Net Salary: ₹" + calculateNetSalary());
    }
}

public class EmployeeMain16 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ravi", 30000);
        Employee e2 = new Employee(); 

        e1.printDetails();
        e2.printDetails();
    }
}
