# ☕ Java Arrays & Number Logic – Practical Tasks

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![Tasks](https://img.shields.io/badge/Tasks-11%2F11-blue?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Beginner-yellow?style=for-the-badge)

> A collection of 11 practical Java programs covering advanced array operations and number logic — including Prime, Palindrome, and Armstrong number checks — built as part of a Full-Stack Web Development course.

---

## 📁 Project Structure

```
05. Java Arrays & Number Logic/
│
├── Task01_LargestElement.java         # Find the largest element in an array
├── Task02_SmallestElement.java        # Find the smallest element in an array
├── Task03_EvenOddCount.java           # Count even and odd numbers
├── Task04_ReverseArray.java           # Reverse an array
├── Task05_ReverseOrder.java           # Print array elements in reverse order
├── Task06_SecondLargest.java          # Find the second largest element
├── Task07_FindDuplicates.java         # Find duplicate elements in array
├── Task08_RemoveDuplicates.java       # Remove duplicate elements from array
├── Task09_PrimeCheck.java             # Check whether a number is Prime
├── Task10_PalindromeCheck.java        # Check whether a number is Palindrome
└── Task11_ArmstrongCheck.java         # Check whether a number is Armstrong (while loop)
```

---

## 📋 Task Summary

| # | Program | Description | Concept Used |
|---|---------|-------------|--------------|
| 01 | Largest Element | Max value in array | Loop + comparison |
| 02 | Smallest Element | Min value in array | Loop + comparison |
| 03 | Even & Odd Count | Count by type | Modulus `%` operator |
| 04 | Reverse Array | Flip the array | Two-pointer swap |
| 05 | Reverse Print | Print without reversing | Reverse index loop |
| 06 | Second Largest | 2nd max value | Two-variable tracking |
| 07 | Find Duplicates | Spot repeated values | Nested loop |
| 08 | Remove Duplicates | Keep unique values only | Nested loop logic |
| 09 | Prime Check | Is number prime? | Loop divisibility check |
| 10 | Palindrome Check | Is number palindrome? | Digit reverse + compare |
| 11 | Armstrong Check | Is number Armstrong? | `while` loop + power |

---

## 🎯 Sample Outputs

### Task 01 — Largest Element
```
Array: [3, 8, 1, 6, 4]
Largest Element: 8
```

### Task 02 — Smallest Element
```
Array: [3, 8, 1, 6, 4]
Smallest Element: 1
```

### Task 03 — Even & Odd Count
```
Array: [1, 2, 3, 4, 5, 6, 7, 8]
Even Count: 4
Odd Count : 4
```

### Task 04 — Reverse Array
```
Original Array : [1, 2, 3, 4, 5]
Reversed Array : [5, 4, 3, 2, 1]
```

### Task 05 — Print in Reverse Order
```
Array         : [1, 2, 3, 4, 5]
Reverse Order : 5 4 3 2 1
```

### Task 06 — Second Largest
```
Array: [5, 2, 9, 1, 7]
Second Largest Element: 7
```

### Task 07 — Find Duplicates
```
Array: [1, 2, 3, 2, 4, 3, 5]
Duplicate Elements: 2, 3
```

### Task 08 — Remove Duplicates
```
Original : [1, 2, 2, 3, 4, 4, 5]
Unique   : [1, 2, 3, 4, 5]
```

### Task 09 — Prime Check
```
Enter a number: 7
7 is a Prime Number ✅
```
```
Enter a number: 9
9 is NOT a Prime Number ❌
```

### Task 10 — Palindrome Check
```
Enter a number: 121
121 is a Palindrome Number ✅
```
```
Enter a number: 123
123 is NOT a Palindrome Number ❌
```

### Task 11 — Armstrong Check
```
Enter a number: 153
153 is an Armstrong Number ✅
(1³ + 5³ + 3³ = 1 + 125 + 27 = 153)
```
```
Enter a number: 100
100 is NOT an Armstrong Number ❌
```

---

## 💡 Key Concepts Learned

### 🔢 Prime Number Logic (Task 09)
```java
boolean isPrime = true;
for (int i = 2; i <= number / 2; i++) {
    if (number % i == 0) {
        isPrime = false;
        break;
    }
}
```

### 🔁 Palindrome Number Logic (Task 10)
```java
int original = number;
int reversed = 0;

while (number > 0) {
    int digit = number % 10;
    reversed = reversed * 10 + digit;
    number /= 10;
}

if (original == reversed) → Palindrome ✅
```

### 💪 Armstrong Number Logic — while loop (Task 11)
```java
int original = number;
int sum = 0;

while (number > 0) {
    int digit = number % 10;
    sum += digit * digit * digit;  // cube of each digit
    number /= 10;
}

if (original == sum) → Armstrong ✅
// Example: 153 = 1³ + 5³ + 3³ = 153
```

---

## 🔍 Logic Summary

| Task | Key Logic |
|------|-----------|
| 01 & 02 | Track max/min through single loop |
| 03 | `num % 2 == 0` → even, else odd |
| 04 | Swap from both ends using two pointers |
| 05 | Loop from `length-1` down to `0` |
| 06 | Maintain `largest` and `secondLargest` variables |
| 07 | Nested loop: compare each pair |
| 08 | Check if element already added to result |
| 09 | Loop from 2 to n/2, check divisibility |
| 10 | Reverse digits with while loop, compare |
| 11 | Extract digits with `%10`, cube and sum using while loop |

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
cd "Full-Stack-Development-Practice/My-Task/05. Java Arrays & Number Logic - Practical Tasks"
```

**3. Compile a Java file**
```bash
javac Task09_PrimeCheck.java
```

**4. Run the program**
```bash
java Task09_PrimeCheck
```

---

## 📌 Code Standards Followed

- ✅ `Javadoc /** */` comments for every class
- ✅ `PascalCase` for class names
- ✅ `camelCase` for variable names
- ✅ `while` loop used for Armstrong number (as required)
- ✅ No built-in shortcut methods used
- ✅ Meaningful variable names (`original`, `reversed`, `digit`)
- ✅ K&R brace style
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
| 01 | [Java Operators & Control Flow Statements](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/01.%20Java%20Operators%20and%20Control%20Flow%20Statements%20Practical%20Tasks) |
| 02 | [Java While Loop](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/02.%20Java%20While%20Loop%20-%20Practical%20Tasks) |
| 03 | [Java For Loop & Nested For Loop](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/03.%20Java%20For%20Loop%20%26%20Nested%20For%20Loop%20-%20Practical%20Tasks) |
| 04 | [Java Arrays](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/04.%20Java%20Arrays%20-%20Practical%20Tasks) |
| 05 | [Java Arrays & Number Logic](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/05.%20Java%20Arrays%20%26%20Number%20Logic%20-%20Practical%20Tasks) |

👉 [View Full Repository](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main)

---

## 📄 License

This project is open source and available for educational purposes.
