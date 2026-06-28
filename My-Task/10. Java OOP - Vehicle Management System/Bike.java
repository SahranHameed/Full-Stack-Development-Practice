// Class: Bike
public class Bike extends Vehicle implements FuelEfficiency {

    @Override
    public void start() {
        System.out.println("Bike engine started.");
    }

    @Override
    public void stop() {
        System.out.println("Bike engine stopped.");
    }

    public void calculateMileage() {
        System.out.println("Bike Mileage: 45 km per litre");
    }
}