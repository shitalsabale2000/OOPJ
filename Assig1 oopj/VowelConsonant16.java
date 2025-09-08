// 16. Vowel or Consonant Checker 
// Scenario: Take a character input and print whether it is a vowel or consonant. Print error for invalid 
// input. 
// Input: 
// Enter a character: e 
// Output: Vowel

import java.util.Scanner;

public class VowelConsonant16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}