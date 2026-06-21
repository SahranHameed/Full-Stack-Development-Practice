import java.util.Scanner;

/**
 * Task 10 - Menu Driven Calculator
 * A calculator using while loop that continues until the user chooses to exit.
 */

public class MenuCalculator {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            int choice = 0;

            // Keep running until user enters 5 to exit
            while (choice != 5) {

                System.out.println();
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exit");
                System.out.println("-----------------------------");
                System.out.print("Enter Your Choice (1-5): ");
                choice = input.nextInt();

                // Exit condition
                if (choice == 5) {
                    System.out.println();
                    System.out.println("Thank you for using the Calculator!");
                    System.out.println("=============================");
                    break;
                }

                // Get numbers for calculation
                System.out.print("Enter the First Number : ");
                double number1 = input.nextDouble();

                System.out.print("Enter the Second Number: ");
                double number2 = input.nextDouble();

                // Perform selected operation
                System.out.println();
                switch (choice) {
                    case 1:
                        System.out.println("Result: " + number1 + " + " + number2 + " = " + (number1 + number2));
                        break;
                    case 2:
                        System.out.println("Result: " + number1 + " - " + number2 + " = " + (number1 - number2));
                        break;
                    case 3:
                        System.out.println("Result: " + number1 + " * " + number2 + " = " + (number1 * number2));
                        break;
                    case 4:
                        if (number2 != 0) {
                            System.out.println("Result: " + number1 + " / " + number2 + " = " + (number1 / number2));
                        } else {
                            System.out.println("Cannot divide by zero!");
                        }
                        break;
                    default:
                        System.out.println("Invalid Choice! Please enter a number between 1 and 5.");
                }

                System.out.println("-----------------------------");
            }
        }
    }
}
