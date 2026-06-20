import java.util.Scanner;

/*
 * Task 01 - Arithmetic Operations
 * Performs addition, subtraction, multiplication, and division
 * of two numbers entered by the user.
*/

public class ArithmeticOperators {
    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in))

        // ---------- Input Section ----------
        {
            System.out.println("Enter the First Number: ");
            double firstNumber = input.nextDouble();

            System.out.println("Enter the Second Number: ");
            double secondNumber = input.nextDouble();

            // ------------- Calculation Section -------------//

            double addition = firstNumber + secondNumber;
            double subtraction = firstNumber - secondNumber;
            double multiplication = firstNumber * secondNumber;

            // ------------- Output Section -------------//

            System.out.println("\n------------ Results ------------");
            System.out.println("Addition: " + firstNumber + " + " + secondNumber + " = " + addition);
            System.out.println("Subtraction: " + firstNumber + " - " + secondNumber + " = " + subtraction);
            System.out.println("Multiplication: " + firstNumber + " * " + secondNumber + " = " + multiplication);

            // Division — zero check //
            if (secondNumber != 0) {
                double division = firstNumber / secondNumber;
                System.out.println("Division: " + firstNumber + " / " + secondNumber + " = " + division);
            } else {
                System.out.println("Division: Cannot divide by zero!");
            }
            System.out.println("--------------------------------------------");
        }
    }
}

