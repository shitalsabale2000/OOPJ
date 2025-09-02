import java.util.Scanner;

public class Greatestnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter score for Test 1: ");
        int test1 = scanner.nextInt();

        System.out.print("Enter score for Test 2: ");
        int test2 = scanner.nextInt();

      
        if (test1 > test2) {
            System.out.println("Test 1 has higher score.");
        } else if (test2 > test1) {
            System.out.println("Test 2 has higher score.");
       
		}
        scanner.close();
    }
}
