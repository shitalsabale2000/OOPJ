
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displaySalary() {
        System.out.println(name + " Total Salary = " + (int)salary);
    }
}


class Manager extends Employee {
    Manager(String name, double salary) {
         this.name = name;
        this.salary = salary;
    }

    @Override
    void displaySalary() {
        double totalSalary = salary + (0.20 * salary);
        System.out.println(name + " Total Salary = " + (int)totalSalary);
    }
}


class Developer extends Employee {
    Developer(String name, double salary) {
         this.name = name;
        this.salary = salary;
    }

    @Override
    void displaySalary() {
        double totalSalary = salary + (0.10 * salary);
        System.out.println(name + " Total Salary = " + (int)totalSalary);
    }
	
}
public class SalaryDisplayQ16 {
    public static void main(String[] args) {
        Employee m = new Manager("Anita", 50000);
        Employee d = new Developer("Rohit", 40000);

        m.displaySalary();  // Output: Anita Total Salary = 60000
        d.displaySalary();  // Output: Rohit Total Salary = 44000
    }
}
