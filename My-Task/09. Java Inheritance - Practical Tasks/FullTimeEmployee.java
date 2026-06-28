// Child Class: FullTimeEmployee

class FullTimeEmployee extends Employee {

    double monthlySalary;

    FullTimeEmployee(int id, String name, double monthlySalary) {
        super(id, name);  // calls Employee constructor
        this.monthlySalary = monthlySalary;
    }

    void calculateSalary() {
        System.out.println("Employee Type : Full-Time");
        System.out.println("Monthly Salary: Rs." + monthlySalary);
    }
}