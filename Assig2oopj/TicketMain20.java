class Ticket {
    private String passengerName;
    private int ticketNo;
    private static int ticketCounter = 5001;

    // Constructor
    public Ticket(String passengerName) {
        this.passengerName = passengerName;
        this.ticketNo = ticketCounter++;
    }

    // Method to display ticket details
    public void displayTicket() {
        System.out.println("Ticket No: " + ticketNo + ", Passenger: " + passengerName);
    }
}

public class TicketMain20 {
    public static void main(String[] args) {
        Ticket t1 = new Ticket("Rahul");
        Ticket t2 = new Ticket("Priya");
        Ticket t3 = new Ticket("Amit");

        System.out.println("C-DAC Ticket Booking System:");
        t1.displayTicket();
        t2.displayTicket();
        t3.displayTicket();
    }
}
