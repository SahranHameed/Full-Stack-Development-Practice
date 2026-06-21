import java.util.Scanner;

/**
 * Task 07 - Factorial of a Number
 * Finds the factorial of a given number using a while loop.
 * Example: 5! = 5 x 4 x 3 x 2 x 1 = 120
 */

public class Factorial {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter a Number: ");
            int number = input.nextInt();

            // Validate input
            System.out.println();
            if (number < 0) {
                System.out.println("Invalid Input! Factorial is not defined for negative numbers.");
            } else {
                long factorial = 1;
                int i = 1;

                // Calculate factorial using while loop
                while (i <= number) {
                    factorial *= i;
                    i++;
                }

                System.out.println("Number    : " + number);
                System.out.println(number + "! = " + factorial);
            }

            System.out.println("=============================");
        }
    }
}
