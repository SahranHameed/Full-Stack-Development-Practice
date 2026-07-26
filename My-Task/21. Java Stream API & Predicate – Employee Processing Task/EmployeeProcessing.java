import java.util.*;
import java.util.stream.*;
import java.util.function.Predicate;

// Task 21 - Java Stream API & Predicate, Employee Processing
// Note: class is called Staff here (not Employee) so it doesn't clash
// with the Employee class used in the Optional task in this same project.

class Staff {
    int id;
    String name;
    int age;
    double salary;
    String department;

    Staff(int id, String name, int age, double salary, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public String toString() {
        return name + " | " + department + " | Age:" + age + " | Rs." + salary;
    }
}

public class EmployeeProcessing {

    public static void main(String[] args) {

        List<Staff> employees = Arrays.asList(
            new Staff(1, "Alice", 32, 75000, "IT"),
            new Staff(2, "Bob", 25, 40000, "Finance"),
            new Staff(3, "Charlie", 35, 80000, "HR"),
            new Staff(4, "Diana", 28, 55000, "Finance"),
            new Staff(5, "Eve", 38, 90000, "IT"),
            new Staff(6, "Frank", 29, 48000, "IT"),
            new Staff(7, "Grace", 42, 95000, "HR")
        );

        System.out.println("EMPLOYEE PROCESSING - STREAM API");
        System.out.println("==================================");

        // Task 01: salary > 60000 using Predicate
        System.out.println("\nTask 01: Salary > Rs.60000");
        Predicate<Staff> highSalary = e -> e.salary > 60000;
        employees.stream().filter(highSalary).forEach(System.out::println);

        // Task 02: IT department and age > 30
        System.out.println("\nTask 02: IT dept and age above 30");
        employees.stream()
                .filter(e -> e.department.equals("IT") && e.age > 30)
                .forEach(System.out::println);

        // Task 03: count age > 30
        System.out.println("\nTask 03: Count employees with age > 30");
        long count = employees.stream().filter(e -> e.age > 30).count();
        System.out.println("Count: " + count);

        // Task 04: highest paid employee
        System.out.println("\nTask 04: Highest paid employee");
        employees.stream()
                .max(Comparator.comparingDouble(e -> e.salary))
                .ifPresent(System.out::println);

        // Task 05: names in uppercase
        System.out.println("\nTask 05: Names in uppercase");
        employees.stream().map(e -> e.name.toUpperCase()).forEach(System.out::println);

        // Task 06: average salary
        System.out.println("\nTask 06: Average salary");
        OptionalDouble avg = employees.stream().mapToDouble(e -> e.salary).average();
        avg.ifPresent(a -> System.out.println("Average: Rs." + a));

        // Task 07: group by department
        System.out.println("\nTask 07: Group by department");
        Map<String, List<Staff>> grouped = employees.stream()
                .collect(Collectors.groupingBy(e -> e.department));
        grouped.forEach((dept, list) -> {
            System.out.print(dept + " -> ");
            list.forEach(e -> System.out.print(e.name + " "));
            System.out.println();
        });

        // Task 08: sort by salary descending
        System.out.println("\nTask 08: Sorted by salary (high to low)");
        employees.stream()
                .sorted((e1, e2) -> Double.compare(e2.salary, e1.salary))
                .forEach(System.out::println);

        // Task 09: first employee with salary > 80000
        System.out.println("\nTask 09: First employee with salary > Rs.80000");
        employees.stream()
                .filter(e -> e.salary > 80000)
                .findFirst()
                .ifPresent(System.out::println);

        // Task 10: second highest salary
        System.out.println("\nTask 10: Second highest salary");
        employees.stream()
                .sorted((e1, e2) -> Double.compare(e2.salary, e1.salary))
                .skip(1)
                .findFirst()
                .ifPresent(e -> System.out.println("Second highest: Rs." + e.salary + " (" + e.name + ")"));

        System.out.println("\nAll 10 stream tasks completed.");
    }
}
