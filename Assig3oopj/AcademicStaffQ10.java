
class Staff {
    protected String name;
    protected double salary;

    public Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println(name + " → " + salary);
    }
}


class TeachingStaff extends Staff {
    private String subject;

    public TeachingStaff(String name, double salary, String subject) {
        super(name, salary);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        System.out.println(name + " → " + subject + ", " + (int)salary);
    }
}

class NonTeachingStaff extends Staff {
    private String department;

    public NonTeachingStaff(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        System.out.println(name + " → " + department + ", " + (int)salary);
    }
}


public class AcademicStaffQ10 {
    public static void main(String[] args) {
        TeachingStaff anita = new TeachingStaff("Anita", 50000, "Math");
        NonTeachingStaff ramesh = new NonTeachingStaff("Ramesh", 40000, "Admin");

        anita.displayInfo();
        ramesh.displayInfo();
    }
}
