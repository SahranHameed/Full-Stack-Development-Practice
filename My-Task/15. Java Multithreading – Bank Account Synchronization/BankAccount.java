/*
 Represents a simple bank account.
 Encapsulates account details and provides a withdraw() method
 that throws InsufficientBalanceException when funds are insufficient.
*/
public class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    /*
      Attempts to withdraw the given amount from the account.
      Throws InsufficientBalanceException if the amount exceeds the balance.
    */
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance. Available balance is Rs." + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful!");
        System.out.println("Remaining Balance: Rs." + balance);
    }
}
