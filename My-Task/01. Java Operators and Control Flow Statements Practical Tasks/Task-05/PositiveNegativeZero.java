import java.util.Scanner;

/*
 * Task 05 - Positive Negative Zero Checker
 * Determines whether the entered number is positive, negative, or zero.
*/

public class PositiveNegativeZero {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter Your Number: ");
            int number = input.nextInt();

            // Check whether the number is positive, negative, or zero
            System.out.println();
            if (number > 0) {
                System.out.println(number + " is a Positive Number.");

            } else if (number < 0) {
                System.out.println(number + " is a Negative Number.");

            } else {
                System.out.println(number + " is Zero");
            }

            System.out.println("==============================");
        }
    }
}
