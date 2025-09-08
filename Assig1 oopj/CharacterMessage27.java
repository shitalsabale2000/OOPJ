import java.util.Scanner;

public class CharacterMessage27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character (A–E): ");
        String input = sc.next();  // Read full string

        // Convert to uppercase to handle lowercase input
        input = input.toUpperCase();

        switch (input) {
            case "A":
            case "B":
            case "C":
            case "D":
            case "E":
                System.out.println("You selected option " + input + ".");
                break;
            default:
                System.out.println("Invalid character.");
        }
    }
}
