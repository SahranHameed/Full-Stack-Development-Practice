/*
  Represents a customer attempting to book a cab.
  Implements Runnable so each customer can run as an independent thread.
*/
public class Customer implements Runnable {

    private Cab cab;
    private String customerName;

    public Customer(Cab cab, String customerName) {
        this.cab = cab;
        this.customerName = customerName;
    }

    @Override
    public void run() {
        cab.bookCab(customerName);
    }
}
