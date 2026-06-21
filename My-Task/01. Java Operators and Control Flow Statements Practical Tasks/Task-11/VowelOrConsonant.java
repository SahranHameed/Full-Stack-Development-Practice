import java.util.Scanner;

/**
 * Task 11 - Vowel or Consonant Checker
 * Checks whether the entered character is a vowel or consonant.
 */

public class VowelOrConsonant {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter a Character: ");
            char ch = input.next().toLowerCase().charAt(0);

            // Check if character is a letter first
            System.out.println();
            if (!Character.isLetter(ch)) {
                System.out.println("Invalid Input! Please enter a letter (a-z).");

            } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("'" + ch + "' is a Vowel");

            } else {
                System.out.println("'" + ch + "' is a Consonant");
            }

            System.out.println("=============================");
        }
    }
}
