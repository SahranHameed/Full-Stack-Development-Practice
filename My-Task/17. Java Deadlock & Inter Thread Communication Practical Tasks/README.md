# ☕ Java Deadlock & Inter-Thread Communication – Practical Tasks

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![Tasks](https://img.shields.io/badge/Tasks-3%2F3-blue?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Advanced-red?style=for-the-badge)

> 3 practical Java programs demonstrating Deadlock, Synchronization, and Inter-Thread Communication using multithreading — built as part of a Full-Stack Web Development course.

---

## 📁 Project Structure

Each task is a **single file** that shows the deadlock first (Part A) and then the fixed version (Part B) in one `main()` run.

```
17. Java Deadlock & Inter-Thread Communication/
│
├── Task01_PrinterScanner.java       # Printer & Scanner deadlock + fix
├── Task02_BankTransfer.java         # Bank transfer deadlock + wait/notifyAll fix
└── Task03_BankTransferSystem.java   # Account A<->B transfer deadlock + fix
```

---

## 📋 Task Summary

| # | Program | Description | Concept Used |
|---|---------|-------------|--------------|
| 01 | Printer & Scanner | Two users compete for Printer and Scanner | Deadlock + Lock Ordering + wait/notifyAll |
| 02 | Bank Money Transfer | Two threads transfer money in opposite directions | Deadlock + Consistent Lock Order + wait/notifyAll |
| 03 | Bank Transfer System | Account A→B and B→A thread transfers | synchronized + Consistent Lock Order |

---

## 🔒 What is Deadlock?

```
Deadlock occurs when two threads wait for each other forever!

User1: Holds Printer → Waiting for Scanner
User2: Holds Scanner → Waiting for Printer

Both are waiting → Neither can proceed → DEADLOCK!
```

Each program starts the deadlock threads as **daemon threads** and waits a few seconds (`join(3000)`). If both threads are still alive after that, it prints a confirmation message instead of letting the whole program hang forever.

---

## 🎯 Actual Program Output

### Task 01 — `Task01_PrinterScanner`
```
PART A - Deadlock Demo
------------------------
User1 locked Printer, waiting for Scanner...
User2 locked Scanner, waiting for Printer...
Deadlock confirmed - both threads are still stuck waiting on each other.

PART B - Fixed Version (no deadlock)
------------------------
User1 is using the printer
User2 waiting, printer busy...
User1 is using the scanner
User2 is using the printer
User1 done with printer and scanner
User2 is using the scanner
User2 done with printer and scanner
Both users finished, no deadlock this time.
```

### Task 02 — `Task02_BankTransfer`
```
PART A - Deadlock Demo
------------------------
Thread1 locked Account A, waiting for Account B...
Thread2 locked Account B, waiting for Account A...
Deadlock confirmed - both threads stuck waiting for each other's lock.

PART B - Fixed Transfer (consistent lock order + wait/notify)
------------------------
Transferred Rs.500.0 from Account A to Account B
Account A balance: Rs.500.0
Account B balance: Rs.1500.0
Transferred Rs.300.0 from Account B to Account A
Account B balance: Rs.1200.0
Account A balance: Rs.800.0
Final balances:
Account A = Rs.800.0
Account B = Rs.1200.0
```

### Task 03 — `Task03_BankTransferSystem`
```
PART A - Deadlock Scenario
----------------------------
Thread1 locked A, waiting for B...
Thread2 locked B, waiting for A...
Deadlock confirmed - Thread1 has A waiting for B, Thread2 has B waiting for A.

PART B - Deadlock Prevented
----------------------------
Thread1: Rs.300.0 transferred Account A -> Account B | A=700.0 B=1300.0
Thread2: Rs.200.0 transferred Account B -> Account A | A=900.0 B=1100.0
Final balance:
Account A = Rs.900.0
Account B = Rs.1100.0
```

> Note: Thread1/Thread2 print order in Part B can vary slightly between runs — that's normal thread scheduling, not a bug.

---

## 💡 Key Concepts Learned

### 🔒 Deadlock Creation (Task 01 example)
```java
// User1 locks Printer first, then Scanner
// User2 locks Scanner first, then Printer
// -> both get stuck waiting = DEADLOCK
synchronized (printer) {
    synchronized (scanner) { ... }   // User1
}
synchronized (scanner) {
    synchronized (printer) { ... }   // User2 -> DEADLOCK!
}
```

### ✅ Deadlock Prevention — Lock Ordering
```java
// Task 02 / 03: always lock the account with the smaller id first,
// no matter which direction the transfer is going.
BankAccount first  = (from.id < to.id) ? from : to;
BankAccount second = (from.id < to.id) ? to : from;

synchronized (first) {
    synchronized (second) {
        // both threads take locks in the SAME order -> no deadlock
    }
}
```

### 📢 Inter-Thread Communication — wait() & notifyAll()
```java
// Task 01: a user waits if the printer is already busy
synchronized (p) {
    while (p.busy) {
        p.wait();          // release lock, wait until notified
    }
    p.busy = true;
}
...
synchronized (p) {
    p.busy = false;
    p.notifyAll();         // wake up any waiting user
}
```

```java
// Task 02: a transfer waits if the source account doesn't have enough balance
while (from.balance < amount) {
    first.wait(2000);
}
from.balance -= amount;
to.balance += amount;
first.notifyAll();
```

---

## 🔍 Deadlock vs Fixed Version

| | Deadlock (Part A) | Fixed Version (Part B) |
|---|---|---|
| Lock Order | Different for each thread | Same for every thread |
| Result | Threads stuck forever | Runs to completion |
| Threads | daemon, detected via `join(timeout)` | normal threads |
| Communication | none | `wait()` + `notifyAll()` |

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

**3. Compile & Run (each task is standalone)**
```bash
javac Task01_PrinterScanner.java
java Task01_PrinterScanner

javac Task02_BankTransfer.java
java Task02_BankTransfer

javac Task03_BankTransferSystem.java
java Task03_BankTransferSystem
```

> Part A of each program shows a real deadlock — the deadlocked threads are marked `daemon`, so the program still finishes on its own after a few seconds instead of freezing.

---

## 📌 Code Standards Followed

- ✅ Comments explaining synchronization and deadlock logic
- ✅ `PascalCase` for class names, `camelCase` for variables
- ✅ `synchronized` keyword used correctly with consistent lock ordering
- ✅ `wait()` and `notifyAll()` used for inter-thread communication
- ✅ Daemon threads + timeout used to detect deadlock safely in a demo
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
| 17 | [Java Deadlock & Inter-Thread Communication](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/17.%20Java%20Deadlock%20%26%20Inter-Thread%20Communication) |

👉 [View Full Repository](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main)

---

## 📄 License

This project is open source and available for educational purposes.

