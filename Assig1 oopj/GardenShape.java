import java.util.Scanner;

public class GardenShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter length: ");
        int length = scanner.nextInt();

        System.out.print("Enter breadth: ");
        int breadth = scanner.nextInt();

      
        if (length == breadth) {
            System.out.println("Square garden");
        } else {
            System.out.println("Rectangular garden");
        }

        scanner.close();
    }
}