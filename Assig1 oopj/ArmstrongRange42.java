public class ArmstrongRange42 {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 100 and 500:");
        for (int num = 100; num <= 500; num++) {
            int original = num;
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum += digit * digit * digit;
                num /= 10;
            }

            if (sum == original) {
                System.out.println(original);
            }

            num = original; // Reset num for next iteration
        }
    }
}
