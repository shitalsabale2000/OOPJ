import java.util.Scanner;
public class ArmstrongCheck41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }
    }
}


// ArmstrongCheck Ternary opeartor
    

        // String result = (sum == original) ? original + " is an Armstrong number" : original + " is not an Armstrong number";
        // System.out.println(result);
	// }
