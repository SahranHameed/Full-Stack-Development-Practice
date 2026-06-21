/**
 * Task 03 - Number Pattern Printing
 * Prints an increasing number pattern using nested for loops.
 * Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 */

public class NumberPattern {
    public static void main(String[] args) {

        System.out.println();

        // Outer loop controls the rows (1 to 5)
        for (int i = 1; i <= 5; i++) {

            // Inner loop prints numbers from 1 to current row number
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println(); // Move to next line after each row
        }

        System.out.println("=============================");
    }
}
