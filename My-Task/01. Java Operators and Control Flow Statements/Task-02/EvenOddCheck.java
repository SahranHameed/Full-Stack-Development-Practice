import java.util.Scanner;

/*
 * Task 02 - Even or Odd Checker
 * Checks whether the entered number is even or odd.
*/

public class EvenOddCheck 
{ 
    public static void main(String args[])
    {
        try(Scanner input = new Scanner(System.in))
        {
            System.out.print("Enter the Number: ");
            int number = input.nextInt();

        // Check divisibility by 2
            if (number % 2 == 0) {
                    System.out.println("\n" + number + " is an Even Number");
            }  else {
                    System.out.println("\n" + number + " is an Odd Number");
                  }
                   System.out.println("=============================");
        }
    }
}