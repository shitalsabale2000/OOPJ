
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displaySalary() {
        System.out.println(name + " → Salary=" + (int)salary);
    }
}


class TeachingStaff extends Employee {
    String subject;

    TeachingStaff(String name, double salary, String subject) {
        super(name, salary);
        this.subject = subject;
    }

    @Override
    void displaySalary() {
        System.out.println(name + " → Subject=" + subject + ", Salary=" + (int)salary);
    }
}

class Professor extends TeachingStaff {
    String specialization;

    Professor(String name, double salary, String subject, String specialization) {
        super(name, salary, subject);
        this.specialization = specialization;
    }

    @Override
    void displaySalary() {
        System.out.println(name + " → Subject=" + subject + ", Specialization=" + specialization + ", Salary=" + (int)salary);
    }
}


class Lecturer extends TeachingStaff {
    String department;

    Lecturer(String name, double salary, String subject, String department) {
        super(name, salary, subject);
        this.department = department;
    }

    @Override
    void displaySalary() {
        System.out.println(name + " → Subject=" + subject + ", Department=" + department + ", Salary=" + (int)salary);
    }
}


public class CollegeStaffDemoQ20 {
    public static void main(String[] args) {
        Professor prof = new Professor("Dr. Sharma", 80000, "Math", "Algebra");
        Lecturer lect = new Lecturer("Ms. Mehta", 50000, "Physics", "Science");

        prof.displaySalary();  
        lect.displaySalary();  
    }
}
