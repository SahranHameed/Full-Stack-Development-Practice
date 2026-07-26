import java.util.ArrayList;
import java.util.Scanner;

// Task 19 & 20 - Bus Reservation System
// Menu driven console app: add/view/update/delete bus, book/view/cancel ticket

public class Main {

    static ArrayList<Bus> busList = new ArrayList<>();
    static ArrayList<Booking> bookingList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: addBus(); break;
                case 2: viewAllBuses(); break;
                case 3: updateBus(); break;
                case 4: deleteBus(); break;
                case 5: bookTicket(); break;
                case 6: viewBookings(); break;
                case 7: cancelBooking(); break;
                case 8: System.out.println("\nThank you, goodbye!"); break;
                default: System.out.println("Invalid choice, try again.");
            }

        } while (choice != 8);
    }

    static void displayMenu() {
        System.out.println("\n=============================");
        System.out.println("   BUS RESERVATION SYSTEM");
        System.out.println("=============================");
        System.out.println("1. Add Bus");
        System.out.println("2. View All Buses");
        System.out.println("3. Update Bus Capacity");
        System.out.println("4. Delete Bus");
        System.out.println("5. Book Ticket");
        System.out.println("6. View All Bookings");
        System.out.println("7. Cancel Booking");
        System.out.println("8. Exit");
    }

    static void addBus() {
        System.out.println("\n-- Add Bus --");
        System.out.print("Bus Number  : "); String num = sc.nextLine();
        System.out.print("Source      : "); String src = sc.nextLine();
        System.out.print("Destination : "); String dest = sc.nextLine();
        System.out.print("Capacity    : "); int cap = sc.nextInt(); sc.nextLine();

        for (Bus b : busList) {
            if (b.getBusNumber().equals(num)) {
                System.out.println("Bus number already exists.");
                return;
            }
        }

        busList.add(new Bus(num, src, dest, cap));
        System.out.println("Bus added successfully.");
    }

    static void viewAllBuses() {
        System.out.println("\n-- All Buses --");
        if (busList.isEmpty()) {
            System.out.println("No buses available.");
            return;
        }
        System.out.printf("%-10s %-12s %-15s %-10s %-10s %-10s%n",
            "Bus No", "Source", "Destination", "Capacity", "Booked", "Available");
        for (Bus b : busList) {
            b.displayBus();
        }
    }

    static void updateBus() {
        System.out.println("\n-- Update Bus Capacity --");
        System.out.print("Enter Bus Number: "); String num = sc.nextLine();

        for (Bus b : busList) {
            if (b.getBusNumber().equals(num)) {
                System.out.print("New Capacity: "); int cap = sc.nextInt(); sc.nextLine();
                b.setCapacity(cap);
                System.out.println("Bus capacity updated.");
                return;
            }
        }
        System.out.println("Bus not found.");
    }

    static void deleteBus() {
        System.out.println("\n-- Delete Bus --");
        System.out.print("Enter Bus Number: "); String num = sc.nextLine();

        for (Bus b : busList) {
            if (b.getBusNumber().equals(num)) {
                busList.remove(b);
                System.out.println("Bus deleted.");
                return;
            }
        }
        System.out.println("Bus not found.");
    }

    static void bookTicket() {
        System.out.println("\n-- Book Ticket --");
        System.out.print("Passenger Name : "); String name = sc.nextLine();
        System.out.print("Passenger ID   : "); String pid = sc.nextLine();
        System.out.print("Bus Number     : "); String num = sc.nextLine();

        for (Booking bk : bookingList) {
            if (bk.getPassengerId().equals(pid)) {
                System.out.println("Passenger ID already used.");
                return;
            }
        }

        for (Bus b : busList) {
            if (b.getBusNumber().equals(num)) {
                if (b.getAvailableSeats() > 0) {
                    b.setBookedSeats(b.getBookedSeats() + 1);
                    bookingList.add(new Booking(pid, name, num, b.getSource(), b.getDestination()));
                    System.out.println("Ticket booked successfully.");
                    System.out.println("Route: " + b.getSource() + " -> " + b.getDestination());
                } else {
                    System.out.println("No seats available.");
                }
                return;
            }
        }
        System.out.println("Bus not found.");
    }

    static void viewBookings() {
        System.out.println("\n-- All Bookings --");
        if (bookingList.isEmpty()) {
            System.out.println("No bookings found.");
            return;
        }
        System.out.printf("%-10s %-15s %-10s %-12s %-15s%n",
            "Pass ID", "Name", "Bus No", "Source", "Destination");
        for (Booking bk : bookingList) {
            bk.displayBooking();
        }
    }

    static void cancelBooking() {
        System.out.println("\n-- Cancel Booking --");
        System.out.print("Enter Passenger ID: "); String pid = sc.nextLine();

        for (Booking bk : bookingList) {
            if (bk.getPassengerId().equals(pid)) {
                for (Bus b : busList) {
                    if (b.getBusNumber().equals(bk.getBusNumber())) {
                        b.setBookedSeats(b.getBookedSeats() - 1);
                        break;
                    }
                }
                bookingList.remove(bk);
                System.out.println("Booking cancelled.");
                return;
            }
        }
        System.out.println("Booking not found.");
    }
}
