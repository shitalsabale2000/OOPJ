import java.util.*;
public class Mobile2 {
    // Instance variable to store mobile model
    String model;

    // Static variable to count total mobiles
    static int totalMobiles = 0;

    // Constructor: sets model and increases total count
    Mobile(String modelName) {
        model = modelName;
        totalMobiles++;
    }

    // Getter method to show model name
    String getModel() {
        return model;
    }

    // Static method to show total mobiles
    static void showTotalMobiles() {
        System.out.println("Total mobiles in stock: " + totalMobiles);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile("Samsung Galaxy M32");
        Mobile mobile2 = new Mobile("Redmi Note 12");

        System.out.println("Mobile1 model: " + mobile1.getModel());
        System.out.println("Mobile2 model: " + mobile2.getModel());

        showTotalMobiles();
    }
}
