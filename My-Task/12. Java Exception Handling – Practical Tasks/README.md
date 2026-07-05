# Java Exception Handling – Practical Tasks

## 📋 Overview
This repository contains Java programs demonstrating **exception handling concepts**, including built-in exceptions, the `finally` block, and the `throw`/`throws` keywords.

## 🎯 Tasks

### Task 01 – Built-in Exception Handling
- Accepts two integers from the user and performs division.
- Handles `ArithmeticException` (division by zero).
- Handles `InputMismatchException` (invalid input).

### Task 02 – Finally Block
- Performs division of two numbers.
- Uses a `finally` block to display **"Program execution completed"** regardless of whether an exception occurs.

### Task 03 – Throw Keyword
- Accepts a student's age.
- If age < 18, explicitly throws `IllegalArgumentException` using the `throw` keyword.
- Displays an appropriate message.

### Task 04 – Throw and Throws
- Checks whether a number is positive.
- Uses a method declared with `throws Exception`.
- Uses `throw` to generate an exception for negative numbers.
- Handles the exception in the calling method.

## 🛠️ Requirements
- Java JDK 8 or above
- Any IDE (IntelliJ IDEA, Eclipse, VS Code) or command line

## ▶️ How to Run
```bash
javac Task01_DivisionException.java
java Task01_DivisionException
```
(Repeat similarly for Task02, Task03, Task04)

## 📂 Project Structure
```
├── Task01_DivisionException.java
├── Task02_FinallyBlock.java
├── Task03_ThrowKeyword.java
├── Task04_ThrowAndThrows.java
└── README.md
```

## ✅ Key Concepts Demonstrated
- Built-in exception handling (`try-catch`)
- `finally` block execution guarantee
- Custom validation using `throw`
- Method-level exception declaration using `throws`

## 👤 Author
Submitted as part of MarsTech Java Programming Training – Task 12
