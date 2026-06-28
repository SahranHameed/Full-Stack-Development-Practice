/*
  Task 08 - Java Encapsulation
  BankAccount class with:
    - Private attributes (cannot access directly from outside)
    - Getter & Setter methods (controlled access)
    - deposit() and withdraw() with validation
*/
public class BankAccount {

    // ─────────────────────────────────────────
    // Private Attributes — hidden from outside
    // ─────────────────────────────────────────
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // ─────────────────────────────────────────
    // Getter Methods — read private values
    // ─────────────────────────────────────────
    public String getAccountNumber()     { return accountNumber; }
    public String getAccountHolderName() { return accountHolderName; }
    public double getBalance()           { return balance; }

    // ─────────────────────────────────────────
    // Setter Methods — update private values
    // ─────────────────────────────────────────
    public void setAccountNumber(String accountNumber)         { this.accountNumber = accountNumber; }
    public void setAccountHolderName(String accountHolderName) { this.accountHolderName = accountHolderName; }
    public void setBalance(double balance)                     { this.balance = balance; }

    // ─────────────────────────────────────────
    // deposit() — add money to balance
    // ─────────────────────────────────────────
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful! Amount Added: Rs." + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // ─────────────────────────────────────────
    // withdraw() — deduct money (if balance is enough)
    // ─────────────────────────────────────────
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal Successful! Amount Deducted: Rs." + amount);
        } else if (balance < amount) {
            System.out.println("Insufficient funds! Current Balance: Rs." + balance);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // ─────────────────────────────────────────
    // Display all account information
    // ─────────────────────────────────────────
    public void displayAccountDetails() {
        System.out.println("Account Number      : " + accountNumber);
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Current Balance     : Rs." + balance);
    }

    // ─────────────────────────────────────────
    // Main Method
    // ─────────────────────────────────────────
    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("      BANK ACCOUNT MANAGEMENT");
        System.out.println("========================================\n");

        // Create BankAccount object
        BankAccount account = new BankAccount();

        // Set details using setter methods
        account.setAccountNumber("AC-0086211825");
        account.setAccountHolderName("Sahran Hameed");
        account.setBalance(0);

        System.out.println("Account Created Successfully!\n");

        // Deposit Rs.5000
        account.deposit(5000);

        // Withdraw Rs.2000
        account.withdraw(2000);

        // Display updated details
        System.out.println("\n--- Updated Account Details ---");
        account.displayAccountDetails();

        System.out.println("\n========================================");
    }
}
