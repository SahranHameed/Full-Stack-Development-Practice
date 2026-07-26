# ☕ Java Optional Class – Practical Tasks

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![Tasks](https://img.shields.io/badge/Tasks-3%2F3-blue?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Intermediate-orange?style=for-the-badge)

> 3 practical Java Optional class tasks — Student Search, Employee Lookup, and Book Library — built as part of a Full-Stack Web Development course.

---

## 📁 Project Structure

All 3 tasks run one after another inside a single file.

```
22. Java Optional Class/
│
└── OptionalTasks.java     # Task 01 Student Search, Task 02 Employee Lookup, Task 03 Book Library
```

---

## 📋 Task Summary

| # | Task | Description | Optional Method |
|---|------|-------------|-------------------|
| 01 | Student Search | Find student by ID | `isPresent()` |
| 02 | Employee Lookup | Find employee, return default if not found | `orElse()` |
| 03 | Book Library | Find book by title, print if found | `ifPresent()` |

---

## ❓ Why Optional?

```java
// WITHOUT Optional - risky
Student s = findStudent(999);
System.out.println(s.getName()); // NullPointerException if s is null

// WITH Optional - safe
Optional<Student> s = findStudent(999);
s.ifPresent(st -> System.out.println(st.getName())); // does nothing if empty, no crash
```

---

## 🎯 Actual Program Output

```
JAVA OPTIONAL CLASS DEMO
=========================

Task 01: Student search (isPresent)
Found: Sahran Hameed
Student not found

Task 02: Employee lookup (orElse)
Name: Alice | Salary: Rs.75000.0
Name: Unknown | Salary: Rs.0.0 (default)

Task 03: Book library (ifPresent)
Book found:
Title  : Clean Code
Author : Robert Martin
Book not found in library

All 3 Optional tasks completed.
```

---

## 💡 Key Concepts Learned

### 📚 Task 01 — isPresent() — Student Search
```java
class Student {
    int id;
    String name;
}

static Optional<Student> findStudentById(int id, List<Student> students) {
    for (Student s : students) {
        if (s.id == id) {
            return Optional.of(s);      // found -> wrap in Optional
        }
    }
    return Optional.empty();            // not found -> empty Optional
}

Optional<Student> result = findStudentById(101, students);
if (result.isPresent()) {
    System.out.println("Found: " + result.get().name);
} else {
    System.out.println("Student not found");
}
```

### 👔 Task 02 — orElse() — Employee Lookup
```java
// orElse() returns a default value when nothing was found
Employee emp = findEmployee(999, employees).orElse(new Employee(0, "Unknown", 0));
System.out.println("Name: " + emp.name + " | Salary: Rs." + emp.salary);
```

### 📖 Task 03 — ifPresent() — Book Library
```java
// ifPresent() runs the given code ONLY if a value exists
Optional<Book> book = findBookByTitle("Clean Code", books);

book.ifPresent(b -> {
    System.out.println("Title  : " + b.title);
    System.out.println("Author : " + b.author);
});
// if not found, nothing happens - no crash
```

---

## 🔍 Optional Methods Used

| Method | When to Use | Behavior |
|--------|-------------|----------|
| `isPresent()` | Check if value exists | Returns `true` or `false` |
| `get()` | Get the value (only after checking isPresent) | Returns value or throws exception |
| `orElse(default)` | Get value or a default | Returns value or the default object |
| `ifPresent(action)` | Run code only if value exists | Runs lambda if present, else does nothing |
| `Optional.of(value)` | Wrap a known non-null value | Creates an Optional holding that value |
| `Optional.empty()` | No value found | Creates an empty Optional |

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
cd "Full-Stack-Development-Practice/My-Task/22. Java Optional Class"
```

**3. Compile**
```bash
javac OptionalTasks.java
```

**4. Run**
```bash
java OptionalTasks
```

---

## 📌 Code Standards Followed

- ✅ Comments explaining Optional usage
- ✅ `Optional.of()` and `Optional.empty()` used correctly
- ✅ `isPresent()`, `orElse()`, `ifPresent()` all demonstrated
- ✅ No direct `null` returned from any search method
- ✅ `PascalCase` for class names, clean and readable output

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
| 22 | [Java Optional Class](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/22.%20Java%20Optional%20Class) |

👉 [View Full Repository](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main)

---

## 📄 License

This project is open source and available for educational purposes.
