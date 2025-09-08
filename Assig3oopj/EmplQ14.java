abstract class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract double calculateBonus();
}
class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.20;
    }
}


class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.10;
    }
}
public class EmplQ14 {
    public static void main(String[] args) {
       
        Employee manager = new Manager("Anita", 50000);
        Employee developer = new Developer("Rohit", 40000);
        System.out.println(manager.name + " Bonus = " + (int)manager.calculateBonus());
        System.out.println(developer.name + " Bonus = " + (int)developer.calculateBonus());
}
}