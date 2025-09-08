
class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Speed: " + speed);
    }
}

class Car extends Vehicle {
    private String modelType;

    public Car(String brand, int speed, String modelType) {
        super(brand, speed);
        this.modelType = modelType;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car → " + brand + " " + modelType + ", Speed=" + speed);
    }
}


class Bike extends Vehicle {
    private String modelType;

    public Bike(String brand, int speed, String modelType) {
        super(brand, speed);
        this.modelType = modelType;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike → " + brand + " " + modelType + ", Speed=" + speed);
    }
}
public class VehicleTypesQ8 {
    public static void main(String[] args) {
        Car car = new Car("Honda", 180, "Civic");
        Bike bike = new Bike("Yamaha", 120, "R15");

        car.displayDetails();
        bike.displayDetails();
    }
}
