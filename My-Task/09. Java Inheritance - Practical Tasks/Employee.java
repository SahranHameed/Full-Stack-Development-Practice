// Parent Class
class Employee {

    String name;
    int    id;

    // Constructor
    Employee(int id, String name) {
        this.id   = id;
        this.name = name;
    }

    // Shared method — available to all child classes
    void displayInfo() {
        System.out.println("Employee ID   : " + id);
        System.out.println("Employee Name : " + name);
    }
}