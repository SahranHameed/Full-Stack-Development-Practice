import java.util.Scanner;

/**
 * Task 14 - Month Name using Switch
 * Displays the month name based on the month number entered by the user.
 */

public class MonthName {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter Month Number (1-12): ");
            int month = input.nextInt();

            // Display month name using switch statement
            System.out.println();
            switch (month) {
                case 1:
                    System.out.println("Month " + month + " : January");
                    break;
                case 2:
                    System.out.println("Month " + month + " : February");
                    break;
                case 3:
                    System.out.println("Month " + month + " : March");
                    break;
                case 4:
                    System.out.println("Month " + month + " : April");
                    break;
                case 5:
                    System.out.println("Month " + month + " : May");
                    break;
                case 6:
                    System.out.println("Month " + month + " : June");
                    break;
                case 7:
                    System.out.println("Month " + month + " : July");
                    break;
                case 8:
                    System.out.println("Month " + month + " : August");
                    break;
                case 9:
                    System.out.println("Month " + month + " : September");
                    break;
                case 10:
                    System.out.println("Month " + month + " : October");
                    break;
                case 11:
                    System.out.println("Month " + month + " : November");
                    break;
                case 12:
                    System.out.println("Month " + month + " : December");
                    break;
                default:
                    System.out.println("Invalid Month! Enter a number between 1 and 12.");
            }

            System.out.println("=============================");
        }
    }
}
