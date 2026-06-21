import java.util.Scanner;

/**
 * Task 08 - Grade Calculator
 * Calculates the grade of a student based on their marks
 * using else-if conditions.
 */

public class GradeCalculator {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter Your Marks (0-100): ");
            int marks = input.nextInt();

            // Validate marks and calculate grade
            System.out.println();
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid Marks! Enter a value between 0 and 100.");

            } else if (marks >= 90) {
                System.out.println("Marks : " + marks + " / 100");
                System.out.println("Grade : A (Excellent)");

            } else if (marks >= 80) {
                System.out.println("Marks : " + marks + " / 100");
                System.out.println("Grade : B (Very Good)");

            } else if (marks >= 70) {
                System.out.println("Marks : " + marks + " / 100");
                System.out.println("Grade : C (Good)");

            } else if (marks >= 60) {
                System.out.println("Marks : " + marks + " / 100");
                System.out.println("Grade : D (Average)");

            } else if (marks >= 50) {
                System.out.println("Marks : " + marks + " / 100");
                System.out.println("Grade : E (Pass)");

            } else {
                System.out.println("Marks : " + marks + " / 100");
                System.out.println("Grade : F (Fail)");
                System.out.println("You need " + (50 - marks) + " more mark(s) to pass.");
            }
            System.out.println("=============================");
        }
    }
}
