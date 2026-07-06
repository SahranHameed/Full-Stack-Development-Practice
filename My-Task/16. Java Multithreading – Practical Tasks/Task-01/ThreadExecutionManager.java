/*
  Task 01 - Thread Execution Manager
  Creates 3 threads, uses start(), join(), and isAlive(),
  and synchronizes a method that prints thread details one at a time.
*/
public class ThreadExecutionManager {

    /*
      Synchronized so only one thread prints its details at a time,
      preventing interleaved output.
    */
    public static synchronized void printThreadDetails(String threadName) {
        System.out.println(threadName + " is running...");
        try {
            Thread.sleep(100); // simulate some work
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(threadName + " completed.");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> printThreadDetails("Thread-1"));
        Thread t2 = new Thread(() -> printThreadDetails("Thread-2"));
        Thread t3 = new Thread(() -> printThreadDetails("Thread-3"));

        t1.start();
        t2.start();
        t3.start();

        // Wait for all threads to finish
        t1.join();
        t2.join();
        t3.join();

        // Check thread status after completion
        System.out.println("Thread-1 isAlive: " + t1.isAlive());
        System.out.println("Thread-2 isAlive: " + t2.isAlive());
        System.out.println("Thread-3 isAlive: " + t3.isAlive());
    }
}
