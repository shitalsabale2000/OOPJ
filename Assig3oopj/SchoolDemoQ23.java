
class Member {
    String name;
    int id;

    Member(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println(name + " → ID=" + id);
    }
}


class Teacher extends Member {
    String subject;

    Teacher(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    @Override
    void displayInfo() {
        System.out.println(name + " → ID=" + id + ", Subject=" + subject);
    }
}


class Student extends Member {
    int grade;

    Student(String name, int id, int grade) {
        super(name, id);
        this.grade = grade;
    }

    @Override
    void displayInfo() {
        System.out.println(name + " → ID=" + id + ", Grade=" + grade);
    }
}


class Staff extends Member {
    String department;

    Staff(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    @Override
    void displayInfo() {
        System.out.println(name + " → ID=" + id + ", Department=" + department);
    }
}


public class SchoolDemoQ23 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Kumar", 101, "English");
        Student student = new Student("Riya", 201, 10);
        Staff staff = new Staff("Mr. Das", 301, "Maintenance");

        teacher.displayInfo();
        student.displayInfo();  
        staff.displayInfo();    
    }
}
