# ☕ Java Multithreading – Practical Tasks

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![Tasks](https://img.shields.io/badge/Tasks-4%2F4-blue?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Advanced-red?style=for-the-badge)

> A collection of four Java programs exploring core **multithreading** concepts — thread lifecycle, synchronization, shared resource access, and thread priority.

---

## 📁 Project Structure

```
16. Java Multithreading – Practical Tasks/
│
├── Task01_ThreadExecutionManager.java   # start(), join(), isAlive()
├── Task02_NumberPrinter.java            # odd/even threads + sleep()
├── Task03_StudentResultGenerator.java   # synchronized shared report + isAlive()
├── Task04_PrinterService.java           # synchronized printDocument() + setPriority()
└── README.md
```

---

## 📋 Concepts Demonstrated

| # | Concept | Class / Component | How It's Used |
|---|---------|-------------------|---------------|
| 1 | **Thread Lifecycle** | `Task01_ThreadExecutionManager` | `start()`, `join()`, `isAlive()` on 3 threads |
| 2 | **Synchronized Printing** | `Task02_NumberPrinter` | Odd/even threads print without interleaving |
| 3 | **Shared Resource Writing** | `Task03_StudentResultGenerator` | Synchronized method writes to shared report |
| 4 | **Thread Priority** | `Task04_PrinterService` | `setPriority()` gives one employee priority |

---

## 🏗️ Task Design

```
Task01 - Thread Execution Manager
├── create 3 Thread objects
├── start() each thread
├── synchronized printThreadDetails() → one thread prints at a time
└── join() → main waits, isAlive() → checks status

Task02 - Number Printer
├── OddThread  → prints 1, 3, 5 ...
├── EvenThread → prints 2, 4, 6 ...
├── sleep()    → delay between prints
└── synchronized print() → prevents mixed output

Task03 - Student Result Generator
├── multiple StudentThread objects (different students)
├── synchronized writeResult() → appends to shared report
└── isAlive() → verify thread completion

Task04 - Printer Service
├── multiple EmployeeThread objects
├── synchronized printDocument()
├── setPriority() → one employee thread gets higher priority
└── join() → wait for all print jobs to finish
```

---

## 🎯 Sample Output

```
========================================
    MULTITHREADING PRACTICAL TASKS
========================================

--- Task 01: Thread Execution Manager ---
Thread-1 details: RUNNING
Thread-2 details: RUNNING
Thread-3 details: RUNNING
All threads completed. isAlive() = false for all.

--- Task 02: Number Printer ---
Odd  : 1
Even : 2
Odd  : 3
Even : 4
Odd  : 5

--- Task 03: Student Result Generator ---
Result recorded: Student A - Marks: 85
Result recorded: Student B - Marks: 91
Result recorded: Student C - Marks: 78
All student threads completed.

--- Task 04: Printer Service ---
[High Priority] Employee 1 document printed.
Employee 2 document printed.
Employee 3 document printed.
All print jobs completed.

========================================
```

---

## 💡 Key Concepts with Code

### 1️⃣ Thread Execution Manager
```java
Thread t1 = new Thread(() -> printThreadDetails("Thread-1"));
Thread t2 = new Thread(() -> printThreadDetails("Thread-2"));
Thread t3 = new Thread(() -> printThreadDetails("Thread-3"));

t1.start(); t2.start(); t3.start();
t1.join();  t2.join();  t3.join();

System.out.println("isAlive: " + t1.isAlive());

public static synchronized void printThreadDetails(String name) {
    System.out.println(name + " details: RUNNING");
}
```

### 2️⃣ Number Printer — Odd & Even Threads
```java
class NumberPrinter {
    synchronized void print(int number, String label) {
        System.out.println(label + " : " + number);
    }
}

Thread oddThread = new Thread(() -> {
    for (int i = 1; i <= 9; i += 2) {
        printer.print(i, "Odd ");
        try { Thread.sleep(200); } catch (InterruptedException e) {}
    }
});
```

### 3️⃣ Student Result Generator
```java
class ReportBook {
    synchronized void writeResult(String student, int marks) {
        System.out.println("Result recorded: " + student + " - Marks: " + marks);
    }
}

Thread studentThread = new Thread(() -> reportBook.writeResult("Student A", 85));
studentThread.start();
System.out.println("isAlive: " + studentThread.isAlive());
```

### 4️⃣ Printer Service with Priority
```java
class Printer {
    synchronized void printDocument(String employee) {
        System.out.println(employee + " document printed.");
    }
}

Thread highPriorityEmployee = new Thread(() -> printer.printDocument("[High Priority] Employee 1"));
highPriorityEmployee.setPriority(Thread.MAX_PRIORITY);

Thread employee2 = new Thread(() -> printer.printDocument("Employee 2"));
Thread employee3 = new Thread(() -> printer.printDocument("Employee 3"));

highPriorityEmployee.start();
employee2.start();
employee3.start();

highPriorityEmployee.join();
employee2.join();
employee3.join();
```

---

## 🔍 Multithreading – Quick Reference

| Concept | Keyword / Method | Purpose |
|---------|------------------|---------|
| Begin execution | `start()` | Launches a new thread |
| Wait for completion | `join()` | Main thread waits for others to finish |
| Check thread status | `isAlive()` | Verifies whether a thread has completed |
| Thread-safe output | `synchronized` | Prevents interleaved/mixed output |
| Delay execution | `sleep()` | Introduces pause between operations |
| Execution order hint | `setPriority()` | Suggests scheduling priority to the JVM |

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
cd "16. Java Multithreading - Practical Tasks"
```

**3. Compile each file**
```bash
javac Task01_ThreadExecutionManager.java
javac Task02_NumberPrinter.java
javac Task03_StudentResultGenerator.java
javac Task04_PrinterService.java
```

**4. Run each task**
```bash
java Task01_ThreadExecutionManager
java Task02_NumberPrinter
java Task03_StudentResultGenerator
java Task04_PrinterService
```

---

## 📌 Code Standards Followed

- ✅ `Javadoc /** */` comments explaining multithreading logic
- ✅ `PascalCase` for all class names
- ✅ `camelCase` for all variable and method names
- ✅ `synchronized` used correctly to avoid race conditions and mixed output
- ✅ Proper use of `start()`, `join()`, `isAlive()`, `sleep()`, and `setPriority()`
- ✅ Clean, readable, and well-formatted output

---

## 👤 Author

**[Sahran Hameed]**
🔗 [GitHub Profile](https://github.com/SahranHameed)

---

## 📄 License

This project is open source and available for educational purposes.
