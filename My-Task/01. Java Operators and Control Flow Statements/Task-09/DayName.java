import java.util.Scanner;
/**
 * Task 09 - Day Name using Switch
 * Displays the day name based on the day number entered by the user.
 */
public class DayName {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter Day Number (1-7): ");
            int day = input.nextInt();

            // Display day name using switch statement
            System.out.println();
            switch (day) {
                case 1:
                    System.out.println("Day " + day + " : Monday");
                    break;
                case 2:
                    System.out.println("Day " + day + " : Tuesday");
                    break;
                case 3:
                    System.out.println("Day " + day + " : Wednesday");
                    break;
                case 4:
                    System.out.println("Day " + day + " : Thursday");
                    break;
                case 5:
                    System.out.println("Day " + day + " : Friday");
                    break;
                case 6:
                    System.out.println("Day " + day + " : Saturday");
                    break;
                case 7:
                    System.out.println("Day " + day + " : Sunday");
                    break;
                default:
                    System.out.println("Invalid Day! Enter a number between 1 and 7.");
            }
            System.out.println("=============================");
        }
    }
}
