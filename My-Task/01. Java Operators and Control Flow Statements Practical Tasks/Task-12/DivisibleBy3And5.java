import java.util.Scanner;

/**
 * Task 12 - Divisible by 3 and 5 Checker
 * Checks whether a number is divisible by both 3 and 5.
 */

public class DivisibleBy3And5 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter Your Number: ");
            int number = input.nextInt();

            // Check divisibility by both 3 and 5
            System.out.println();
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println(number + " is Divisible by Both 3 and 5");

            } else if (number % 3 == 0) {
                System.out.println(number + " is Divisible by 3 only.");

            } else if (number % 5 == 0) {
                System.out.println(number + " is Divisible by 5 only.");

            } else {
                System.out.println(number + " is Not Divisible by 3 or 5");
            }

            System.out.println("=============================");
        }
    }
}