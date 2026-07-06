/*
  Custom checked exception thrown when a withdrawal amount
  exceeds the available balance in a BankAccount.
*/
public class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
