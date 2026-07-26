// Bus class - holds bus details for the reservation system
public class Bus {

    private String busNumber;
    private String source;
    private String destination;
    private int capacity;
    private int bookedSeats;

    public Bus(String busNumber, String source, String destination, int capacity) {
        this.busNumber = busNumber;
        this.source = source;
        this.destination = destination;
        this.capacity = capacity;
        this.bookedSeats = 0;
    }

    public String getBusNumber() { return busNumber; }
    public String getSource() { return source; }
    public String getDestination() { return destination; }
    public int getCapacity() { return capacity; }
    public int getBookedSeats() { return bookedSeats; }
    public int getAvailableSeats() { return capacity - bookedSeats; }

    public void setCapacity(int capacity) { this.capacity = capacity; }
    public void setBookedSeats(int bookedSeats) { this.bookedSeats = bookedSeats; }

    public void displayBus() {
        System.out.printf("%-10s %-12s %-15s %-10d %-10d %-10d%n",
            busNumber, source, destination, capacity, bookedSeats, getAvailableSeats());
    }
}
