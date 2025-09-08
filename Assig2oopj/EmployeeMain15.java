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


    // Method to print employee details
    public void printDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Basic Salary: ₹" + basicSalary);
    }
}

public class EmployeeMain15 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ravi", 30000);
        Employee e2 = new Employee(); // uses default constructor

        e1.printDetails();
        e2.printDetails();
    }
}
