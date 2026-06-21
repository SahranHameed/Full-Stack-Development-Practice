import java.util.Scanner;

/*
 * Task 03 - Largest of Two Numbers
 * Compares two numbers and displays the largest.
*/

public class LargestOfTwo {
    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter First Number: ");
            int number1 = input.nextInt();

            System.out.print("Enter the Second Number: ");
            int number2 = input.nextInt();

            // Compare two numbers and find the largest
            System.out.println();
            if (number1 > number2) {
                System.out.println("\n" + number1 + " is the Largest Number");

            } else if (number2 > number1) {
                System.out.println(number2 + " is the Largest Number");

            } else {
                System.out.println("\n" + " Both Numbers are Equal: " + number1);
            }
            
            System.out.println("=============================");
        }
    }
}