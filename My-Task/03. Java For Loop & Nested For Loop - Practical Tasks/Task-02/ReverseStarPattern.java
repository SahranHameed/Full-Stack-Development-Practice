/**
 * Task 02 - Reverse Star Pattern Printing
 * Prints a decreasing star pattern using nested for loops.
 * Output:
 * *****
 * ****
 * ***
 * **
 * *
 */

public class ReverseStarPattern {
    public static void main(String[] args) {

        System.out.println();

        // Outer loop starts from 5 and decreases to 1
        for (int i = 5; i >= 1; i--) {

            // Inner loop prints stars based on current row value
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to next line after each row
        }

        System.out.println("=============================");
    }
}
