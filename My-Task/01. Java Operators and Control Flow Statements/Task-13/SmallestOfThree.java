import java.util.Scanner;

/**
 * Task 13 - Smallest of Three Numbers
 * Finds and displays the smallest among three numbers entered by the user.
 */

public class SmallestOfThree {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter the First Number : ");
            int number1 = input.nextInt();

            System.out.print("Enter the Second Number: ");
            int number2 = input.nextInt();

            System.out.print("Enter the Third Number : ");
            int number3 = input.nextInt();

            // Find the smallest using nested if-else
            System.out.println();
            if (number1 <= number2 && number1 <= number3) {
                System.out.println(number1 + " is the Smallest Number");

            } else if (number2 <= number1 && number2 <= number3) {
                System.out.println(number2 + " is the Smallest Number");

            } else {
                System.out.println(number3 + " is the Smallest Number");
            }

            System.out.println("=============================");
        }
    }
}
