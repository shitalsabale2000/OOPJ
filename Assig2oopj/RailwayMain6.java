class Passenger {
    private String name;
    private int age;
    private String seatType;
    private static int totalPassengers = 0;

    // Constructor 1: name and age only
    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
        this.seatType = "General"; // default seat type
        totalPassengers++;
    }

    // Constructor 2: name, age, and seat type
    public Passenger(String name, int age, String seatType) {
        this.name = name;
        this.age = age;
        this.seatType = seatType;
        totalPassengers++;
    }

    // Method to print passenger details
    public void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Seat: " + seatType);
    }

    // Static method to show total passengers
    public static void showTotalPassengers() {
        System.out.println("Total Passengers Booked: " + totalPassengers);
    }
}

public class RailwayMain6 {
    public static void main(String[] args) {
        Passenger p1 = new Passenger("Ravi", 25);
        Passenger p2 = new Passenger("Anita", 30, "AC Sleeper");
        Passenger p3 = new Passenger("Suresh", 40);

        System.out.print("Passenger1: "); p1.printDetails();
        System.out.print("Passenger2: "); p2.printDetails();
        System.out.print("Passenger3: "); p3.printDetails();

        Passenger.showTotalPassengers();
    }
}
