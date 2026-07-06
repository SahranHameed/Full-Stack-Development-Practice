/*
  Demonstrates multiple customer threads attempting to book
  the same cab concurrently, showing thread safety in action.
*/
public class CabBookingDemo {

    public static void main(String[] args) throws InterruptedException {
        // Single shared Cab instance
        Cab cab = new Cab();

        // Multiple customer threads referencing the same cab
        Thread customer1 = new Thread(new Customer(cab, "Customer 1"));
        Thread customer2 = new Thread(new Customer(cab, "Customer 2"));
        Thread customer3 = new Thread(new Customer(cab, "Customer 3"));

        // Start all threads to simulate concurrent booking attempts
        customer1.start();
        customer2.start();
        customer3.start();

        // Wait for all threads to finish before ending the program
        customer1.join();
        customer2.join();
        customer3.join();

        System.out.println("\nBooking process completed.");
        
    }
}
