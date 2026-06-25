# ☕ Java Constructors – Practical Task

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![Tasks](https://img.shields.io/badge/Tasks-1%2F1-blue?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Intermediate-orange?style=for-the-badge)

> A practical Java program demonstrating all three types of constructors — Default, Parameterized, and Copy — using a Student class, built as part of a Full-Stack Web Development course.

---

## 📁 Project Structure

```
07. Java Constructors – Practical Task/
│
└── Student.java      # Student class with Default, Parameterized & Copy Constructors
```

---

## 📋 Task Summary

| Constructor Type | Description |
|-----------------|-------------|
| **Default Constructor** | Initializes attributes with default values automatically |
| **Parameterized Constructor** | Accepts and stores values provided by the user |
| **Copy Constructor** | Creates a new object by copying from an existing Student object |

---

## 🏗️ Class Design

```
Student
├── Attributes
│   ├── studentId    (int)
│   ├── studentName  (String)
│   └── course       (String)
│
├── Default Constructor
│   └── Sets default values ("Unknown", 0, "N/A")
│
├── Parameterized Constructor
│   └── Sets values from parameters
│
├── Copy Constructor
│   └── Copies values from another Student object
│
└── displayDetails()
    └── Prints studentId, studentName, course
```

---

## 🎯 Sample Output

```
========================================
   STUDENT MANAGEMENT SYSTEM
========================================

--- Student 1 (Default Constructor) ---
Student ID   : 0
Student Name : Unknown
Course       : N/A

--- Student 2 (Parameterized Constructor) ---
Student ID   : 101
Student Name : Sahran Hameed
Course       : Full Stack Development

--- Student 3 (Copy Constructor) ---
Student ID   : 101
Student Name : Sahran Hameed
Course       : Full Stack Development

========================================
```

---

## 💡 Key Concepts Learned

### 🏗️ Default Constructor
```java
// Called automatically when no values are provided
Student() {
    this.studentId   = 0;
    this.studentName = "Unknown";
    this.course      = "N/A";
}
```

### 🏗️ Parameterized Constructor
```java
// Called with specific values
Student(int studentId, String studentName, String course) {
    this.studentId   = studentId;
    this.studentName = studentName;
    this.course      = course;
}
```

### 🏗️ Copy Constructor
```java
// Copies all values from another Student object
Student(Student other) {
    this.studentId   = other.studentId;
    this.studentName = other.studentName;
    this.course      = other.course;
}
```

### 📋 displayDetails() Method
```java
void displayDetails() {
    System.out.println("Student ID   : " + studentId);
    System.out.println("Student Name : " + studentName);
    System.out.println("Course       : " + course);
}
```

### 🚀 Main Method Usage
```java
// Default Constructor
Student student1 = new Student();

// Parameterized Constructor
Student student2 = new Student(101, "Sahran Hameed", "Full Stack Development");

// Copy Constructor
Student student3 = new Student(student2);

// Display all
student1.displayDetails();
student2.displayDetails();
student3.displayDetails();
```

---

## 🔍 Constructor Comparison

| Feature | Default | Parameterized | Copy |
|---------|---------|---------------|------|
| Arguments needed | ❌ None | ✅ Values required | ✅ Object required |
| Custom values | ❌ Default only | ✅ Yes | ✅ From source object |
| Use case | Placeholder object | New object with data | Clone an existing object |

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
cd "Full-Stack-Development-Practice/My-Task/07. Java Constructors - Practical Task"
```

**3. Compile the Java file**
```bash
javac Student.java
```

**4. Run the program**
```bash
java Student
```

---

## 📌 Code Standards Followed

- ✅ `Javadoc /** */` comments for every class and constructor
- ✅ `PascalCase` for class name (`Student`)
- ✅ `camelCase` for variable names (`studentId`, `studentName`)
- ✅ `this` keyword used to distinguish instance vs parameter variables
- ✅ Proper OOP structure (class, constructors, methods)
- ✅ K&R brace style
- ✅ Clean and well-formatted output

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

👉 [View Full Repository](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main)

---

## 📄 License

This project is open source and available for educational purposes.
