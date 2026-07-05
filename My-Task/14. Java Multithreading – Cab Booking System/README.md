# ☕ Java Multithreading – Cab Booking System

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![Tasks](https://img.shields.io/badge/Tasks-1%2F1-blue?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Advanced-red?style=for-the-badge)

> A Java project simulating a **Cab Booking System** using multithreading and synchronization, demonstrating thread safety and race condition prevention.

---

## 📁 Project Structure

```
14. Java Multithreading – Cab Booking System/
│
├── Cab.java              # Holds booking status, synchronized bookCab()
├── Customer.java         # Runnable — each customer is a thread
├── CabBookingDemo.java   # Creates cab + multiple customer threads
└── README.md
```

---

## 📋 Concepts Demonstrated

| # | Concept | Class / Component | How It's Used |
|---|---------|-------------------|---------------|
| 1 | **Thread Creation** | `Customer implements Runnable` | Each customer runs as an independent thread |
| 2 | **Shared Resource** | `Cab` | Single cab object accessed by multiple threads |
| 3 | **Synchronization** | `synchronized bookCab()` | Prevents simultaneous booking |
| 4 | **Race Condition Prevention** | `Cab` status check | Only one thread can change status at a time |

---

## 🏗️ Class Design

```
Cab
├── private boolean isBooked = false
└── synchronized bookCab(String customerName)
    ├── if (!isBooked) → isBooked = true → success message
    └── else            → failure message

Customer  (implements Runnable)
├── Cab cab
├── String customerName
└── run() → cab.bookCab(customerName)

CabBookingDemo
├── create single Cab object
├── create multiple Customer threads (same Cab reference)
└── start() all threads
```

---

## 🎯 Sample Output

```
========================================
    CAB BOOKING SYSTEM DEMO
========================================

Customer 1 successfully booked the cab.
Customer 2 failed to book the cab. Cab is already booked.
Customer 3 failed to book the cab. Cab is already booked.

Final Result: Only Customer 1 booked the cab. ✅
========================================
```
> ⚠️ Note: Due to thread scheduling, the customer who succeeds may vary between runs — but **only one** will ever succeed.

---

## 💡 Key Concepts with Code

### 1️⃣ Cab Class — Synchronized Booking
```java
public class Cab {
    private boolean isBooked = false;

    public synchronized void bookCab(String customerName) {
        if (!isBooked) {
            isBooked = true;
            System.out.println(customerName + " successfully booked the cab.");
        } else {
            System.out.println(customerName + " failed to book the cab. Cab is already booked.");
        }
    }
}
```

### 2️⃣ Customer Thread
```java
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
```

### 3️⃣ Starting Concurrent Threads
```java
Cab cab = new Cab();

Thread t1 = new Thread(new Customer(cab, "Customer 1"));
Thread t2 = new Thread(new Customer(cab, "Customer 2"));
Thread t3 = new Thread(new Customer(cab, "Customer 3"));

t1.start();
t2.start();
t3.start();
```

---

## 🔍 Multithreading – Quick Reference

| Concept | Keyword | Purpose |
|---------|---------|---------|
| Independent execution | `Runnable` / `Thread` | Simulate concurrent customers |
| Thread-safe access | `synchronized` | Only one thread modifies shared state at a time |
| Prevent double booking | Status check inside sync block | Ensures data consistency |
| Start execution | `start()` | Begins concurrent thread execution |

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
cd "14. Java Multithreading - Cab Booking System"
```

**3. Compile all Java files**
```bash
javac Cab.java Customer.java CabBookingDemo.java
```

**4. Run the demo**
```bash
java CabBookingDemo
```

---

## 📌 Code Standards Followed

- ✅ `Javadoc /** */` comments explaining multithreading and synchronization logic
- ✅ `PascalCase` for all class names
- ✅ `camelCase` for all variable and method names
- ✅ `synchronized` keyword used correctly to avoid race conditions
- ✅ Clean, readable, and well-formatted output
- ✅ Demonstrates real concurrent thread execution

---

## 👤 Author

**[Sahran Hameed]**
🔗 [GitHub Profile](https://github.com/SahranHameed)

---

## 📄 License

This project is open source and available for educational purposes.
