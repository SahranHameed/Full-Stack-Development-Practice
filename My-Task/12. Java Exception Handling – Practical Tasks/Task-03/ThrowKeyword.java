import java.util.Scanner;

/*
  Task 03 - Throw Keyword
  Accepts a student's age.
  If age is less than 18, explicitly throws an IllegalArgumentException
  using the throw keyword.
*/
public class ThrowKeyword {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the student age: ");
            int age = scanner.nextInt();

            validateAge(age);

            System.out.println("Age accepted. Student is eligible.");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    /*
      Validates the student's age.
      Explicitly throws an exception if age is less than 18.
    */
    private static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException(
                "Age must be 18 or above. Student is not eligible.");
        }
    }
}
