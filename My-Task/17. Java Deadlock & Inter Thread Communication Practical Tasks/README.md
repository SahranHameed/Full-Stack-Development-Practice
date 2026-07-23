# ☕ Java Deadlock & Inter-Thread Communication – Practical Tasks

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![Tasks](https://img.shields.io/badge/Tasks-3%2F3-blue?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Advanced-red?style=for-the-badge)

> A collection of 3 practical Java programs demonstrating Deadlock, Synchronization, and Inter-Thread Communication using multithreading concepts — built as part of a Full-Stack Web Development course.

---

## 📁 Project Structure

```
17. Java Deadlock & Inter-Thread Communication/
│
├── Task01_PrinterScannerDeadlock.java     # Deadlock with Printer & Scanner
├── Task01_PrinterScannerSolution.java     # Deadlock Prevention Solution
├── Task02_BankTransferDeadlock.java       # Bank Account Money Transfer Deadlock
├── Task02_BankTransferSolution.java       # Deadlock Prevention + wait/notifyAll
└── Task03_BankTransferSystem.java         # Account A↔B Transfer with Synchronization
```

---

## 📋 Task Summary

| # | Program | Description | Concept Used |
|---|---------|-------------|--------------|
| 01 | Printer & Scanner | Two users compete for Printer and Scanner | Deadlock + Prevention |
| 02 | Bank Money Transfer | Two threads transfer money simultaneously | Deadlock + wait/notifyAll |
| 03 | Bank Transfer System | Account A→B and B→A thread transfers | synchronized + Prevention |

---

## 🔒 What is Deadlock?

```
Deadlock occurs when two threads wait for each other forever!

User1: Holds Printer → Waiting for Scanner
User2: Holds Scanner → Waiting for Printer

Both are waiting → Neither can proceed → DEADLOCK! 🔒
```

---

## 🎯 Sample Outputs

### Task 01 — Deadlock Scenario
```
User1 acquired Printer
User2 acquired Scanner
User1 waiting for Scanner... (DEADLOCK!)
User2 waiting for Printer... (DEADLOCK!)
```

### Task 01 — After Fix
```
User1 acquired Printer
User1 acquired Scanner
User1 completed printing and scanning.
User2 acquired Printer
User2 acquired Scanner
User2 completed printing and scanning.
```

### Task 02 — Bank Transfer with wait/notifyAll
```
Thread1: Transferring Rs.500 from Account A to Account B...
Thread1: Transfer successful! Account A: Rs.500, Account B: Rs.1500
Thread2: Transferring Rs.300 from Account B to Account A...
Thread2: Transfer successful! Account B: Rs.1200, Account A: Rs.800
```

### Task 03 — Account Transfer System
```
Thread1: Account A → Account B: Rs.1000 transferred!
Thread2: Account B → Account A: Rs.500 transferred!
Final Balance: Account A = Rs.500 | Account B = Rs.1000
```

---

## 💡 Key Concepts Learned

### 🔒 Deadlock Creation
```java
// User1 locks Printer first, then Scanner
// User2 locks Scanner first, then Printer
// → Both wait forever! = DEADLOCK
synchronized(printer) {
    synchronized(scanner) { ... }  // User1
}
synchronized(scanner) {
    synchronized(printer) { ... }  // User2 → DEADLOCK!
}
```

### ✅ Deadlock Prevention — Lock Ordering
```java
// SOLUTION: Both users lock in SAME order
// Both lock Printer first, then Scanner
synchronized(printer) {      // Same order
    synchronized(scanner) {  // Same order
        // No deadlock! ✅
    }
}
```

### 📢 Inter-Thread Communication — wait() & notifyAll()
```java
// Thread waits when resource is busy
synchronized(account) {
    while (account.balance < amount) {
        account.wait();        // Wait until balance available
    }
    account.balance -= amount;
    account.notifyAll();       // Tell other threads balance changed
}
```

---

## 🔍 Deadlock vs Solution

| | Deadlock Version | Solution Version |
|---|---|---|
| Lock Order | Different for each thread | Same for all threads |
| Result | Program freezes forever | Runs successfully |
| Keyword | `synchronized` | `synchronized` + ordering |
| Communication | None | `wait()` + `notifyAll()` |

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
cd "Full-Stack-Development-Practice/My-Task/17. Java Deadlock & Inter-Thread Communication"
```

**3. Compile**
```bash
javac Task01_PrinterScannerDeadlock.java
```

**4. Run**
```bash
java Task01_PrinterScannerDeadlock
```

> ⚠️ Deadlock version may freeze — press `Ctrl+C` to stop!

---

## 📌 Code Standards Followed

- ✅ `Javadoc /** */` comments explaining synchronization logic
- ✅ `PascalCase` for class names
- ✅ `camelCase` for variable names
- ✅ `synchronized` keyword used correctly
- ✅ `wait()` and `notifyAll()` used for inter-thread communication
- ✅ Lock ordering applied for deadlock prevention
- ✅ Clean and readable output formatting

---

## 👨‍💻 Author

**Sahran Hameed**
🔗 [GitHub Profile](https://github.com/SahranHameed)

---

## 📚 Part Of

This repository is part of the **Full-Stack Web Development Practicals** series.

| Module | Topic |
|--------|-------|
| 04 | [Java Arrays](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/04.%20Java%20Arrays%20-%20Practical%20Tasks) |
| 05 | [Java Arrays & Number Logic](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/05.%20Java%20Arrays%20%26%20Number%20Logic%20-%20Practical%20Tasks) |
| 06 | [Java Strings](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/06.%20Java%20Strings%20-%20Practical%20Tasks) |
| 07 | [Java Constructors](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/07.%20Java%20Constructors-%20Practical%20Tasks) |
| 08 | [Java Encapsulation](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/08.%20Java%20Encapsulation%20-%20Practical%20Tasks) |
| 09 | [Java Inheritance](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/09.%20Java%20Inheritance%20-%20Practical%20Tasks) |
| 10 | [Java OOP - Vehicle Management System](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/10.%20Java%20OOP%20-%20Vehicle%20Management%20System) |
| 11 | [Java OOP - Library Management System](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/11.%20Java%20OOP%20-%20Library%20Management%20System) |
| 17 | [Java Deadlock & Inter-Thread Communication](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/17.%20Java%20Deadlock%20%26%20Inter-Thread%20Communication) |

👉 [View Full Repository](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main)

---

## 📄 License

This project is open source and available for educational purposes.
