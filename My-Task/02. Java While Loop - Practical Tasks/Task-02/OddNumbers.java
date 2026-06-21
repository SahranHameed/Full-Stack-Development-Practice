import java.util.Scanner;

/**
 * Task 02 - Print Odd Numbers between 1 and 50
 * Prints all odd numbers between 1 and 50 using a while loop.
 */

public class OddNumbers {
    public static void main(String[] args) {

        int number = 1;

        // Print odd numbers between 1 and 50
        while (number <= 50) {
            if (number % 2 != 0) {
                System.out.print(number + "\n");
            }
            number++;
        }

        System.out.println("\n=============================");
    }
}
