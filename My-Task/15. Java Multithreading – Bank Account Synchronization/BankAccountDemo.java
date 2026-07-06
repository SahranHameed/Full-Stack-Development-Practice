/*
  Demonstrates multiple threads performing deposits and withdrawals
  on a shared BankAccount, verifying that synchronization keeps
  the balance consistent and never negative.
*/
public class BankAccountDemo {

    public static void main(String[] args) throws InterruptedException {
        // Single shared BankAccount instance
        BankAccount account = new BankAccount("AC001", "Sahran Hameed", 5000.0);

        Runnable depositTask1  = () -> account.deposit(1000.0);
        Runnable withdrawTask1 = () -> account.withdraw(2000.0);
        Runnable depositTask2  = () -> account.deposit(1500.0);
        Runnable withdrawTask2 = () -> account.withdraw(8000.0); // will be declined

        Thread t1 = new Thread(depositTask1, "Thread-1");
        Thread t2 = new Thread(withdrawTask1, "Thread-2");
        Thread t3 = new Thread(depositTask2, "Thread-3");
        Thread t4 = new Thread(withdrawTask2, "Thread-4");

        // Start all threads to simulate concurrent transactions
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // Wait for all threads to complete
        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println("Final Balance: Rs." + account.getBalance());
    }
}

// Simple BankAccount implementation to support the demo
class BankAccount {
  private final String id;
  private final String owner;
  private double balance;

  public BankAccount(String id, String owner, double balance) {
    this.id = id;
    this.owner = owner;
    this.balance = balance;
  }

  public synchronized void deposit(double amount) {
    if (amount <= 0) return;
    double old = balance;
    balance += amount;
    System.out.println(Thread.currentThread().getName() + " deposited Rs." + amount + " to " + owner + " (" + id + ") | " + old + " -> " + balance);
  }

  public synchronized void withdraw(double amount) {
    if (amount <= 0) return;
    if (balance >= amount) {
      double old = balance;
      balance -= amount;
      System.out.println(Thread.currentThread().getName() + " withdrew Rs." + amount + " from " + owner + " (" + id + ") | " + old + " -> " + balance);
    } else {
      System.out.println(Thread.currentThread().getName() + " attempted to withdraw Rs." + amount + " for " + owner + " (" + id + ") but insufficient funds (Balance: Rs." + balance + ")");
    }
  }

  public synchronized double getBalance() {
    return balance;
  }
}
