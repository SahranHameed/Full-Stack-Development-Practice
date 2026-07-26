// Task 01 - Printer and Scanner Resource Management
// Part A shows an actual deadlock, Part B shows how I fixed it using
// lock ordering + wait()/notifyAll().

class Printer {
    boolean busy = false;
}

class Scanner {
    boolean busy = false;
}

public class PrinterScanner {

    // used only by the deadlock demo
    static Printer printer = new Printer();
    static Scanner scanner = new Scanner();

    public static void main(String[] args) throws InterruptedException {

        System.out.println("PART A - Deadlock Demo");
        System.out.println("------------------------");
        showDeadlock();

        System.out.println();
        System.out.println("PART B - Fixed Version (no deadlock)");
        System.out.println("------------------------");
        showFixedVersion();
    }

    // User1 grabs Printer first then wants Scanner.
    // User2 grabs Scanner first then wants Printer.
    // Both sleep a bit in between so they end up waiting on each other = deadlock.
    static void showDeadlock() throws InterruptedException {

        Thread user1 = new Thread(() -> {
            synchronized (printer) {
                System.out.println("User1 locked Printer, waiting for Scanner...");
                try { Thread.sleep(200); } catch (InterruptedException e) {}
                synchronized (scanner) {
                    System.out.println("User1 got both resources"); // never reaches here
                }
            }
        });

        Thread user2 = new Thread(() -> {
            synchronized (scanner) {
                System.out.println("User2 locked Scanner, waiting for Printer...");
                try { Thread.sleep(200); } catch (InterruptedException e) {}
                synchronized (printer) {
                    System.out.println("User2 got both resources"); // never reaches here
                }
            }
        });

        // daemon so they don't stop the JVM from exiting once they get stuck
        user1.setDaemon(true);
        user2.setDaemon(true);

        user1.start();
        user2.start();

        // give them a few seconds, they should still be blocked after this
        user1.join(3000);
        user2.join(3000);

        if (user1.isAlive() && user2.isAlive()) {
            System.out.println("Deadlock confirmed - both threads are still stuck waiting on each other.");
        } else {
            System.out.println("No deadlock happened this run, try again (timing can vary).");
        }
    }

    // Fix: both users lock Printer first, then Scanner - same order every time.
    // Also using wait()/notifyAll() so a user waits if a resource is currently busy.
    static void showFixedVersion() throws InterruptedException {

        Printer p = new Printer();
        Scanner s = new Scanner();

        Thread user1 = new Thread(() -> useDevices(p, s, "User1"));
        Thread user2 = new Thread(() -> useDevices(p, s, "User2"));

        user1.start();
        user2.start();
        user1.join();
        user2.join();

        System.out.println("Both users finished, no deadlock this time.");
    }

    static void useDevices(Printer p, Scanner s, String user) {
        try {
            synchronized (p) {
                while (p.busy) {
                    System.out.println(user + " waiting, printer busy...");
                    p.wait();
                }
                p.busy = true;
                System.out.println(user + " is using the printer");
            }
            Thread.sleep(100);

            synchronized (s) {
                while (s.busy) {
                    System.out.println(user + " waiting, scanner busy...");
                    s.wait();
                }
                s.busy = true;
                System.out.println(user + " is using the scanner");
            }
            Thread.sleep(100);

            // release scanner
            synchronized (s) {
                s.busy = false;
                s.notifyAll();
            }
            // release printer
            synchronized (p) {
                p.busy = false;
                p.notifyAll();
            }

            System.out.println(user + " done with printer and scanner");

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
