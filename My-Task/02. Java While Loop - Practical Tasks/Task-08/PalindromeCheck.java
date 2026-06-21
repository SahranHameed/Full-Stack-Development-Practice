import java.util.Scanner;

/**
 * Task 08 - Palindrome Number Checker
 * Checks whether a given number is a palindrome or not using a while loop.
 * Example: 121 → Palindrome | 123 → Not Palindrome
 */

public class PalindromeCheck {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter a Number: ");
            int number = input.nextInt();

            int originalNumber = number;
            int reversedNumber = 0;
            int remainder;

            // Reverse the number using while loop
            while (number != 0) {
                remainder = number % 10;
                reversedNumber = reversedNumber * 10 + remainder;
                number = number / 10;
            }

            // Check if original and reversed are equal
            System.out.println();
            if (originalNumber == reversedNumber) {
                System.out.println(originalNumber + " is a Palindrome Number");
            } else {
                System.out.println(originalNumber + " is Not a Palindrome Number");
            }

            System.out.println("=============================");
        }
    }
}
