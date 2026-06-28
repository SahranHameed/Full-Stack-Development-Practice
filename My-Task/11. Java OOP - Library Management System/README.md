# ☕ Java OOP – Library Management System

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![Tasks](https://img.shields.io/badge/Tasks-1%2F1-blue?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Advanced-red?style=for-the-badge)

> A comprehensive Java project demonstrating all five OOP concepts — Encapsulation, Inheritance, Abstraction, Polymorphism, and Interface — through a Library Management System, built as part of a Full-Stack Web Development course.

---

## 📁 Project Structure

```
11. Java OOP – Library Management System/
│
├── Book.java            # Encapsulation + extends LibraryItem + implements Borrowable
├── LibraryItem.java     # Abstract class with abstract displayInfo()
├── Borrowable.java      # Interface with borrowItem() and returnItem()
├── Person.java          # Base class with name and id
├── Student.java         # Extends Person, implements Borrowable
├── Librarian.java       # Extends Person
└── Main.java            # Demonstrates all OOP concepts
```

---

## 📋 OOP Concepts Demonstrated

| # | OOP Concept | Class / Component | How It's Used |
|---|-------------|------------------|---------------|
| 1 | **Encapsulation** | `Book` | Private fields with getters/setters |
| 2 | **Inheritance** | `Person → Student, Librarian` | Child classes extend parent |
| 3 | **Abstraction** | `LibraryItem` (abstract) | Abstract `displayInfo()` method |
| 4 | **Polymorphism** | `LibraryItem item = new Book()` | Runtime method overriding |
| 5 | **Interface** | `Borrowable` | `borrowItem()` and `returnItem()` |

---

## 🏗️ Full Class Design

```
LibraryItem  (Abstract Class)
└── abstract displayInfo()
        │
        └── Book  (extends LibraryItem, implements Borrowable)
            ├── private: bookId, title, author, price
            ├── getters & setters (Encapsulation)
            ├── displayInfo()     (Override — Abstraction + Polymorphism)
            ├── borrowItem()      (Interface)
            └── returnItem()      (Interface)

Person  (Base Class)
├── name  (String)
├── id    (int)
└── displayInfo()
        │
        ├── Student  (extends Person, implements Borrowable)
        │   ├── borrowItem()
        │   └── returnItem()
        │
        └── Librarian  (extends Person)

Borrowable  (Interface)
├── borrowItem()
└── returnItem()
```

---

## 🎯 Sample Output

```
========================================
    LIBRARY MANAGEMENT SYSTEM
========================================

--- 1. Encapsulation Demo (Book) ---
Book ID   : B001
Title     : Java Programming
Author    : James Gosling
Price     : ₹599.00

--- 2. Inheritance Demo ---
Person    : Sahran Hameed (ID: S101) — Student
Person    : Mr. Kumar     (ID: L001) — Librarian

--- 3. Abstraction + Polymorphism Demo ---
[Using LibraryItem reference → new Book()]
Book ID   : B001
Title     : Java Programming
Author    : James Gosling
Price     : ₹599.00

--- 4. Interface Demo (Borrowable) ---
📚 Student Sahran Hameed has borrowed "Java Programming"
📚 Student Sahran Hameed has returned "Java Programming"

========================================
```

---

## 💡 Key Concepts with Code

### 1️⃣ Encapsulation — Book Class
```java
public class Book extends LibraryItem implements Borrowable {
    // Private fields — cannot be accessed directly
    private int    bookId;
    private String title;
    private String author;
    private double price;

    // Public Getters & Setters
    public int    getBookId()  { return bookId; }
    public String getTitle()   { return title;  }
    public void   setTitle(String title) { this.title = title; }
    // ... other getters and setters
}
```

### 2️⃣ Inheritance — Person → Student, Librarian
```java
public class Person {
    String name;
    int id;
    Person(int id, String name) {
        this.id   = id;
        this.name = name;
    }
}

public class Student extends Person implements Borrowable {
    Student(int id, String name) {
        super(id, name);  // inherits from Person
    }
}

public class Librarian extends Person {
    Librarian(int id, String name) {
        super(id, name);
    }
}
```

### 3️⃣ Abstraction — LibraryItem
```java
public abstract class LibraryItem {
    // Abstract method: subclass MUST implement this
    public abstract void displayInfo();
}
```

### 4️⃣ Polymorphism — Runtime Method Overriding
```java
// Parent reference → Child object (Runtime Polymorphism)
LibraryItem item = new Book();
item.displayInfo();  // Calls Book's displayInfo(), not LibraryItem's
```

### 5️⃣ Interface — Borrowable
```java
public interface Borrowable {
    void borrowItem();
    void returnItem();
}

// Student implements Borrowable
public class Student extends Person implements Borrowable {
    @Override
    public void borrowItem() {
        System.out.println("📚 " + name + " has borrowed a book.");
    }

    @Override
    public void returnItem() {
        System.out.println("📚 " + name + " has returned the book.");
    }
}
```

---

## 🔍 OOP Concepts — Quick Reference

| Concept | Keyword | Purpose |
|---------|---------|---------|
| Encapsulation | `private` + getters/setters | Protect data |
| Inheritance | `extends` | Reuse parent code |
| Abstraction | `abstract` | Define blueprint |
| Polymorphism | `@Override` | One interface, many behaviors |
| Interface | `implements` | Define a contract/capability |

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
cd "Full-Stack-Development-Practice/My-Task/11. Java OOP - Library Management System"
```

**3. Compile all Java files**
```bash
javac Borrowable.java LibraryItem.java Book.java Person.java Student.java Librarian.java Main.java
```

**4. Run the main class**
```bash
java Main
```

---

## 📌 Code Standards Followed

- ✅ `Javadoc /** */` comments explaining each OOP concept per class
- ✅ `PascalCase` for all class and interface names
- ✅ `camelCase` for all variable and method names
- ✅ `@Override` annotation used for all overridden methods
- ✅ All 5 OOP concepts clearly implemented and demonstrated
- ✅ Single responsibility per class
- ✅ K&R brace style
- ✅ Clean, readable, and well-formatted output

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
| 10 | [Java OOP - Vehicle Management System](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/10.%20Java%20OOP%20-%20Vehicle%20Management%20System) |
| 11 | [Java OOP - Library Management System](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/11.%20Java%20OOP%20-%20Library%20Management%20System) |

👉 [View Full Repository](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main)

---

## 📄 License

This project is open source and available for educational purposes.
