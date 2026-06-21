import java.util.Scanner;

/**
 * Task 01 - Print Numbers 1 to 100
 * Prints all numbers from 1 to 100 using a while loop.
 */

public class PrintOneToHundred {
    public static void main(String[] args) {

        int number = 1;

        // Print numbers from 1 to 100 using while loop
        while (number <= 100) {
            System.out.print(number + "\n");
            number++;
        }
        System.out.println("\n=============================");
    }
}
