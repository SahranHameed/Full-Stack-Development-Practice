// Task 03 - Bank Account Transfer System
// Thread 1: Account A -> Account B
// Thread 2: Account B -> Account A
// synchronized keyword used on the account objects themselves,
// deadlock shown first, then prevented with consistent lock ordering.

public class Task03_BankTransferSystem {

    static class Account {
        int id;
        String label;
        double balance;

        Account(int id, String label, double balance) {
            this.id = id;
            this.label = label;
            this.balance = balance;
        }
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println("PART A - Deadlock Scenario");
        System.out.println("----------------------------");
        showDeadlockScenario();

        System.out.println();
        System.out.println("PART B - Deadlock Prevented");
        System.out.println("----------------------------");
        showPreventedScenario();
    }

    static void showDeadlockScenario() throws InterruptedException {

        Account accountA = new Account(1, "Account A", 1000);
        Account accountB = new Account(2, "Account B", 1000);

        Thread thread1 = new Thread(() -> {
            synchronized (accountA) {
                System.out.println("Thread1 locked A, waiting for B...");
                try { Thread.sleep(200); } catch (InterruptedException e) {}
                synchronized (accountB) {
                    accountA.balance -= 300;
                    accountB.balance += 300;
                    System.out.println("Thread1: A->B transfer done");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (accountB) {
                System.out.println("Thread2 locked B, waiting for A...");
                try { Thread.sleep(200); } catch (InterruptedException e) {}
                synchronized (accountA) {
                    accountB.balance -= 200;
                    accountA.balance += 200;
                    System.out.println("Thread2: B->A transfer done");
                }
            }
        });

        thread1.setDaemon(true);
        thread2.setDaemon(true);

        thread1.start();
        thread2.start();

        thread1.join(3000);
        thread2.join(3000);

        if (thread1.isAlive() && thread2.isAlive()) {
            System.out.println("Deadlock confirmed - Thread1 has A waiting for B, Thread2 has B waiting for A.");
        } else {
            System.out.println("No deadlock this time, timing can vary.");
        }
    }

    // Fix: both threads always lock the lower id account first.
    static void showPreventedScenario() throws InterruptedException {

        Account accountA = new Account(1, "Account A", 1000);
        Account accountB = new Account(2, "Account B", 1000);

        Thread thread1 = new Thread(() -> transfer(accountA, accountB, 300, "Thread1"));
        Thread thread2 = new Thread(() -> transfer(accountB, accountA, 200, "Thread2"));

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("Final balance:");
        System.out.println(accountA.label + " = Rs." + accountA.balance);
        System.out.println(accountB.label + " = Rs." + accountB.balance);
    }

    static void transfer(Account from, Account to, double amount, String threadName) {

        Account first  = (from.id < to.id) ? from : to;
        Account second = (from.id < to.id) ? to : from;

        synchronized (first) {
            synchronized (second) {
                if (from.balance >= amount) {
                    from.balance -= amount;
                    to.balance += amount;
                    System.out.println(threadName + ": Rs." + amount + " transferred " +
                        from.label + " -> " + to.label +
                        " | A=" + (from.id == 1 ? from.balance : to.balance) +
                        " B=" + (from.id == 2 ? from.balance : to.balance));
                } else {
                    System.out.println(threadName + ": insufficient balance in " + from.label);
                }
            }
        }
    }
}

