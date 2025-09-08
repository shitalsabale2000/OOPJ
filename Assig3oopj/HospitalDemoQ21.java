
class Staff {
    String name;
    int staffId;

    Staff(String name, int staffId) {
        this.name = name;
        this.staffId = staffId;
    }

    void displayDetails() {
        System.out.println(name + " → Staff ID=" + staffId);
    }
}


class Doctor extends Staff {
    String specialization;

    Doctor(String name, int staffId, String specialization) {
        super(name, staffId);
        this.specialization = specialization;
    }

    @Override
    void displayDetails() {
        System.out.println(name + " → Staff ID=" + staffId + ", Specialization=" + specialization);
    }
}


class Nurse extends Staff {
    String shift;

    Nurse(String name, int staffId, String shift) {
        super(name, staffId);
        this.shift = shift;
    }

    @Override
    void displayDetails() {
        System.out.println(name + " → Staff ID=" + staffId + ", Shift=" + shift);
    }
}


public class HospitalDemoQ21 {
    public static void main(String[] args) {
        Doctor doc = new Doctor("Dr. Reddy", 101, "Cardiology");
        Nurse nurse = new Nurse("Nisha", 102, "Night");

        doc.displayDetails();    
        nurse.displayDetails();  
    }
}
