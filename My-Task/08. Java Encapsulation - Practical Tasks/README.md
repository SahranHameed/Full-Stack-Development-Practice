# ☕ Java Encapsulation – Practical Task

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![Tasks](https://img.shields.io/badge/Tasks-1%2F1-blue?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Intermediate-orange?style=for-the-badge)

> A practical Java program demonstrating Encapsulation using a BankAccount class with private attributes, getter/setter methods, deposit, and withdrawal functionality — built as part of a Full-Stack Web Development course.

---

## 📁 Project Structure

```
08. Java Encapsulation – Practical Task/
│
└── BankAccount.java    # BankAccount class with encapsulation, deposit & withdraw
```

---

## 📋 Task Summary

| Feature | Description |
|---------|-------------|
| **Private Attributes** | `accountNumber`, `accountHolderName`, `balance` |
| **Getters & Setters** | Public methods to access and update private fields |
| **deposit()** | Adds money to balance |
| **withdraw()** | Deducts money only if sufficient balance exists |
| **displayAccountDetails()** | Shows all account information |

---

## 🏗️ Class Design

```
BankAccount
├── Private Attributes
│   ├── accountNumber      (String)
│   ├── accountHolderName  (String)
│   └── balance            (double)
│
├── Getter Methods
│   ├── getAccountNumber()
│   ├── getAccountHolderName()
│   └── getBalance()
│
├── Setter Methods
│   ├── setAccountNumber(String)
│   ├── setAccountHolderName(String)
│   └── setBalance(double)
│
├── deposit(double amount)
│   └── balance += amount
│
├── withdraw(double amount)
│   └── if balance >= amount → balance -= amount
│   └── else → "Insufficient funds!" message
│
└── displayAccountDetails()
    └── Prints accountNumber, accountHolderName, balance
```

---

## 🎯 Sample Output

```
========================================
      BANK ACCOUNT MANAGEMENT
========================================

Account Details Set Successfully!

Depositing ₹5000.00...
✅ Deposit Successful! Amount Added: ₹5000.00

Withdrawing ₹2000.00...
✅ Withdrawal Successful! Amount Deducted: ₹2000.00

--- Updated Account Details ---
Account Number      : ACC-1001
Account Holder Name : Sahran Hameed
Current Balance     : ₹3000.00

========================================
```

---

## 💡 Key Concepts Learned

### 🔒 Encapsulation — Private Attributes
```java
public class BankAccount {
    // Private: cannot be accessed directly from outside
    private String accountNumber;
    private String accountHolderName;
    private double balance;
}
```

### 🔑 Getter & Setter Methods
```java
// Getter - Read the value
public String getAccountNumber() {
    return accountNumber;
}

// Setter - Update the value
public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
}
```

### 💰 Deposit Method
```java
public void deposit(double amount) {
    if (amount > 0) {
        balance += amount;
        System.out.println("✅ Deposit Successful! Amount Added: ₹" + amount);
    } else {
        System.out.println("❌ Invalid deposit amount.");
    }
}
```

### 💸 Withdraw Method (with Validation)
```java
public void withdraw(double amount) {
    if (amount > 0 && balance >= amount) {
        balance -= amount;
        System.out.println("✅ Withdrawal Successful! Amount Deducted: ₹" + amount);
    } else if (balance < amount) {
        System.out.println("❌ Insufficient funds! Current Balance: ₹" + balance);
    } else {
        System.out.println("❌ Invalid withdrawal amount.");
    }
}
```

---

## 🔍 Encapsulation Benefits

| Benefit | Explanation |
|---------|-------------|
| **Data Hiding** | Private fields can't be accessed or changed directly |
| **Controlled Access** | Only through getters/setters |
| **Validation** | Setters can validate before updating |
| **Security** | Balance can't be set to a negative value directly |

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
cd "Full-Stack-Development-Practice/My-Task/08. Java Encapsulation - Practical Task"
```

**3. Compile the Java file**
```bash
javac BankAccount.java
```

**4. Run the program**
```bash
java BankAccount
```

---

## 📌 Code Standards Followed

- ✅ `Javadoc /** */` comments for every class and method
- ✅ `PascalCase` for class name (`BankAccount`)
- ✅ `camelCase` for variable names (`accountNumber`, `balance`)
- ✅ All attributes are `private`
- ✅ All access methods are `public`
- ✅ Withdrawal validated before deducting
- ✅ K&R brace style
- ✅ Clean formatted output with currency symbol

---

## 👨‍💻 Author

**Sahran Hameed**
🔗 [GitHub Profile](https://github.com/SahranHameed)

---

## 📚 Part Of

This repository is part of the **Full-Stack Web Development Practicals** series.

| Module | Topic |
|--------|-------|
| 01 | [Java Operators & Control Flow Statements](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/01.%20Java%20Operators%20and%20Control%20Flow%20Statements%20Practical%20Tasks) |
| 02 | [Java While Loop](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/02.%20Java%20While%20Loop%20-%20Practical%20Tasks) |
| 03 | [Java For Loop & Nested For Loop](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/03.%20Java%20For%20Loop%20%26%20Nested%20For%20Loop%20-%20Practical%20Tasks) |
| 04 | [Java Arrays](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/04.%20Java%20Arrays%20-%20Practical%20Tasks) |
| 05 | [Java Arrays & Number Logic](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/05.%20Java%20Arrays%20%26%20Number%20Logic%20-%20Practical%20Tasks) |
| 06 | [Java Strings](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/06.%20Java%20Strings%20-%20Practical%20Tasks) |
| 07 | [Java Constructors](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/07.%20Java%20Constructors%20-%20Practical%20Task) |
| 08 | [Java Encapsulation](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/08.%20Java%20Encapsulation%20-%20Practical%20Task) |

👉 [View Full Repository](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main)

---

## 📄 License

This project is open source and available for educational purposes.
