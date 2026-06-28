/*
  Task 10 - Java OOP: Vehicle Management System
  Concepts Used:
    - Abstract Class  : Vehicle (with abstract methods)
    - Interface       : FuelEfficiency
    - Concrete Classes: Car, Bike
 
  Abstract class  = cannot create object directly, must be extended
  Interface       = defines a contract that classes must follow
*/

// Main Class
public class Main {
    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("     VEHICLE MANAGEMENT SYSTEM");
        System.out.println("========================================\n");

        // Car object
        Car car = new Car();
        System.out.println("=== Car Operations ===");
        car.start();
        car.calculateMileage();
        car.stop();

        System.out.println();

        // Bike object
        Bike bike = new Bike();
        System.out.println("=== Bike Operations ===");
        bike.start();
        bike.calculateMileage();
        bike.stop();

        System.out.println("\n========================================");
    }
}
