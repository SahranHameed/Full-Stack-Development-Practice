/*
  Task 07 - Java Constructors
  Student class demonstrating:
    1. Default Constructor    → sets default values
    2. Parameterized Constructor → sets given values
    3. Copy Constructor       → copies from another Student object
*/
public class Student {

    // Attributes
    int studentId;
    String studentName;
    String course;

    // ─────────────────────────────────────────
    // 1. Default Constructor
    // Called when: Student s = new Student();
    // ─────────────────────────────────────────
    public Student() {
        this.studentId = 0;
        this.studentName = "Unknown";
        this.course = "Not Assigned";
    }

    // ─────────────────────────────────────────
    // 2. Parameterized Constructor
    // Called when: Student s = new Student(1, "Sahran", "Java");
    // ─────────────────────────────────────────
    public Student(int studentId, String studentName, String course) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
    }

    // ─────────────────────────────────────────
    // 3. Copy Constructor
    // Called when: Student s = new Student(existingStudent);
    // ─────────────────────────────────────────
    public Student(Student other) {
        if (other == null) {
            this.studentId = 0;
            this.studentName = "Unknown";
            this.course = "Not Assigned";
        } else {
            this.studentId = other.studentId;
            this.studentName = other.studentName;
            this.course = other.course;
        }
    }

    // Display student information
    void displayDetails() {
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Course       : " + course);
    }

    // ─────────────────────────────────────────
    // Main Method
    // ─────────────────────────────────────────
    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("      STUDENT MANAGEMENT SYSTEM");
        System.out.println("========================================\n");

        // 1. Default Constructor
        Student student1 = new Student();
        System.out.println("--- Student 1 (Default Constructor) ---");
        student1.displayDetails();

        System.out.println();

        // 2. Parameterized Constructor
        Student student2 = new Student(1, "Sahran Hameed", "MERN Stack Development");
        System.out.println("--- Student 2 (Parameterized Constructor) ---");
        student2.displayDetails();

        System.out.println();

        // 3. Copy Constructor — copy from student2
        Student student3 = new Student(student2);
        System.out.println("--- Student 3 (Copy Constructor) ---");
        student3.displayDetails();

        System.out.println("\n========================================");
    }
}
