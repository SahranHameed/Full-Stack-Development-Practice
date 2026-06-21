/**
 * Task 04 - Right Triangle Star Pattern
 * Prints a right triangle with spaces and odd number of stars.
 * Output:
 * *
 * ***
 * *****
 * *******
 * *********
 */

public class RightTrianglePattern {
    public static void main(String[] args) {

        System.out.println();

        int rows = 5;

        // Outer loop controls each row (1 to 5)
        for (int i = 1; i <= rows; i++) {

            // Print spaces before stars (decreasing spaces)
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

            // Print odd number of stars (1, 3, 5, 7, 9)
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to next line after each row
        }

        System.out.println("=============================");
    }
}
