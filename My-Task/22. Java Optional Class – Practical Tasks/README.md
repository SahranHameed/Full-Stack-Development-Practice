# ☕ Java Optional Class – Practical Tasks

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![Tasks](https://img.shields.io/badge/Tasks-3%2F3-blue?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Intermediate-orange?style=for-the-badge)

> A collection of 3 practical Java programs using the Optional class to safely handle null values — including Student Search, Employee Lookup, and Book Library — built as part of a Full-Stack Web Development course.

---

## 📁 Project Structure

```
22. Java Optional Class/
│
├── Task01_StudentSearch.java     # Find student by ID using Optional
├── Task02_EmployeeLookup.java    # Find employee using orElse()
└── Task03_BookLibrary.java       # Find book by title using ifPresent()
```

---

## 📋 Task Summary

| # | Program | Description | Optional Method |
|---|---------|-------------|----------------|
| 01 | Student Search | Find student by ID | `isPresent()` |
| 02 | Employee Lookup | Find employee, return default if not found | `orElse()` |
| 03 | Book Library | Find book by title, print if found | `ifPresent()` |

---

## ❓ Why Optional?

```java
// WITHOUT Optional — DANGER! ❌
Student s = findStudent(999);
System.out.println(s.getName()); // NullPointerException if s is null! 💥

// WITH Optional — SAFE! ✅
Optional<Student> s = findStudent(999);
s.ifPresent(st -> System.out.println(st.getName())); // Safe even if null!
```

---

## 🎯 Sample Outputs

### Task 01 — Student Search
```
Searching for Student ID: 101
Student found: Sahran Hameed ✅

Searching for Student ID: 999
Student not found ❌
```

### Task 02 — Employee Lookup
```
Searching for Employee ID: 201
Employee found: Alice | Salary: Rs.75,000 ✅

Searching for Employee ID: 999
Employee not found. Returning default employee.
Default Employee: Unknown | Salary: Rs.0 📋
```

### Task 03 — Book Library
```
Searching for book: "Clean Code"
Book found!
  Title  : Clean Code
  Author : Robert Martin
  ID     : B001 ✅

Searching for book: "Unknown Book"
Book not found in library. ❌
```

---

## 💡 Key Concepts Learned

### 📚 Task 01 — isPresent() — Student Search
```java
class Student {
    int    id;
    String name;

    Student(int id, String name) {
        this.id   = id;
        this.name = name;
    }
}

// Method returns Optional<Student>
static Optional<Student> findStudentById(int id, List<Student> students) {
    for (Student s : students) {
        if (s.id == id) {
            return Optional.of(s);      // Found → wrap in Optional
        }
    }
    return Optional.empty();            // Not found → empty Optional
}

// Use in main:
Optional<Student> result = findStudentById(101, studentList);

if (result.isPresent()) {
    System.out.println("Student found: " + result.get().name);
} else {
    System.out.println("Student not found");
}
```

### 👔 Task 02 — orElse() — Employee Lookup
```java
// orElse() = return a DEFAULT value when not found
Optional<Employee> result = findEmployee(999, employeeList);

// If not found, use default employee object
Employee emp = result.orElse(new Employee(0, "Unknown", 0));
System.out.println("Name: " + emp.name + " | Salary: " + emp.salary);
```

### 📖 Task 03 — ifPresent() — Book Library
```java
// ifPresent() = run code ONLY if value exists
Optional<Book> result = findBookByTitle("Clean Code", bookList);

result.ifPresent(book -> {
    System.out.println("Title  : " + book.title);
    System.out.println("Author : " + book.author);
});
// If not found → nothing happens, no crash! ✅
```

---

## 🔍 Optional Methods Comparison

| Method | When to Use | Behavior |
|--------|-------------|----------|
| `isPresent()` | Check if value exists | Returns `true` or `false` |
| `get()` | Get the value (use with isPresent) | Returns value or throws exception |
| `orElse(default)` | Get value or default | Returns value or default object |
| `ifPresent(action)` | Run code if value exists | Runs lambda if value present |
| `Optional.of(value)` | Wrap a value | Creates Optional with value |
| `Optional.empty()` | No value | Creates empty Optional |

---

## 🔍 Optional vs Null Check

| | Without Optional | With Optional |
|---|---|---|
| Null check | `if (s != null)` | `s.isPresent()` |
| Default value | `s != null ? s : default` | `s.orElse(default)` |
| Run if found | `if (s != null) { use(s) }` | `s.ifPresent(use)` |
| Safety | ❌ Can forget to check | ✅ Forces null handling |

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
javac Task01_StudentSearch.java
```

**4. Run**
```bash
java Task01_StudentSearch
```

---

## 📌 Code Standards Followed

- ✅ `Javadoc /** */` comments explaining Optional usage
- ✅ `Optional.of()` and `Optional.empty()` used correctly
- ✅ `isPresent()`, `orElse()`, `ifPresent()` all demonstrated
- ✅ No direct `null` returned from methods
- ✅ `PascalCase` for class names
- ✅ Clean and readable output

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
