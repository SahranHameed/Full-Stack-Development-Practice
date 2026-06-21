import java.util.Scanner;

/**
 * Task 07 - Bigger Number using if-else
 * Compares two numbers entered by the user
 * and displays the bigger one.
 */

public class BiggerNumber {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter the First Number: ");
            int number1 = input.nextInt();

            System.out.print("Enter the Second Number: ");
            int number2 = input.nextInt();

            // Compare two numbers and find the bigger one
            System.out.println();
            if (number1 > number2) {
                System.out.println(number1 + " is the Bigger Number");

            } else if (number2 > number1) {
                System.out.println(number2 + " is the Bigger Number");

            } else {
                System.out.println("Both Numbers are Equal: " + number1);
            }

            System.out.println("=============================");
        }
    }
}