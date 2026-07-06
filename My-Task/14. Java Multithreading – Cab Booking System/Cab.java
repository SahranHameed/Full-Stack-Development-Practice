/*
  Represents a cab with a booking status.
  The bookCab() method is synchronized to prevent multiple
  customer threads from booking the same cab simultaneously.
*/
public class Cab {

    private boolean isBooked = false;

    /*
      Synchronized to ensure only one thread at a time can
      check and update the booking status, preventing race conditions.
    */
    public synchronized void bookCab(String customerName) {
        if (!isBooked) {
            isBooked = true;
            System.out.println(customerName + " successfully booked the cab.");
        } else {
            System.out.println(customerName + " failed to book the cab. Cab is already booked.");
        }
    }
}
