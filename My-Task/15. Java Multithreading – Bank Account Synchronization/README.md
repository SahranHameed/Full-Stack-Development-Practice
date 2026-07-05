# ☕ Java Multithreading – Bank Account Synchronization

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![Tasks](https://img.shields.io/badge/Tasks-1%2F1-blue?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Advanced-red?style=for-the-badge)

> A Java project demonstrating **thread synchronization** on a shared `BankAccount` object, where multiple threads perform deposits and withdrawals concurrently without corrupting the balance.

---

## 📁 Project Structure

```
15. Java Multithreading – Bank Account Synchronization/
│
├── BankAccount.java       # synchronized deposit() and withdraw()
├── BankAccountDemo.java   # Creates multiple threads for deposit/withdraw
└── README.md
```

---

## 📋 Concepts Demonstrated

| # | Concept | Class / Component | How It's Used |
|---|---------|-------------------|---------------|
| 1 | **Synchronized Methods** | `deposit()`, `withdraw()` | Prevent concurrent modification of `balance` |
| 2 | **Multiple Threads** | `BankAccountDemo` | Several threads deposit/withdraw simultaneously |
| 3 | **Race Condition Prevention** | `withdraw()` balance check | Balance never goes negative |
| 4 | **Shared Resource** | `BankAccount` | Single account instance accessed by all threads |

---

## 🏗️ Class Design

```
BankAccount
├── private double balance
├── synchronized deposit(double amount)
│   └── balance += amount
└── synchronized withdraw(double amount)
    ├── if (amount <= balance) → balance -= amount → success
    └── else                   → insufficient balance message

BankAccountDemo
├── create single BankAccount object
├── create multiple deposit/withdraw threads (same account reference)
└── start() all threads
```

---

## 🎯 Sample Output

```
========================================
    BANK ACCOUNT SYNCHRONIZATION DEMO
========================================

Thread-1 deposited ₹1000.0 | Balance: ₹6000.0
Thread-2 withdrew ₹2000.0  | Balance: ₹4000.0
Thread-3 deposited ₹1500.0 | Balance: ₹5500.0
Thread-4 withdrew ₹8000.0  | ❌ Insufficient balance. Transaction declined.

Final Balance: ₹5500.0
========================================
```
> ⚠️ Note: Thread execution order may vary between runs, but the balance is **always** updated consistently and never becomes negative.

---

## 💡 Key Concepts with Code

### 1️⃣ BankAccount Class — Synchronized Deposit & Withdraw
```java
public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName()
            + " deposited ₹" + amount + " | Balance: ₹" + balance);
    }

    public synchronized void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName()
                + " withdrew ₹" + amount + " | Balance: ₹" + balance);
        } else {
            System.out.println(Thread.currentThread().getName()
                + " ❌ Insufficient balance. Transaction declined.");
        }
    }
}
```

### 2️⃣ Running Concurrent Threads
```java
BankAccount account = new BankAccount(5000);

Runnable depositTask  = () -> account.deposit(1000);
Runnable withdrawTask = () -> account.withdraw(2000);

Thread t1 = new Thread(depositTask, "Thread-1");
Thread t2 = new Thread(withdrawTask, "Thread-2");

t1.start();
t2.start();
```

---

## 🔍 Multithreading – Quick Reference

| Concept | Keyword | Purpose |
|---------|---------|---------|
| Thread-safe balance updates | `synchronized` | One thread modifies balance at a time |
| Prevent negative balance | Conditional check inside `withdraw()` | Declines transaction if funds are insufficient |
| Concurrent execution | `Thread` | Simulates multiple simultaneous users |
| Data consistency | Shared `BankAccount` instance | Same object accessed safely by all threads |

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
cd "15. Java Multithreading - Bank Account Synchronization"
```

**3. Compile all Java files**
```bash
javac BankAccount.java BankAccountDemo.java
```

**4. Run the demo**
```bash
java BankAccountDemo
```

---

## 📌 Code Standards Followed

- ✅ `Javadoc /** */` comments explaining synchronization logic
- ✅ `PascalCase` for all class names
- ✅ `camelCase` for all variable and method names
- ✅ `synchronized` keyword applied correctly to both `deposit()` and `withdraw()`
- ✅ Balance validated before every withdrawal to prevent negative values
- ✅ Clean, readable, and well-formatted output

---

## 👤 Author

**[Sahran Hameed]**
🔗 [GitHub Profile](https://github.com/SahranHameed)

---

## 📄 License

This project is open source and available for educational purposes.
