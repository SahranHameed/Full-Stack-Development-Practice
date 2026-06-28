# ☕ Java OOP – Vehicle Management System

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![Tasks](https://img.shields.io/badge/Tasks-1%2F1-blue?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Intermediate-orange?style=for-the-badge)

> A practical Java program demonstrating Abstraction and Interface using a Vehicle Management System — with abstract class Vehicle, interface FuelEfficiency, and concrete classes Car and Bike — built as part of a Full-Stack Web Development course.

---

## 📁 Project Structure

```
10. Java OOP – Vehicle Management System/
│
├── Vehicle.java            # Abstract class with abstract methods start() and stop()
├── FuelEfficiency.java     # Interface with calculateMileage() method
├── Car.java                # Extends Vehicle, Implements FuelEfficiency
├── Bike.java               # Extends Vehicle, Implements FuelEfficiency
└── Main.java               # Main class to run the program
```

---

## 📋 Task Summary

| Component | Type | Methods |
|-----------|------|---------|
| `Vehicle` | Abstract Class | `start()`, `stop()` |
| `FuelEfficiency` | Interface | `calculateMileage()` |
| `Car` | Concrete Class | Implements all 3 methods |
| `Bike` | Concrete Class | Implements all 3 methods |

---

## 🏗️ Class Design

```
Vehicle  (Abstract Class)
├── abstract start()
└── abstract stop()
        │
        ├── Car  (extends Vehicle, implements FuelEfficiency)
        │   ├── start()           → "Car engine started 🚗"
        │   ├── stop()            → "Car engine stopped 🛑"
        │   └── calculateMileage()→ "Car Mileage: 18 km/l"
        │
        └── Bike  (extends Vehicle, implements FuelEfficiency)
            ├── start()           → "Bike engine started 🏍️"
            ├── stop()            → "Bike engine stopped 🛑"
            └── calculateMileage()→ "Bike Mileage: 45 km/l"

FuelEfficiency  (Interface)
└── calculateMileage()
```

---

## 🎯 Sample Output

```
========================================
    VEHICLE MANAGEMENT SYSTEM
========================================

--- Car Operations ---
Car engine started 🚗
Car Mileage: 18 km/l ⛽
Car engine stopped 🛑

--- Bike Operations ---
Bike engine started 🏍️
Bike Mileage: 45 km/l ⛽
Bike engine stopped 🛑

========================================
```

---

## 💡 Key Concepts Learned

### 🔷 Abstract Class — Vehicle
```java
// Abstract class: cannot be instantiated directly
public abstract class Vehicle {

    // Abstract methods: must be implemented by child classes
    public abstract void start();
    public abstract void stop();
}
```

### 🔌 Interface — FuelEfficiency
```java
// Interface: defines a contract that implementing classes must follow
public interface FuelEfficiency {
    void calculateMileage();  // abstract by default
}
```

### 🚗 Concrete Class — Car
```java
// Car extends abstract class AND implements interface
public class Car extends Vehicle implements FuelEfficiency {

    @Override
    public void start() {
        System.out.println("Car engine started 🚗");
    }

    @Override
    public void stop() {
        System.out.println("Car engine stopped 🛑");
    }

    @Override
    public void calculateMileage() {
        System.out.println("Car Mileage: 18 km/l ⛽");
    }
}
```

### 🏍️ Concrete Class — Bike
```java
public class Bike extends Vehicle implements FuelEfficiency {

    @Override
    public void start() {
        System.out.println("Bike engine started 🏍️");
    }

    @Override
    public void stop() {
        System.out.println("Bike engine stopped 🛑");
    }

    @Override
    public void calculateMileage() {
        System.out.println("Bike Mileage: 45 km/l ⛽");
    }
}
```

---

## 🔍 Abstract Class vs Interface

| Feature | Abstract Class | Interface |
|---------|---------------|-----------|
| Keyword | `abstract class` | `interface` |
| Methods | Can have abstract + concrete | All abstract (by default) |
| Inheritance | `extends` (one only) | `implements` (multiple allowed) |
| Purpose | Base blueprint | Define a contract/capability |
| Usage here | `Vehicle` | `FuelEfficiency` |

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
cd "Full-Stack-Development-Practice/My-Task/10. Java OOP - Vehicle Management System"
```

**3. Compile all Java files**
```bash
javac Vehicle.java FuelEfficiency.java Car.java Bike.java Main.java
```

**4. Run the main class**
```bash
java Main
```

---

## 📌 Code Standards Followed

- ✅ `Javadoc /** */` comments for every class and method
- ✅ `PascalCase` for class and interface names
- ✅ `@Override` annotation used for all overridden methods
- ✅ Abstract class used for shared blueprint
- ✅ Interface used for additional capability
- ✅ Each class implements all required methods
- ✅ K&R brace style
- ✅ Clean and structured output

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

👉 [View Full Repository](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main)

---

## 📄 License

This project is open source and available for educational purposes.
