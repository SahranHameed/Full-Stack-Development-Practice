/**
 * Task 01 - Star Pattern Printing
 * Prints an increasing star pattern using nested for loops.
 * Output:
 * *
 * **
 * ***
 * ****
 * *****
 */

public class StarPattern {
    public static void main(String[] args) {

        System.out.println();

        // Outer loop controls the rows (1 to 5)
        for (int i = 1; i <= 5; i++) {

            // Inner loop prints stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to next line after each row
        }

        System.out.println("=============================");
    }
}
