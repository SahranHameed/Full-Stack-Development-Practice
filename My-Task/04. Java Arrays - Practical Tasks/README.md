# ☕ Java Arrays – Practical Tasks

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![Tasks](https://img.shields.io/badge/Tasks-10%2F10-blue?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Beginner-yellow?style=for-the-badge)

> A collection of 10 practical Java programs covering array operations — including finding largest/smallest elements, reversing arrays, removing duplicates, and rotating arrays — built as part of a Full-Stack Web Development course.

---

## 📁 Project Structure

```
04. Java Arrays – Practical Tasks/
│
├── Task01_LargestElement.java         # Find the largest element in an array
├── Task02_SmallestElement.java        # Find the smallest element in an array
├── Task03_SumOfElements.java          # Calculate sum of all elements
├── Task04_AverageOfElements.java      # Calculate average of array elements
├── Task05_EvenOddCount.java           # Count even and odd elements
├── Task06_SearchElement.java          # Search for a specific element
├── Task07_ReverseArray.java           # Reverse array without built-in methods
├── Task08_SecondLargest.java          # Find the second largest element
├── Task09_RemoveDuplicates.java       # Remove duplicate elements
└── Task10_RotateArray.java            # Rotate array to the right by one position
```

---

## 📋 Task Summary

| # | Program | Description | Concept Used |
|---|---------|-------------|--------------|
| 01 | Largest Element | Find max value in array | Loop + comparison |
| 02 | Smallest Element | Find min value in array | Loop + comparison |
| 03 | Sum of Elements | Total of all array values | Accumulator loop |
| 04 | Average | Sum divided by length | Arithmetic |
| 05 | Even & Odd Count | Count even and odd numbers | Modulus `%` operator |
| 06 | Search Element | Linear search in array | Loop + condition |
| 07 | Reverse Array | Flip array without built-ins | Two-pointer swap |
| 08 | Second Largest | Find 2nd max value | Two-variable tracking |
| 09 | Remove Duplicates | Unique elements only | Nested loop logic |
| 10 | Rotate Right | Shift elements right by one | Temp variable + loop |

---

## 🎯 Sample Outputs

### Task 01 — Largest Element
```
Array: [5, 2, 9, 1, 7]
Largest Element: 9
```

### Task 02 — Smallest Element
```
Array: [5, 2, 9, 1, 7]
Smallest Element: 1
```

### Task 03 — Sum of Elements
```
Array: [5, 2, 9, 1, 7]
Sum of Elements: 24
```

### Task 04 — Average of Elements
```
Array: [5, 2, 9, 1, 7]
Average: 4.8
```

### Task 05 — Even & Odd Count
```
Array: [1, 2, 3, 4, 5, 6]
Even Count: 3
Odd Count : 3
```

### Task 06 — Search Element
```
Array: [10, 20, 30, 40, 50]
Search: 30
Element 30 found at index 2
```

### Task 07 — Reverse Array
```
Original Array : [1, 2, 3, 4, 5]
Reversed Array : [5, 4, 3, 2, 1]
```

### Task 08 — Second Largest
```
Array: [5, 2, 9, 1, 7]
Second Largest Element: 7
```

### Task 09 — Remove Duplicates
```
Original Array : [1, 2, 2, 3, 4, 4, 5]
After Removing : [1, 2, 3, 4, 5]
```

### Task 10 — Rotate Right
```
Original Array : [1, 2, 3, 4, 5]
After Rotation : [5, 1, 2, 3, 4]
```

---

## 💡 Key Concepts Learned

### 🔢 Array Declaration & Initialization
```java
int[] numbers = {5, 2, 9, 1, 7};
int length = numbers.length;
```

### 🔁 Basic Array Loop
```java
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

### 🔄 Two-Pointer Reverse Logic (Task 07)
```java
int start = 0;
int end = numbers.length - 1;

while (start < end) {
    int temp = numbers[start];
    numbers[start] = numbers[end];
    numbers[end] = temp;
    start++;
    end--;
}
```

### 🔃 Rotate Right Logic (Task 10)
```java
int lastElement = numbers[numbers.length - 1];
for (int i = numbers.length - 1; i > 0; i--) {
    numbers[i] = numbers[i - 1];
}
numbers[0] = lastElement;
```

---

## 🔍 Logic Summary

| Task | Key Logic |
|------|-----------|
| 01 & 02 | Track max/min with a variable, loop through array |
| 03 & 04 | Accumulate sum, divide for average |
| 05 | Use `% 2 == 0` to check even/odd |
| 06 | Compare each element, print index if found |
| 07 | Swap elements from both ends toward center |
| 08 | Track largest and second largest separately |
| 09 | Check each element against previous unique ones |
| 10 | Save last element, shift right, place at index 0 |

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
cd "Full-Stack-Development-Practice/My-Task/04. Java Arrays - Practical Tasks"
```

**3. Compile a Java file**
```bash
javac Task01_LargestElement.java
```

**4. Run the program**
```bash
java Task01_LargestElement
```

---

## 📌 Code Standards Followed

- ✅ `Javadoc /** */` comments for every class
- ✅ `PascalCase` for class names
- ✅ `camelCase` for variable names
- ✅ Meaningful variable names (`numbers`, `largest`, `sum`)
- ✅ K&R brace style `} else {`
- ✅ Comments explaining each loop's purpose
- ✅ No built-in shortcut methods used for logic tasks
- ✅ Clean and user-friendly output formatting

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

👉 [View Full Repository](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main)

---

## 📄 License

This project is open source and available for educational purposes.
