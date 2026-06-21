import java.util.Scanner;

/**
 * Task 05 - Reverse a Number
 * Reverses the digits of a given number using a while loop.
 * Example: 1234 → 4321
 */

public class ReverseNumber {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter a Number: ");
            int number = input.nextInt();

            int originalNumber = number;
            int reversedNumber = 0;
            int remainder;

            // Reverse the number using while loop
            while (number != 0) {
                remainder = number % 10; // Get last digit
                reversedNumber = reversedNumber * 10 + remainder; // Build reversed number
                number = number / 10; // Remove last digit
            }

            System.out.println();
            System.out.println("Original Number : " + originalNumber);
            System.out.println("Reversed Number : " + reversedNumber);
            System.out.println("=============================");
        }
    }
}
