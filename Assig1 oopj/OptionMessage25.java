import java.util.Scanner;

public class OptionMessage25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1–5): ");
        int num = sc.nextInt();

        switch (num) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("You selected option " + num + ".");
                break;
            default:
                System.out.println("Invalid option.");
        }
    }
}
