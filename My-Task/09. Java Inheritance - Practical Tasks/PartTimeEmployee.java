// Child Class: PartTimeEmployee

class PartTimeEmployee extends Employee {

    int    hoursWorked;
    double hourlyRate;

    PartTimeEmployee(int id, String name, int hoursWorked, double hourlyRate) {
        super(id, name);  // calls Employee constructor
        this.hoursWorked = hoursWorked;
        this.hourlyRate  = hourlyRate;
    }

    void calculateSalary() {
        double totalSalary = hoursWorked * hourlyRate;
        System.out.println("Employee Type : Part-Time");
        System.out.println("Hours Worked  : " + hoursWorked);
        System.out.println("Hourly Rate   : Rs." + hourlyRate);
        System.out.println("Total Salary  : Rs." + totalSalary);
    }
}
