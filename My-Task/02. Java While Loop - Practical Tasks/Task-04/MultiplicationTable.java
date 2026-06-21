import java.util.Scanner;

/**
 * Task 04 - Multiplication Table
 * Prints the multiplication table of a given number using a while loop.
 */

public class MultiplicationTable {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter a Number: ");
            int number = input.nextInt();

            int i = 1;

            // Print multiplication table using while loop
            System.out.println();
            System.out.println("--- Table of " + number + " ---");
            while (i <= 10) {
                System.out.println(number + " x " + i + " = " + (number * i));
                i++;
            }

            System.out.println("=============================");
        }
    }
}
