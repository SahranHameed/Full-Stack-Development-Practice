# ☕ Java Stream API & Predicate – Employee Processing Task

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![Tasks](https://img.shields.io/badge/Tasks-10%2F10-blue?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Advanced-red?style=for-the-badge)

> 10 practical Java Stream API + Predicate tasks on employee data — filtering, sorting, grouping and aggregation — built as part of a Full-Stack Web Development course.

---

## 📁 Project Structure

```
21. Java Stream API & Predicate/
│
└── EmployeeProcessing.java    # All 10 Stream API tasks in one file
```

> The data class is called `Staff` (not `Employee`) in this file. It's the same idea as the PDF's "Employee" class, just renamed so it doesn't clash with the `Employee` class used in Task 22 (Optional Class) when both files sit in the same project.

---

## 📋 Task Summary

| # | Description | Stream Operation |
|---|-------------|-------------------|
| 01 | Salary > ₹60,000 employees | `filter()` + `Predicate` |
| 02 | IT dept + age > 30 | `filter()` with multiple conditions |
| 03 | Count age > 30 | `filter()` + `count()` |
| 04 | Highest paid employee | `max()` |
| 05 | Names in uppercase | `map()` |
| 06 | Average salary | `average()` |
| 07 | Group by department | `groupingBy()` |
| 08 | Sort by salary descending | `sorted()` |
| 09 | First employee salary > ₹80,000 | `findFirst()` |
| 10 | Second highest salary | `sorted()` + `skip()` |

---

## 🎯 Actual Program Output

```
EMPLOYEE PROCESSING - STREAM API
==================================

Task 01: Salary > Rs.60000
Alice | IT | Age:32 | Rs.75000.0
Charlie | HR | Age:35 | Rs.80000.0
Eve | IT | Age:38 | Rs.90000.0
Grace | HR | Age:42 | Rs.95000.0

Task 02: IT dept and age above 30
Alice | IT | Age:32 | Rs.75000.0
Eve | IT | Age:38 | Rs.90000.0

Task 03: Count employees with age > 30
Count: 4

Task 04: Highest paid employee
Grace | HR | Age:42 | Rs.95000.0

Task 05: Names in uppercase
ALICE
BOB
CHARLIE
DIANA
EVE
FRANK
GRACE

Task 06: Average salary
Average: Rs.69000.0

Task 07: Group by department
Finance -> Bob Diana
HR -> Charlie Grace
IT -> Alice Eve Frank

Task 08: Sorted by salary (high to low)
Grace | HR | Age:42 | Rs.95000.0
Eve | IT | Age:38 | Rs.90000.0
Charlie | HR | Age:35 | Rs.80000.0
Alice | IT | Age:32 | Rs.75000.0
Diana | Finance | Age:28 | Rs.55000.0
Frank | IT | Age:29 | Rs.48000.0
Bob | Finance | Age:25 | Rs.40000.0

Task 09: First employee with salary > Rs.80000
Eve | IT | Age:38 | Rs.90000.0

Task 10: Second highest salary
Second highest: Rs.90000.0 (Eve)

All 10 stream tasks completed.
```

---

## 💡 Key Concepts Learned

### 👤 Staff Class
```java
class Staff {
    int id;
    String name;
    int age;
    double salary;
    String department;
}
```

### 🔍 Predicate — Task 01
```java
Predicate<Staff> highSalary = e -> e.salary > 60000;

employees.stream()
         .filter(highSalary)
         .forEach(System.out::println);
```

### 🔍 Multiple Conditions — Task 02
```java
employees.stream()
         .filter(e -> e.department.equals("IT") && e.age > 30)
         .forEach(System.out::println);
```

### 🔢 Count — Task 03
```java
long count = employees.stream()
                      .filter(e -> e.age > 30)
                      .count();
```

### 🏆 Max — Task 04
```java
employees.stream()
         .max(Comparator.comparingDouble(e -> e.salary))
         .ifPresent(System.out::println);
```

### 🔤 Map Uppercase — Task 05
```java
employees.stream()
         .map(e -> e.name.toUpperCase())
         .forEach(System.out::println);
```

### 📊 Average — Task 06
```java
OptionalDouble avg = employees.stream()
    .mapToDouble(e -> e.salary)
    .average();
```

### 🗂️ Group By — Task 07
```java
Map<String, List<Staff>> grouped = employees.stream()
    .collect(Collectors.groupingBy(e -> e.department));
```

### 🔃 Sort Descending — Task 08
```java
employees.stream()
         .sorted((e1, e2) -> Double.compare(e2.salary, e1.salary))
         .forEach(System.out::println);
```

### 🎯 FindFirst — Task 09
```java
employees.stream()
         .filter(e -> e.salary > 80000)
         .findFirst()
         .ifPresent(System.out::println);
```

### 2️⃣ Second Highest — Task 10
```java
employees.stream()
         .sorted((e1, e2) -> Double.compare(e2.salary, e1.salary))
         .skip(1)   // skip the highest
         .findFirst()
         .ifPresent(e -> System.out.println("Second highest: Rs." + e.salary));
```

---

## 🔍 Stream API vs Traditional Loop

| Operation | Traditional Loop | Stream API |
|-----------|-------------------|------------|
| Filter | `if` inside `for` | `.filter()` |
| Transform | Manual loop | `.map()` |
| Count | Counter variable | `.count()` |
| Sort | `Collections.sort()` | `.sorted()` |
| Group | Manual HashMap | `.collect(groupingBy())` |

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
cd "Full-Stack-Development-Practice/My-Task/21. Java Stream API & Predicate"
```

**3. Compile**
```bash
javac EmployeeProcessing.java
```

**4. Run**
```bash
java EmployeeProcessing
```

---

## 📌 Code Standards Followed

- ✅ Comments explaining Stream API and Predicate logic
- ✅ `Predicate` used for filtering operations
- ✅ All 10 stream operations demonstrated
- ✅ `PascalCase` for class names, lambda expressions used throughout
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
| 17 | [Java Deadlock & Inter-Thread Communication](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/17.%20Java%20Deadlock%20%26%20Inter-Thread%20Communication) |
| 18 | [Java File Handling](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/18.%20Java%20File%20Handling) |
| 19 | [Java Mini Project - Bus Reservation System](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/19.%20Java%20Mini%20Project%20-%20Bus%20Reservation%20System) |
| 21 | [Java Stream API & Predicate](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/21.%20Java%20Stream%20API%20%26%20Predicate) |

👉 [View Full Repository](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main)

---

## 📄 License

This project is open source and available for educational purposes.
