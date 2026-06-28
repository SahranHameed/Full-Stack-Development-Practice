/*
  Task 09 - Java Inheritance
  Parent Class: Employee
  Child Classes: FullTimeEmployee, PartTimeEmployee
  Inheritance = Child class gets all fields and methods from Parent
  Keyword: extends
*/

// Main Class
public class MainEmployee {
    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("      EMPLOYEE MANAGEMENT SYSTEM");
        System.out.println("========================================\n");

        // Full-Time Employee
        FullTimeEmployee emp1 = new FullTimeEmployee(101, "Sahran Hameed", 75000);
        System.out.println("--- Full-Time Employee ---");
        emp1.displayInfo();       // from parent class
        emp1.calculateSalary();   // from child class

        System.out.println();

        // Part-Time Employee
        PartTimeEmployee emp2 = new PartTimeEmployee(102, "Ahmed Ali", 80, 500);
        System.out.println("--- Part-Time Employee ---");
        emp2.displayInfo();       // from parent class
        emp2.calculateSalary();   // from child class

        System.out.println("\n========================================");
    }
}
