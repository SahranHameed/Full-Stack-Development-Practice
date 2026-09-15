import java.util.Scanner;

public class Bank_Loan {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            System.out.print("Enter Your Salary: ");
            int salary = scan.nextInt();

            System.out.print("Enter Your Age: ");
            int age = scan.nextInt();

            System.out.print("Enter Loan Amount: ");
            int loanAmount = scan.nextInt();

            if (loanAmount > 500000) {
                System.out.println("You Cannot get a loan more than 500000");
            }

            else if (salary >= 20000 && age >= 25){
                System.out.println("You are eligible for a loan");
            }

            else {
                    System.out.println("You are not eligible for a loan");
            }

            }
        }
    }
    
    



