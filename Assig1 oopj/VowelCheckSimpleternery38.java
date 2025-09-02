import java.util.Scanner;

public class VowelCheckSimpleternery38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String input = sc.next().toLowerCase();  // Read input and convert to lowercase

        String result = (input.equals("a") || input.equals("e") || input.equals("i") ||
                         input.equals("o") || input.equals("u")) ? "Vowel" : "Consonant";

        System.out.println(result);
    }
}
