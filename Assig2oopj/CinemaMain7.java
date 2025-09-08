class Customer {
    private String name;
    private String ticketType;
    private static int totalTicketsSold = 0;

    // Constructor 1: Only name
    public Customer(String name) {
        this.name = name;
        this.ticketType = "Normal"; // default ticket type
        totalTicketsSold++;
    }

    // Constructor 2: Name and ticket type
    public Customer(String name, String ticketType) {
        this.name = name;
        this.ticketType = ticketType;
        totalTicketsSold++;
    }

    // Method to print customer details
    public void printDetails() {
        System.out.println("Name: " + name + ", Ticket: " + ticketType);
    }

    // Static method to show total tickets sold
    public static void showTotalTicketsSold() {
        System.out.println("Total Tickets Sold: " + totalTicketsSold);
    }
}

public class CinemaMain7 {
    public static void main(String[] args) {
        Customer c1 = new Customer("Rahul");
        Customer c2 = new Customer("Pooja", "Premium");
        Customer c3 = new Customer("Amit");

        System.out.print("Customer1: "); c1.printDetails();
        System.out.print("Customer2: "); c2.printDetails();
        System.out.print("Customer3: "); c3.printDetails();

        Customer.showTotalTicketsSold();
    }
}
