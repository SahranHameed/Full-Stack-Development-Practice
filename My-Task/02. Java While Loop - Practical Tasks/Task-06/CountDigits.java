import java.util.Scanner;

/**
 * Task 06 - Count Digits in a Number
 * Counts how many digits are in a given number using a while loop.
 * Example: 12345 → 5 digits
 */

public class CountDigits {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter a Number: ");
            long number = input.nextLong();

            long originalNumber = number;
            int count = 0;

            // Handle zero separately
            if (number == 0) {
                count = 1;
            } else {
                // Count digits using while loop
                number = Math.abs(number); // Handle negative numbers
                while (number != 0) {
                    number = number / 10;
                    count++;
                }
            }

            System.out.println();
            System.out.println("Number         : " + originalNumber);
            System.out.println("Total Digits   : " + count);
            System.out.println("=============================");
        }
    }
}
