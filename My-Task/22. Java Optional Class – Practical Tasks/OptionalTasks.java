import java.util.*;

// Task 22 - Java Optional Class
// Task 01: Student search  -> isPresent()
// Task 02: Employee lookup -> orElse()
// Task 03: Book library    -> ifPresent()

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

class Book {
    int id;
    String title;
    String author;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
}

public class OptionalTasks {

    static Optional<Student> findStudentById(int id, List<Student> list) {
        for (Student s : list) {
            if (s.id == id) {
                return Optional.of(s);
            }
        }
        return Optional.empty();
    }

    static Optional<Employee> findEmployee(int id, List<Employee> list) {
        for (Employee e : list) {
            if (e.id == id) {
                return Optional.of(e);
            }
        }
        return Optional.empty();
    }

    static Optional<Book> findBookByTitle(String title, List<Book> list) {
        for (Book b : list) {
            if (b.title.equalsIgnoreCase(title)) {
                return Optional.of(b);
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {

        System.out.println("JAVA OPTIONAL CLASS DEMO");
        System.out.println("=========================");

        // Task 01 - Student search
        System.out.println("\nTask 01: Student search (isPresent)");
        List<Student> students = Arrays.asList(
            new Student(101, "Sahran Hameed"),
            new Student(102, "Ahmed Ali"),
            new Student(103, "Priya Kumar")
        );

        Optional<Student> s1 = findStudentById(101, students);
        if (s1.isPresent()) {
            System.out.println("Found: " + s1.get().name);
        } else {
            System.out.println("Student not found");
        }

        Optional<Student> s2 = findStudentById(999, students);
        if (s2.isPresent()) {
            System.out.println("Found: " + s2.get().name);
        } else {
            System.out.println("Student not found");
        }

        // Task 02 - Employee lookup
        System.out.println("\nTask 02: Employee lookup (orElse)");
        List<Employee> employees = Arrays.asList(
            new Employee(201, "Alice", 75000),
            new Employee(202, "Bob", 40000)
        );

        Employee emp1 = findEmployee(201, employees).orElse(new Employee(0, "Unknown", 0));
        System.out.println("Name: " + emp1.name + " | Salary: Rs." + emp1.salary);

        Employee emp2 = findEmployee(999, employees).orElse(new Employee(0, "Unknown", 0));
        System.out.println("Name: " + emp2.name + " | Salary: Rs." + emp2.salary + " (default)");

        // Task 03 - Book library
        System.out.println("\nTask 03: Book library (ifPresent)");
        List<Book> books = Arrays.asList(
            new Book(1, "Clean Code", "Robert Martin"),
            new Book(2, "Java Programming", "James Gosling"),
            new Book(3, "Design Patterns", "Gang of Four")
        );

        Optional<Book> book1 = findBookByTitle("Clean Code", books);
        book1.ifPresent(b -> {
            System.out.println("Book found:");
            System.out.println("Title  : " + b.title);
            System.out.println("Author : " + b.author);
        });

        Optional<Book> book2 = findBookByTitle("Unknown Book", books);
        if (!book2.isPresent()) {
            System.out.println("Book not found in library");
        }

        System.out.println("\nAll 3 Optional tasks completed.");
    }
}
