# ☕ Java Mini Project – Bus Reservation System

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![Type](https://img.shields.io/badge/Type-Mini%20Project-purple?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Advanced-red?style=for-the-badge)

> A menu-driven Java console application implementing a complete Bus Reservation System with Bus Management and Ticket Booking — built as part of a Full-Stack Web Development course.

---

## 📁 Project Structure

```
19. Java Mini Project – Bus Reservation System/
│
├── Bus.java              # Bus class with bus details
├── Booking.java          # Booking class with passenger details
├── BusManager.java       # Module 01 – Bus Management (Add, View, Update, Delete)
├── BookingManager.java   # Module 02, 03, 04 – Ticket Booking, View, Cancel
└── Main.java             # Menu-driven main application
```

---

## 📋 Module Summary

| Module | Feature | Description |
|--------|---------|-------------|
| 01 | Bus Management | Add, View, Update, Delete buses |
| 02 | Ticket Booking | Book a seat for a passenger |
| 03 | View Bookings | Display all booking details |
| 04 | Cancel Booking | Cancel booking and free seat |
| 05 | Exit | Safely exit the application |

---

## 🚌 Menu Options

```
========================================
       BUS RESERVATION SYSTEM
========================================
1. Add Bus
2. View All Buses
3. Update Bus Capacity
4. Delete Bus
5. Book Ticket
6. View All Bookings
7. Cancel Booking
8. Exit
========================================
Enter your choice:
```

---

## 🎯 Sample Outputs

### Add Bus
```
Enter Bus Number    : BUS-101
Enter Source        : Chennai
Enter Destination   : Coimbatore
Enter Capacity      : 40
Bus added successfully! ✅
```

### View All Buses
```
══════════════════════════════════════════════════
Bus No   Source      Destination   Capacity  Booked
══════════════════════════════════════════════════
BUS-101  Chennai     Coimbatore    40        2
BUS-102  Madurai     Trichy        35        0
══════════════════════════════════════════════════
```

### Book Ticket
```
Enter Passenger Name : Sahran Hameed
Enter Passenger ID   : P001
Enter Bus Number     : BUS-101
Seat available!
Ticket booked successfully! ✅
Booking ID: P001 | Bus: BUS-101 | Chennai → Coimbatore
```

### Cancel Booking
```
Enter Passenger ID: P001
Booking found!
Booking cancelled successfully! ✅
Seat count updated.
```

---

## 💡 Key Concepts Used

### 🚌 Bus Class
```java
public class Bus {
    private String busNumber;
    private String source;
    private String destination;
    private int    capacity;
    private int    bookedSeats;

    // Getters and Setters
    public int getAvailableSeats() {
        return capacity - bookedSeats;
    }
}
```

### 🎫 Booking Class
```java
public class Booking {
    private String passengerId;
    private String passengerName;
    private String busNumber;
    private String source;
    private String destination;
}
```

### 📋 Menu-Driven Main
```java
Scanner sc = new Scanner(System.in);
int choice;

do {
    displayMenu();
    choice = sc.nextInt();

    switch (choice) {
        case 1: addBus();         break;
        case 2: viewAllBuses();   break;
        case 3: updateCapacity(); break;
        case 4: deleteBus();      break;
        case 5: bookTicket();     break;
        case 6: viewBookings();   break;
        case 7: cancelBooking();  break;
        case 8: System.out.println("Thank you! Goodbye!"); break;
        default: System.out.println("Invalid choice!");
    }
} while (choice != 8);
```

---

## 🔍 Validation Rules

```
✅ Passenger ID must be unique
✅ Cannot book if no seats available
✅ Cannot cancel non-existing booking
✅ Cannot delete non-existing bus
✅ Seat count updates after booking and cancellation
```

---

## 🚀 How to Run

### Prerequisites
- Java JDK 8 or above installed
- Any IDE (VS Code, IntelliJ IDEA, Eclipse) or terminal

### Steps

**1. Clone the repository**
```bash
git clone https://github.com/SahranHameed/Full-Stack-Development-Practice.git
```

**2. Navigate to the folder**
```bash
cd "Full-Stack-Development-Practice/My-Task/19. Java Mini Project - Bus Reservation System"
```

**3. Compile all files**
```bash
javac *.java
```

**4. Run the application**
```bash
java Main
```

---

## 📌 Code Standards Followed

- ✅ `Javadoc /** */` comments explaining project logic
- ✅ `PascalCase` for class names
- ✅ `camelCase` for variable and method names
- ✅ OOP principles applied (classes, objects, methods)
- ✅ Input validation implemented
- ✅ ArrayList used for dynamic storage
- ✅ Clean menu-driven interface
- ✅ Proper success and error messages

---

## 👨‍💻 Author

**Sahran Hameed**
🔗 [GitHub Profile](https://github.com/SahranHameed)

---

## 📚 Part Of

This repository is part of the **Full-Stack Web Development Practicals** series.

| Module | Topic |
|--------|-------|
| 17 | [Java Deadlock & Inter-Thread Communication](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/17.%20Java%20Deadlock%20%26%20Inter-Thread%20Communication) |
| 18 | [Java File Handling](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/18.%20Java%20File%20Handling) |
| 19 | [Java Mini Project - Bus Reservation System](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/19.%20Java%20Mini%20Project%20-%20Bus%20Reservation%20System) |

👉 [View Full Repository](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main)

---

## 📄 License

This project is open source and available for educational purposes.
