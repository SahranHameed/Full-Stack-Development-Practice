import java.util.Scanner;

/**
 * Task 03 - Sum of Even Numbers from 1 to N
 * Finds the sum of all even numbers from 1 to a user-entered number.
 */

public class SumOfEven {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter the Value of N: ");
            int n = input.nextInt();

            // Validate input
            System.out.println();
            if (n <= 0) {
                System.out.println("Invalid Input! Please enter a positive number.");
 
            } else {
                int number = 1;
                int sum = 0;

                // Find sum of even numbers using while loop
                while (number <= n) {
                    if (number % 2 == 0) {
                        sum += number;
                    }
                    number++;
                }

                System.out.println("Sum of Even Numbers from 1 to " + n + " = " + sum);
            }

            System.out.println("=============================");
        }
    }
}