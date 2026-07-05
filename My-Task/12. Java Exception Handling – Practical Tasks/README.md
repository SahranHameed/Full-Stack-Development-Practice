# ☕ Java Exception Handling – Practical Tasks

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![Tasks](https://img.shields.io/badge/Tasks-4%2F4-blue?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Intermediate-orange?style=for-the-badge)

> A Java project demonstrating core **Exception Handling** concepts — built-in exceptions, the `finally` block, and the `throw` / `throws` keywords — through four practical tasks.

---

## 📁 Project Structure

```
12. Java Exception Handling – Practical Tasks/
│
├── Task01_DivisionException.java   # ArithmeticException + InputMismatchException
├── Task02_FinallyBlock.java        # finally block guarantee
├── Task03_ThrowKeyword.java        # throw keyword for age validation
├── Task04_ThrowAndThrows.java      # throws Exception + throw for positive check
└── README.md
```

---

## 📋 Exception Handling Concepts Demonstrated

| # | Concept | Class / Component | How It's Used |
|---|---------|-------------------|---------------|
| 1 | **Built-in Exceptions** | `Task01_DivisionException` | Catches `ArithmeticException`, `InputMismatchException` |
| 2 | **Finally Block** | `Task02_FinallyBlock` | Guarantees "Program execution completed" message |
| 3 | **Throw Keyword** | `Task03_ThrowKeyword` | Manually throws `IllegalArgumentException` for age < 18 |
| 4 | **Throw & Throws** | `Task04_ThrowAndThrows` | Method declares `throws Exception`, calling method handles it |

---

## 🏗️ Task Design

```
Task01 - Division
├── try   → accept two integers, divide
├── catch (ArithmeticException)     → division by zero
└── catch (InputMismatchException)  → invalid input

Task02 - Finally
├── try     → divide two numbers
├── catch   → handle exception (if any)
└── finally → "Program execution completed" (always runs)

Task03 - Throw Keyword
├── accept student age
└── if (age < 18) → throw IllegalArgumentException

Task04 - Throw and Throws
├── checkPositive(int number) throws Exception
│   └── if (number < 0) → throw new Exception(...)
└── main() → try-catch calls checkPositive()
```

---

## 🎯 Sample Output

```
========================================
    EXCEPTION HANDLING DEMO
========================================

--- Task 01: Division ---
Enter first number: 10
Enter second number: 0
❌ Error: Cannot divide by zero.

--- Task 02: Finally Block ---
Enter numerator: 20
Enter denominator: 5
Result: 4.0
Program execution completed

--- Task 03: Throw Keyword ---
Enter student age: 15
❌ Error: Age must be 18 or above. Student is not eligible.

--- Task 04: Throw and Throws ---
Enter a number: -7
❌ Error: Number must be positive.

========================================
```

---

## 💡 Key Concepts with Code

### 1️⃣ Built-in Exception Handling
```java
try {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int num1 = sc.nextInt();
    System.out.print("Enter second number: ");
    int num2 = sc.nextInt();

    int result = num1 / num2;
    System.out.println("Result: " + result);
} catch (ArithmeticException e) {
    System.out.println("❌ Error: Cannot divide by zero.");
} catch (InputMismatchException e) {
    System.out.println("❌ Error: Please enter valid integers.");
}
```

### 2️⃣ Finally Block
```java
try {
    double result = numerator / denominator;
    System.out.println("Result: " + result);
} catch (ArithmeticException e) {
    System.out.println("❌ Error: Division by zero is not allowed.");
} finally {
    // Always executes, exception or not
    System.out.println("Program execution completed");
}
```

### 3️⃣ Throw Keyword
```java
if (age < 18) {
    throw new IllegalArgumentException("Age must be 18 or above. Student is not eligible.");
}
```

### 4️⃣ Throw and Throws
```java
static void checkPositive(int number) throws Exception {
    if (number < 0) {
        throw new Exception("Number must be positive.");
    }
    System.out.println(number + " is a positive number.");
}

public static void main(String[] args) {
    try {
        checkPositive(-7);
    } catch (Exception e) {
        System.out.println("❌ Error: " + e.getMessage());
    }
}
```

---

## 🔍 Exception Handling – Quick Reference

| Concept | Keyword | Purpose |
|---------|---------|---------|
| Catch known errors | `try-catch` | Handle runtime exceptions gracefully |
| Guaranteed cleanup | `finally` | Always executes regardless of exception |
| Manual exception | `throw` | Explicitly trigger an exception |
| Method contract | `throws` | Declare exceptions a method may raise |

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
cd "12. Java Exception Handling - Practical Tasks"
```

**3. Compile each file**
```bash
javac Task01_DivisionException.java
javac Task02_FinallyBlock.java
javac Task03_ThrowKeyword.java
javac Task04_ThrowAndThrows.java
```

**4. Run each task**
```bash
java Task01_DivisionException
java Task02_FinallyBlock
java Task03_ThrowKeyword
java Task04_ThrowAndThrows
```

---

## 📌 Code Standards Followed

- ✅ `Javadoc /** */` comments explaining exception handling logic
- ✅ `PascalCase` for all class names
- ✅ `camelCase` for all variable and method names
- ✅ Meaningful, user-friendly error messages
- ✅ Program continues gracefully after handling exceptions
- ✅ Clean, readable, and well-formatted output

---

## 👤 Author

**Sahran Hameed**
🔗 [GitHub Profile](https://github.com/SahranHameed)

---

## 📄 License

This project is open source and available for educational purposes.
