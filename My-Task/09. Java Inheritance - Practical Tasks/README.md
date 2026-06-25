# ☕ Java Inheritance – Practical Task

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![Tasks](https://img.shields.io/badge/Tasks-1%2F1-blue?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Intermediate-orange?style=for-the-badge)

> A practical Java program demonstrating Inheritance using Employee as a parent class and FullTimeEmployee and PartTimeEmployee as child classes with their own salary calculation logic — built as part of a Full-Stack Web Development course.

---

## 📁 Project Structure

```
09. Java Inheritance – Practical Task/
│
├── Employee.java              # Parent class with name, id, displayInfo()
├── FullTimeEmployee.java      # Child class with monthlySalary, calculateSalary()
└── PartTimeEmployee.java      # Child class with hoursWorked, hourlyRate, calculateSalary()
```

---

## 📋 Task Summary

| Class | Type | Fields | Method |
|-------|------|--------|--------|
| `Employee` | Parent Class | `name`, `id` | `displayInfo()` |
| `FullTimeEmployee` | Child Class | `monthlySalary` | `calculateSalary()` |
| `PartTimeEmployee` | Child Class | `hoursWorked`, `hourlyRate` | `calculateSalary()` |

---

## 🏗️ Class Hierarchy

```
Employee  (Parent)
├── name        (String)
├── id          (int)
└── displayInfo()  → prints name and ID
      │
      ├── FullTimeEmployee  (Child)
      │   ├── monthlySalary  (double)
      │   └── calculateSalary()  → displays monthly salary
      │
      └── PartTimeEmployee  (Child)
          ├── hoursWorked  (int)
          ├── hourlyRate   (double)
          └── calculateSalary()  → hoursWorked × hourlyRate
```

---

## 🎯 Sample Output

```
========================================
      EMPLOYEE MANAGEMENT SYSTEM
========================================

--- Full-Time Employee Details ---
Employee ID   : 101
Employee Name : Sahran Hameed
Employee Type : Full-Time
Monthly Salary: ₹75,000.00

--- Part-Time Employee Details ---
Employee ID   : 102
Employee Name : Ahmed Ali
Employee Type : Part-Time
Hours Worked  : 80
Hourly Rate   : ₹500.00
Total Salary  : ₹40,000.00

========================================
```

---

## 💡 Key Concepts Learned

### 👨‍👩‍👦 Parent Class — Employee
```java
public class Employee {
    String name;
    int id;

    // Constructor
    Employee(int id, String name) {
        this.id   = id;
        this.name = name;
    }

    // Shared method — inherited by all child classes
    void displayInfo() {
        System.out.println("Employee ID   : " + id);
        System.out.println("Employee Name : " + name);
    }
}
```

### 👦 Child Class — FullTimeEmployee
```java
// extends = inherits from Employee
public class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(int id, String name, double monthlySalary) {
        super(id, name);  // calls parent constructor
        this.monthlySalary = monthlySalary;
    }

    void calculateSalary() {
        System.out.println("Monthly Salary: ₹" + monthlySalary);
    }
}
```

### 👦 Child Class — PartTimeEmployee
```java
public class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(int id, String name, int hoursWorked, double hourlyRate) {
        super(id, name);  // calls parent constructor
        this.hoursWorked = hoursWorked;
        this.hourlyRate  = hourlyRate;
    }

    void calculateSalary() {
        double totalSalary = hoursWorked * hourlyRate;
        System.out.println("Total Salary  : ₹" + totalSalary);
    }
}
```

### 🔑 super() Keyword
```java
// super() calls the parent class constructor
// Must be the first line inside child constructor
super(id, name);
```

---

## 🔍 Inheritance Benefits

| Benefit | Explanation |
|---------|-------------|
| **Code Reusability** | `name`, `id`, `displayInfo()` written once in Employee, used everywhere |
| **Extensibility** | Add new employee types without modifying parent class |
| **Hierarchy** | Clearly organized structure — parent → child |
| **Override** | Each child has its own `calculateSalary()` logic |

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
cd "Full-Stack-Development-Practice/My-Task/09. Java Inheritance - Practical Task"
```

**3. Compile all Java files**
```bash
javac Employee.java FullTimeEmployee.java PartTimeEmployee.java
```

**4. Run the main class**
```bash
java FullTimeEmployee
```

---

## 📌 Code Standards Followed

- ✅ `Javadoc /** */` comments for every class and method
- ✅ `PascalCase` for class names
- ✅ `camelCase` for variable names
- ✅ `super()` keyword used correctly
- ✅ `extends` used for proper inheritance
- ✅ Each class has a single clear responsibility
- ✅ K&R brace style
- ✅ Clean and formatted output

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
| 09 | [Java Inheritance](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/09.%20Java%20Inheritance%20-%20Practical%20Task) |

👉 [View Full Repository](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main)

---

## 📄 License

This project is open source and available for educational purposes.
