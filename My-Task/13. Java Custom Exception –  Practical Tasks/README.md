# ☕ Java Custom Exception – Bank Account Withdrawal

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![Tasks](https://img.shields.io/badge/Tasks-1%2F1-blue?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Intermediate-orange?style=for-the-badge)

> A Java project demonstrating **custom exception handling** through a `BankAccount` withdrawal system, built using proper Object-Oriented Programming principles.

---

## 📁 Project Structure

```
13. Java Custom Exception – Practical Task/
│
├── InsufficientBalanceException.java   # Custom checked exception
├── BankAccount.java                    # accountNumber, accountHolderName, balance, withdraw()
├── Main.java                           # Demonstrates the withdrawal flow
└── README.md
```

---

## 📋 Concepts Demonstrated

| # | Concept | Class / Component | How It's Used |
|---|---------|-------------------|---------------|
| 1 | **Custom Exception** | `InsufficientBalanceException` | Extends `Exception`, thrown on insufficient funds |
| 2 | **Encapsulation** | `BankAccount` | Private fields: `accountNumber`, `accountHolderName`, `balance` |
| 3 | **Exception Throwing** | `withdraw()` | Throws `InsufficientBalanceException` when amount > balance |
| 4 | **Exception Handling** | `Main` | `try-catch` around `withdraw()` call |

---

## 🏗️ Class Design

```
InsufficientBalanceException  (extends Exception)
└── custom message constructor

BankAccount
├── private: accountNumber, accountHolderName, balance
├── getters
└── withdraw(double amount)
    ├── if (amount > balance) → throw InsufficientBalanceException
    └── else → deduct amount, update balance

Main
├── create BankAccount object
├── accept withdrawal amount
└── try { account.withdraw(amount) }
    catch (InsufficientBalanceException e) → display error message
```

---

## 🎯 Sample Output

```
========================================
    BANK ACCOUNT WITHDRAWAL DEMO
========================================

Account Number : ACC1001
Account Holder  : Sahran Hameed
Current Balance : ₹5000.0

Enter withdrawal amount: 7000
❌ Error: Insufficient balance. Available balance is ₹5000.0

--- Retry with valid amount ---
Enter withdrawal amount: 2000
✅ Withdrawal successful!
Remaining Balance: ₹3000.0

========================================
```

---

## 💡 Key Concepts with Code

### 1️⃣ Custom Exception Class
```java
public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
```

### 2️⃣ BankAccount Class (Encapsulation + Withdraw Logic)
```java
public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance. Available balance is ₹" + balance);
        }
        balance -= amount;
        System.out.println("✅ Withdrawal successful!");
        System.out.println("Remaining Balance: ₹" + balance);
    }
}
```

### 3️⃣ Handling the Exception — Main Class
```java
try {
    account.withdraw(withdrawalAmount);
} catch (InsufficientBalanceException e) {
    System.out.println("❌ Error: " + e.getMessage());
}
```

---

## 🔍 Custom Exception – Quick Reference

| Concept | Keyword | Purpose |
|---------|---------|---------|
| Define custom error type | `extends Exception` | Create a domain-specific exception |
| Raise the custom error | `throw` | Signal insufficient balance |
| Handle gracefully | `try-catch` | Prevent abrupt program termination |
| Protect data | `private` + getters | Encapsulate account details |

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
cd "13. Java Custom Exception - Practical Task"
```

**3. Compile all Java files**
```bash
javac InsufficientBalanceException.java BankAccount.java Main.java
```

**4. Run the main class**
```bash
java Main
```

---

## 📌 Code Standards Followed

- ✅ `Javadoc /** */` comments explaining custom exception logic
- ✅ `PascalCase` for all class names
- ✅ `camelCase` for all variable and method names
- ✅ User-defined exception class following Java naming conventions
- ✅ Clean and readable console output
- ✅ Object-oriented design principles followed throughout

---

## 👤 Author

**[Sahran Hameed]**
🔗 [GitHub Profile](https://github.com/SahranHameed)

---

## 📄 License

This project is open source and available for educational purposes.
