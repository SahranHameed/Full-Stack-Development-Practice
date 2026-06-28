// Class: Car
// extends Vehicle → gets abstract methods (must implement)
// implements FuelEfficiency → must implement calculateMileage()

public class Car extends Vehicle implements FuelEfficiency {

    @Override
    public void start() {
        System.out.println("Car engine started.");
    }

    @Override
    public void stop() {
        System.out.println("Car engine stopped.");
    }

    @Override
    public void calculateMileage() {
        System.out.println("Car Mileage: 18 km per litre");
    }
}