# ☕ Java Stream API & Predicate – Employee Processing Task

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![Tasks](https://img.shields.io/badge/Tasks-10%2F10-blue?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Advanced-red?style=for-the-badge)

> A collection of 10 practical Java programs using Stream API and Predicate to process Employee data — including filtering, sorting, grouping, and aggregation operations — built as part of a Full-Stack Web Development course.

---

## 📁 Project Structure

```
21. Java Stream API & Predicate/
│
└── EmployeeProcessing.java    # All 10 Stream API tasks in one file
```

---

## 📋 Task Summary

| # | Description | Stream Operation |
|---|-------------|-----------------|
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

## 🎯 Sample Outputs

### Task 01 — Salary > ₹60,000
```
Employees with salary > Rs.60,000:
  Alice   | IT    | Rs.75,000
  Charlie | HR    | Rs.80,000
  Eve     | IT    | Rs.90,000
```

### Task 02 — IT Department + Age > 30
```
IT Department employees older than 30:
  Alice | Age: 32 | Rs.75,000
  Eve   | Age: 35 | Rs.90,000
```

### Task 03 — Count Age > 30
```
Number of employees with age > 30: 3
```

### Task 04 — Highest Paid
```
Highest Paid Employee:
  Name: Eve | Department: IT | Salary: Rs.90,000
```

### Task 05 — Names Uppercase
```
Employee Names (Uppercase):
  ALICE | BOB | CHARLIE | DIANA | EVE
```

### Task 06 — Average Salary
```
Average Salary of all employees: Rs.68,000.00
```

### Task 07 — Group by Department
```
Employees by Department:
  IT  → [Alice, Eve]
  HR  → [Charlie]
  Finance → [Bob, Diana]
```

### Task 08 — Sort by Salary (Descending)
```
Employees sorted by salary (High to Low):
  Eve     | Rs.90,000
  Charlie | Rs.80,000
  Alice   | Rs.75,000
  Diana   | Rs.55,000
  Bob     | Rs.40,000
```

### Task 09 — First Employee Salary > ₹80,000
```
First employee with salary > Rs.80,000:
  Eve | IT | Rs.90,000
```

### Task 10 — Second Highest Salary
```
Second Highest Salary: Rs.80,000 (Charlie - HR)
```

---

## 💡 Key Concepts Learned

### 👤 Employee Class
```java
class Employee {
    int    id;
    String name;
    int    age;
    double salary;
    String department;
}
```

### 🔍 Predicate — Task 01
```java
// Predicate = a condition that returns true/false
Predicate<Employee> highSalary = e -> e.salary > 60000;

employees.stream()
         .filter(highSalary)
         .forEach(System.out::println);
```

### 🔍 Multiple Filter — Task 02
```java
employees.stream()
         .filter(e -> e.department.equals("IT"))
         .filter(e -> e.age > 30)
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
Optional<Employee> highest = employees.stream()
    .max(Comparator.comparingDouble(e -> e.salary));
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
Map<String, List<Employee>> grouped = employees.stream()
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
Optional<Employee> first = employees.stream()
    .filter(e -> e.salary > 80000)
    .findFirst();
```

### 2️⃣ Second Highest — Task 10
```java
Optional<Employee> second = employees.stream()
    .sorted((e1, e2) -> Double.compare(e2.salary, e1.salary))
    .skip(1)   // skip the highest
    .findFirst();
```

---

## 🔍 Stream API vs Traditional Loop

| Operation | Traditional Loop | Stream API |
|-----------|-----------------|------------|
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

- ✅ `Javadoc /** */` comments explaining Stream API logic
- ✅ `Predicate` used for filtering operations
- ✅ All 10 stream operations demonstrated
- ✅ `PascalCase` for class names
- ✅ Lambda expressions used (`e -> e.salary > 60000`)
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
