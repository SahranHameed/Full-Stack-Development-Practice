# ☕ Java While Loop – Practical Tasks

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![Tasks](https://img.shields.io/badge/Tasks-10%2F10-blue?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Beginner-yellow?style=for-the-badge)

> A collection of 10 practical Java programs covering while loop concepts including counting, summing, reversing, factorial, palindrome, Fibonacci series, and a menu-driven calculator — built as part of a Full-Stack Web Development course.

---

## 📁 Project Structure

```
02. Java While Loop/
│
├── Task01_PrintOneToHundred.java      # Print numbers from 1 to 100
├── Task02_OddNumbers.java             # Print odd numbers between 1 and 50
├── Task03_SumOfEven.java              # Sum of even numbers from 1 to N
├── Task04_MultiplicationTable.java    # Multiplication table of a given number
├── Task05_ReverseNumber.java          # Reverse a given number
├── Task06_CountDigits.java            # Count the digits in a number
├── Task07_Factorial.java              # Factorial of a number
├── Task08_PalindromeCheck.java        # Palindrome number checker
├── Task09_FibonacciSeries.java        # Fibonacci series up to N terms
└── Task10_MenuCalculator.java         # Menu-driven calculator with exit option
```

---

## 📋 Task Summary

| # | Program | Concept Used |
|---|---------|-------------|
| 01 | Print 1 to 100 | Basic `while` loop, counter variable |
| 02 | Odd Numbers (1–50) | `while` + `if`, modulo `%` operator |
| 03 | Sum of Even Numbers | `while` + accumulator (`sum +=`) |
| 04 | Multiplication Table | `while` with index counter `i` |
| 05 | Reverse a Number | `% 10` digit extraction, `/ 10` removal |
| 06 | Count Digits | `/ 10` loop, digit counter |
| 07 | Factorial | `*=` accumulator, `long` data type |
| 08 | Palindrome Checker | Reverse logic + equality check |
| 09 | Fibonacci Series | Two-variable swap technique |
| 10 | Menu-Driven Calculator | `while` + `switch`, exit condition |

---

## 💡 Key Concepts Learned

### 🔁 While Loop Structure
```java
int i = 1;                  // 1. Initialize
while (i <= 100) {          // 2. Condition check
    System.out.println(i);  // 3. Execute body
    i++;                    // 4. Update (increment)
}
```

### 🔢 Digit Extraction Logic (Task 05, 06, 08)
```java
// Used in Reverse, Count Digits, and Palindrome
while (number != 0) {
    int remainder = number % 10;   // Get last digit
    number = number / 10;          // Remove last digit
}
```

### ➕ Accumulator Pattern (Task 03, 07)
```java
// Used in Sum of Even and Factorial
int sum = 0;
while (i <= n) {
    sum += i;   // Keep adding to sum
    i++;
}
```

### 🌀 Fibonacci Swap Technique (Task 09)
```java
int first = 0, second = 1;
while (count <= n) {
    System.out.print(first + " ");
    int next = first + second;
    first = second;
    second = next;
    count++;
}
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
cd "Full-Stack-Web-Development-Practicals/Java Practicals/02. Java While Loop"
```

**3. Compile a Java file**
```bash
javac Task01_PrintOneToHundred.java
```

**4. Run the program**
```bash
java Task01_PrintOneToHundred
```

---

## 🎯 Sample Outputs

**Task 05 — Reverse a Number**
```
=============================
        REVERSE A NUMBER
=============================
Enter a Number: 1234

Original Number : 1234
Reversed Number : 4321
=============================
```

**Task 08 — Palindrome Checker**
```
=============================
     PALINDROME CHECKER
=============================
Enter a Number: 121

121 is a Palindrome Number ✔
=============================
```

**Task 09 — Fibonacci Series**
```
=============================
       FIBONACCI SERIES
=============================
Enter Number of Terms (N): 7

Fibonacci Series: 0 1 1 2 3 5 8
=============================
```

**Task 10 — Menu Calculator**
```
=============================
     MENU DRIVEN CALCULATOR
=============================

1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Exit
-----------------------------
Enter Your Choice (1-5): 1
Enter the First Number : 10
Enter the Second Number: 20

Result: 10.0 + 20.0 = 30.0
-----------------------------
```

---

## 📌 Code Standards Followed

- ✅ `Javadoc /** */` comments for every class
- ✅ `camelCase` for variable names
- ✅ `PascalCase` for class names
- ✅ `try-with-resources` for Scanner (auto-close)
- ✅ Input validation for invalid entries
- ✅ K&R brace style `} else {`
- ✅ `System.out.print` for input prompts
- ✅ Header & Footer formatting
- ✅ `long` datatype for large numbers (Factorial)
- ✅ Division by zero check (Task 10)

---

## 👨‍💻 Author

**Sahran Hameed**
🔗 [GitHub Profile](https://github.com/SahranHameed)

---

## 📚 Part Of

This repository is part of the **Full-Stack Web Development Practicals** series.

| Module | Topic |
|--------|-------|
| 01 | [Java While Loop - Practical Tasks](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/02.%20Java%20While%20Loop%20-%20Practical%20Tasks) |
| 02 | Java While Loop ← You are here |

👉 [View Full Repository](https://github.com/affasaleem/Full-Stack-Web-Development-Practicals)

---

## 📄 License

This project is open source and available for educational purposes.
