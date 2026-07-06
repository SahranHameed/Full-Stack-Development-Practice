import java.util.InputMismatchException;
import java.util.Scanner;

/*
  Task 01 - Built-in Exception Handling
  Accepts two integers and performs division.
  Handles ArithmeticException (division by zero) and
  InputMismatchException (invalid input) using built-in exception handling.
*/
public class DivisionException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first integer: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the second integer: ");
            int denominator = scanner.nextInt();

            int result = numerator / denominator;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Occurs when dividing by zero
            System.out.println("Error: Cannot divide by zero.");

        } catch (InputMismatchException e) {
            // Occurs when input is not a valid integer
            System.out.println("Error: Please enter valid integers only.");
        
        } finally {
            scanner.close();
        }
    }
}
