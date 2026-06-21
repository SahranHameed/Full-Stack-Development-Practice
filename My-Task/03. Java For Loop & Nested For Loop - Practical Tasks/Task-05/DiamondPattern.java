/**
 * Task 05 - Diamond Star Pattern
 * Prints a full diamond shape using nested for loops.
 * Output:
 * *
 * ***
 * *****
 * *******
 * *********
 * *******
 * *****
 * ***
 * *
 */

public class DiamondPattern {
    public static void main(String[] args) {

        System.out.println();

        int rows = 5;

        // ---- Upper Half (including middle row) ----
        for (int i = 1; i <= rows; i++) {

            // Print spaces (decreasing)
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

            // Print odd stars (increasing: 1, 3, 5, 7, 9)
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // ---- Lower Half ----
        for (int i = rows - 1; i >= 1; i--) {

            // Print spaces (increasing)
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

            // Print odd stars (decreasing: 7, 5, 3, 1)
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("=============================");
    }
}
