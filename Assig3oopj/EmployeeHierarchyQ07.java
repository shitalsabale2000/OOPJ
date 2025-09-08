class Employee {
    protected String name;
    protected double basicSalary;

    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

 
    public double getNetSalary() {
        return basicSalary;
    }

    public String getName() {
        return name;
    }
}


class RegularEmployee extends Employee {
    public RegularEmployee(String name, double basicSalary) {
        super(name, basicSalary);
    }

    @Override
    public double getNetSalary() {
        return basicSalary + (0.10 * basicSalary); 
    }
}


class ContractEmployee extends Employee {
    public ContractEmployee(String name, double basicSalary) {
        super(name, basicSalary);
    }

    @Override
    public double getNetSalary() {
        return basicSalary + (0.05 * basicSalary); 
    }
}


public class EmployeeHierarchyQ07 {
    public static void main(String[] args) {
        RegularEmployee rahul = new RegularEmployee("Rahul", 20000);
        ContractEmployee riya = new ContractEmployee("Riya", 15000);

        System.out.println(rahul.getName() + " Net Salary = " + (int)rahul.getNetSalary());
        System.out.println(riya.getName() + " Net Salary = " + (int)riya.getNetSalary());
    }
}
