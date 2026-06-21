import java.util.Scanner;

/**
 * Task 10 - Simple Calculator using Switch
 * Performs basic arithmetic operations using switch statement.
 */

public class SimpleCalculator {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter the First Number : ");
            double number1 = input.nextDouble();

            System.out.print("Enter the Second Number: ");
            double number2 = input.nextDouble();

            System.out.print("Enter Operator (+, -, *, /): ");
            char operator = input.next().charAt(0);

            // Perform operation using switch statement
            System.out.println();
            switch (operator) {
                case '+':
                    System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
                    break;
                case '-':
                    System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
                    break;
                case '*':
                    System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
                    break;
                case '/':
                    if (number2 != 0) {
                        System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
                    } else {
                        System.out.println("⚠ Cannot divide by zero!");
                    }
                    break;
                default:
                    System.out.println("⚠ Invalid Operator! Use +, -, *, / only.");
            }

            System.out.println("=============================");
        }
    }
}
