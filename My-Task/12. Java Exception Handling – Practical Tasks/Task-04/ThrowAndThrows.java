import java.util.Scanner;

/*
  Task 04 - Throw and Throws
  Checks whether a number is positive.
  Uses a method with "throws Exception" in its declaration and
  "throw" to generate an exception for negative numbers.
  The exception is handled in the calling method.
*/
public class ThrowAndThrows {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a Number: ");
            int number = scanner.nextInt();

            checkPositive(number);

        } catch (Exception e) {
            // Exception handled in the calling method (main)
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    /*
      Declares "throws Exception" and uses "throw" internally
      when the number is negative.
    */
    private static void checkPositive(int number) throws Exception {
        if (number < 0) {
            throw new Exception("Number must be positive.");
        }
        System.out.println(number + " is a positive number.");
    }
}
