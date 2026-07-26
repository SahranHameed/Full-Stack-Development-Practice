// Task 02 - Bank Account Money Transfer
// Shows a deadlock first (locking accounts in different order),
// then a fixed version that locks in a consistent order and uses
// wait()/notifyAll() when balance is not enough.

public class BankTransfer {

    static class BankAccount {
        int id;          // used to decide lock order, smaller id locks first
        String name;
        double balance;

        BankAccount(int id, String name, double balance) {
            this.id = id;
            this.name = name;
            this.balance = balance;
        }
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println("PART A - Deadlock Demo");
        System.out.println("------------------------");
        showDeadlock();

        System.out.println();
        System.out.println("PART B - Fixed Transfer (consistent lock order + wait/notify)");
        System.out.println("------------------------");
        showFixedTransfer();
    }

    // Thread1 locks accountA first then accountB.
    // Thread2 locks accountB first then accountA.
    // Both sleep in between so they get stuck waiting on each other.
    static void showDeadlock() throws InterruptedException {

        BankAccount accountA = new BankAccount(1, "Account A", 1000);
        BankAccount accountB = new BankAccount(2, "Account B", 1000);

        Thread t1 = new Thread(() -> {
            synchronized (accountA) {
                System.out.println("Thread1 locked Account A, waiting for Account B...");
                try { Thread.sleep(200); } catch (InterruptedException e) {}
                synchronized (accountB) {
                    System.out.println("Thread1 got both accounts"); // never happens in deadlock
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (accountB) {
                System.out.println("Thread2 locked Account B, waiting for Account A...");
                try { Thread.sleep(200); } catch (InterruptedException e) {}
                synchronized (accountA) {
                    System.out.println("Thread2 got both accounts"); // never happens in deadlock
                }
            }
        });

        t1.setDaemon(true);
        t2.setDaemon(true);

        t1.start();
        t2.start();

        t1.join(3000);
        t2.join(3000);

        if (t1.isAlive() && t2.isAlive()) {
            System.out.println("Deadlock confirmed - both threads stuck waiting for each other's lock.");
        } else {
            System.out.println("No deadlock this run, timing can vary - try running again.");
        }
    }

    // Fixed version: always lock the account with the smaller id first.
    // This way both threads take locks in the same order, so no deadlock.
    static void showFixedTransfer() throws InterruptedException {

        BankAccount accountA = new BankAccount(1, "Account A", 1000);
        BankAccount accountB = new BankAccount(2, "Account B", 1000);

        Thread t1 = new Thread(() -> {
            try {
                transfer(accountA, accountB, 500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                transfer(accountB, accountA, 300);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final balances:");
        System.out.println(accountA.name + " = Rs." + accountA.balance);
        System.out.println(accountB.name + " = Rs." + accountB.balance);
    }

    static void transfer(BankAccount from, BankAccount to, double amount) throws InterruptedException {

        // always lock the lower-id account first, no matter the transfer direction
        BankAccount first  = (from.id < to.id) ? from : to;
        BankAccount second = (from.id < to.id) ? to : from;

        synchronized (first) {
            synchronized (second) {

                while (from.balance < amount) {
                    System.out.println(from.name + " has insufficient balance, waiting for a deposit...");
                    first.wait(2000); // wait a bit, then re-check (avoids getting stuck forever in this demo)
                    if (from.balance < amount) {
                        System.out.println(from.name + " still short on balance, skipping this transfer.");
                        return;
                    }
                }

                from.balance -= amount;
                to.balance += amount;

                System.out.println("Transferred Rs." + amount + " from " + from.name + " to " + to.name);
                System.out.println(from.name + " balance: Rs." + from.balance);
                System.out.println(to.name + " balance: Rs." + to.balance);

                first.notifyAll();
            }
        }
    }
}
