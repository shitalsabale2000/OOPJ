
class Vehicle {
    void displaySpeed() {
        System.out.println("Vehicle speed unknown");
    }
}


class Car extends Vehicle {
    @Override
    void displaySpeed() {
        System.out.println("Car speed 120 km/h");
    }
}


class Bike extends Vehicle {
    @Override
    void displaySpeed() {
        System.out.println("Bike speed 80 km/h");
    }
}


public class SpeedDisplayQ17 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.displaySpeed();   
        bike.displaySpeed();  
    }
}
