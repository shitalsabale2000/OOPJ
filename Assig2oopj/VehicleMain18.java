class Vehicle {
    private String regNo;
    private String ownerName;
    private String vehicleType;
    private static int vehicleCount = 1; // Starts from 1

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.regNo = "MH-2025-" + vehicleCount;
        vehicleCount++;
    }

    // Getters
    public String getRegNo() {
        return regNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    // Method to display vehicle details
    public void printDetails() {
        System.out.println("Reg No: " + regNo + ", Owner: " + ownerName + ", Type: " + vehicleType);
    }
}

public class VehicleMain18 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ravi", "Two-Wheeler");
        Vehicle v2 = new Vehicle("Anita", "Four-Wheeler");

        System.out.println("C-DAC MUMBAI Vehicle Registration:");
        v1.printDetails();
        v2.printDetails();
    }
}