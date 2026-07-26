// Booking class - stores one passenger's booking
public class Booking {

    private String passengerId;
    private String passengerName;
    private String busNumber;
    private String source;
    private String destination;

    public Booking(String passengerId, String passengerName, String busNumber,
                    String source, String destination) {
        this.passengerId = passengerId;
        this.passengerName = passengerName;
        this.busNumber = busNumber;
        this.source = source;
        this.destination = destination;
    }

    public String getPassengerId() { return passengerId; }
    public String getPassengerName() { return passengerName; }
    public String getBusNumber() { return busNumber; }

    public void displayBooking() {
        System.out.printf("%-10s %-15s %-10s %-12s %-15s%n",
            passengerId, passengerName, busNumber, source, destination);
    }
}
