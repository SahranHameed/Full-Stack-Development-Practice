import java.util.Scanner;

/*
 * Task 06 - Student Pass or Fail
 * Checks whether a student passed or failed based on their exam marks.
 * Pass mark is 50 out of 100.
*/

public class StudentPassOrFail {
    public static void main(String[] args) {

        try(Scanner input = new Scanner(System.in))
        {
            System.out.print("Enter Your Exam Marks (0-100): ");
            int marks = input.nextInt();

      // Validate marks range and check pass or fail
              System.out.println();
              if (marks < 0 || marks > 100) {
                System.out.println("Invalid Marks! Please enter marks between 0 and 100.");
              }
              else if (marks >= 50) {
                System.out.println("Marks : " + marks + " / 100");
                System.out.println("Result: Pass ");
              }
              else {
                System.out.println("Marks : " + marks + " / 100");
                System.out.println("Result: Fail");
                System.out.println("You need " + (50 - marks) + " more mark(s) to pass.");
              }

                System.out.println("==============================");       
        }
    }
}
