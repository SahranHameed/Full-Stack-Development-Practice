# ☕ Java For Loop & Nested For Loop – Practical Tasks

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![Tasks](https://img.shields.io/badge/Tasks-5%2F5-blue?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Beginner-yellow?style=for-the-badge)

> A collection of 5 practical Java programs covering for loop and nested for loop pattern printing — including star patterns, number patterns, right triangle, and diamond shape — built as part of a Full-Stack Web Development course.

---

## 📁 Project Structure

```
03. Java For Loop & Nested For Loop/
│
├── Task01_StarPattern.java            # Increasing star pattern (*)
├── Task02_ReverseStarPattern.java     # Decreasing star pattern (*****)
├── Task03_NumberPattern.java          # Increasing number pattern (1, 12, 123...)
├── Task04_RightTrianglePattern.java   # Right triangle with spaces and odd stars
└── Task05_DiamondPattern.java         # Full diamond shape pattern
```

---

## 📋 Task Summary

| # | Program | Pattern Type | Concept Used |
|---|---------|-------------|-------------|
| 01 | Star Pattern | Increasing `*` | Outer loop + Inner loop |
| 02 | Reverse Star Pattern | Decreasing `*` | Reverse outer loop (`i--`) |
| 03 | Number Pattern | `1`, `12`, `123`... | Nested for, `j` as number |
| 04 | Right Triangle | Spaces + odd stars | Space loop + star loop |
| 05 | Diamond Pattern | Full diamond shape | Upper half + Lower half loops |

---

## 🎯 Pattern Outputs

### Task 01 — Star Pattern
```
*
**
***
****
*****
```

### Task 02 — Reverse Star Pattern
```
*****
****
***
**
*
```

### Task 03 — Number Pattern
```
1
12
123
1234
12345
```

### Task 04 — Right Triangle Star Pattern
```
    *
   ***
  *****
 *******
*********
```

### Task 05 — Diamond Star Pattern
```
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
```

---

## 💡 Key Concepts Learned

### 🔁 Basic For Loop Structure
```java
for (int i = 1; i <= 5; i++) {
    // executes 5 times
}
```

### 🔁🔁 Nested For Loop Structure
```java
// Outer loop = rows
for (int i = 1; i <= 5; i++) {
    // Inner loop = columns
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println(); // new line after each row
}
```

### 📐 Space + Star Formula (Task 04 & 05)
```java
// Spaces  = rows - i      (decreasing spaces)
// Stars   = 2 * i - 1     (odd stars: 1, 3, 5, 7, 9)

for (int space = 1; space <= rows - i; space++) {
    System.out.print(" ");
}
for (int j = 1; j <= (2 * i - 1); j++) {
    System.out.print("*");
}
```

### 💎 Diamond Logic (Task 05)
```java
// Upper Half → i goes from 1 to rows (increasing stars)
// Lower Half → i goes from rows-1 to 1 (decreasing stars)
```

---

## 🔍 Pattern Logic Explained

| Task | Outer Loop | Inner Loop | Special Logic |
|------|-----------|-----------|--------------|
| 01 | `i = 1 to 5` | `j = 1 to i` | Print `*` |
| 02 | `i = 5 to 1` | `j = 1 to i` | `i--` reverse |
| 03 | `i = 1 to 5` | `j = 1 to i` | Print `j` (number) |
| 04 | `i = 1 to 5` | Space + Star loops | `2*i-1` odd stars |
| 05 | Upper + Lower | Space + Star loops | Two separate for blocks |

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
cd "Full-Stack-Development-Practice/My-Task/03.Java For Loop &Nested For Loop - Practical Tasks"
```

**3. Compile a Java file**
```bash
javac Task01_StarPattern.java
```

**4. Run the program**
```bash
java Task01_StarPattern
```

---

## 📌 Code Standards Followed

- ✅ `Javadoc /** */` comments for every class
- ✅ `PascalCase` for class names
- ✅ `camelCase` for variable names (`rows`, `space`)
- ✅ Meaningful loop variable names (`i` = row, `j` = column, `space` = spaces)
- ✅ K&R brace style `} else {`
- ✅ Comments explaining each loop's purpose
- ✅ Header & Footer formatting
- ✅ `System.out.print` for same-line output
- ✅ `System.out.println()` for new line after each row

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

| 03 | [Java For Loop & Nested For Loop](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/03.%20Java%20For%20Loop%20%26%20Nested%20For%20Loop%20-%20Practical%20Tasks)|

👉 [View Full Repository](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main)

---

## 📄 License

This project is open source and available for educational purposes.
