
abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();
}


interface BonusEligible {
    double calculateBonus();
}


class PermanentEmployee extends Employee implements BonusEligible {
    double basicSalary, hra;

    PermanentEmployee(String name, int id, double basicSalary, double hra) {
        super(name, id);
        this.basicSalary = basicSalary;
        this.hra = hra;
    }

    @Override
    double calculateSalary() {
        return basicSalary + hra;
    }

    @Override
    public double calculateBonus() {
        return 0.10 * calculateSalary();
    }
}

class ContractEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    ContractEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}


public class EmployeeManagementDemoQ29 {
    public static void main(String[] args) {
        PermanentEmployee e1 = new PermanentEmployee("Amit", 1, 50000, 5000);
        ContractEmployee e2 = new ContractEmployee("Neha", 2, 300, 100);

        System.out.println(e1.name + " Salary = " + (int)e1.calculateSalary() + ", Bonus = " + (int)e1.calculateBonus());
        System.out.println(e2.name + " Salary = " + (int)e2.calculateSalary());
    }
}
