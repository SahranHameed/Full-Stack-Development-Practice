import java.util.InputMismatchException;
import java.util.Scanner;

/*
  Task 02 - Finally Block
  Performs division of two numbers.
  The finally block always displays "Program execution completed"
  whether an exception occurs or not.
*/
public class FinallyBlock {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the First Number: ");
            double numerator = scanner.nextDouble();

            System.out.print("Enter the Second Number: ");
            double denominator = scanner.nextDouble();

            double result = numerator / denominator;

            // Note: In Java, double division by zero gives Infinity/NaN
            // instead of throwing ArithmeticException, so we check manually.
            if (denominator == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numbers only.");
        } finally {
            // This block always executes, regardless of an exception
            System.out.println("Program execution completed");
            scanner.close();
        }
    }
}
