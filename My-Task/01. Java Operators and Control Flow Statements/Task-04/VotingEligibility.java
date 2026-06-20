import java.util.Scanner;

/*
 * Task 04 - Voting Eligibility Checker
 * Checks whether a person is eligible to vote based on their age.
*/

public class VotingEligibility {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter Your Age: ");
            int age = input.nextInt();

            // Validate age and check voting eligibility
            System.out.println();
            if (age < 0 || age > 150) {
                System.out.println("Invalid Age! Please enter a valid age.");

            } else if (age >= 18) {
                System.out.println("Age " + age + ": You are Eligible for Voting.");

            } else {
                System.out.println("You need more " + (18 - age) + "year(s) to be eligible");
            }
            
            System.out.println("==============================");
        }
    }
}