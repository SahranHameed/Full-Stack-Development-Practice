/*
  Task 11 - Java OOP: Library Management System
 
  Demonstrates ALL 5 OOP Concepts:
    1. Encapsulation  → Book class (private fields + getters/setters)
    2. Inheritance    → Person → Student, Librarian
    3. Abstraction    → LibraryItem (abstract class)
    4. Polymorphism   → LibraryItem item = new Book(); item.displayInfo();
    5. Interface      → Borrowable (borrowItem, returnItem)
*/

// Main Class
public class Main {
    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("     LIBRARY MANAGEMENT SYSTEM");
        System.out.println("========================================\n");

        // 1. ENCAPSULATION — Book with private fields and getters/setters
        System.out.println("--- 1. Encapsulation Demo (Book) ---");
        Book book = new Book(101, "Java Programming", "James Gosling", 599.00);
        book.displayInfo();

        System.out.println();

        // 2. INHERITANCE — Person → Student, Librarian
        System.out.println("--- 2. Inheritance Demo ---");
        Student student = new Student(201, "Sahran Hameed");
        Librarian librarian = new Librarian(301, "Mr. Kumar");
        System.out.print("Student   → ");
        student.displayInfo();
        System.out.print("Librarian → ");
        librarian.displayInfo();

        System.out.println();

        // 3 & 4. ABSTRACTION + POLYMORPHISM
        // LibraryItem (parent reference) → new Book() (child object)
        // Calls Book's displayInfo() at runtime → Runtime Polymorphism
        System.out.println("--- 3. Abstraction + Polymorphism Demo ---");
        LibraryItem item = new Book(102, "Clean Code", "Robert Martin", 799.00);
        item.displayInfo(); // Book's displayInfo() is called — Polymorphism!

        System.out.println();

        // 5. INTERFACE — Borrowable
        System.out.println("--- 4. Interface Demo (Borrowable) ---");
        student.borrowItem();
        student.returnItem();
        book.borrowItem();
        book.returnItem();

        System.out.println("\n========================================");
    }
}
