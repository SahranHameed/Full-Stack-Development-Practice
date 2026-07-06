import java.util.Scanner;

/*
  Demonstrates the use of the custom InsufficientBalanceException
  with a BankAccount object.
*/
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount account = new BankAccount("AC1001", "Sahran Hameed", 5000.0);

        System.out.println("Account Number : " + account.getAccountNumber());
        System.out.println("Account Holder : " + account.getAccountHolderName());
        System.out.println("Current Balance: Rs." + account.getBalance());

        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();

        try {
            account.withdraw(amount);
        } catch (InsufficientBalanceException e) {
            // Handle the custom exception without crashing the program
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
