import java.util.Scanner;
import java.util.Arrays;

public class SortThree45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];

        System.out.print("Enter three numbers: ");
        for (int i = 0; i < 3; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);
        System.out.println("Ascending order: " + nums[0] + ", " + nums[1] + ", " + nums[2]);
    }
}
