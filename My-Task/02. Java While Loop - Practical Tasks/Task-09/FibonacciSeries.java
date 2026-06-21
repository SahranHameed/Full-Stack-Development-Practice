import java.util.Scanner;

/**
 * Task 09 - Fibonacci Series
 * Generates Fibonacci series up to n terms using a while loop.
 * Example: 0, 1, 1, 2, 3, 5, 8, 13...
 */

public class FibonacciSeries {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter Number of Terms (N): ");
            int n = input.nextInt();

            // Validate input
            System.out.println();
            if (n <= 0) {
                System.out.println("Invalid Input! Please enter a positive number.");
            } else {
                int first = 0;
                int second = 1;
                int count = 1;

                System.out.print("Fibonacci Series: ");

                // Generate Fibonacci series using while loop
                while (count <= n) {
                    System.out.print(first + " ");
                    int next = first + second;
                    first = second;
                    second = next;
                    count++;
                }
                System.out.println();
            }

            System.out.println("=============================");
        }
    }
}
