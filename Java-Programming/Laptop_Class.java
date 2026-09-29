public class Laptop_Class {
    String brand = "";
    String model = "";
    int ramSize = 0;
    int storageSize = 0;
    int price = 0;

    public static void main(String[] args) {

    // Create an object of the Laptop_Class
        Laptop_Class lap1 = new Laptop_Class();
        lap1.brand = "Dell";
        lap1.model = "XPS 13";
        lap1.ramSize = 16;
        lap1.storageSize = 512;
        lap1.price = 35000;


    // Create an object of the Laptop_Class
        Laptop_Class lap2 = new Laptop_Class();
        lap2.brand = "HP";
        lap2.model = "Pavilion";
        lap2.ramSize = 8;
        lap2.storageSize = 256;
        lap2.price = 25000;

    // Display laptop information
        lap1.displayLaptopInfo();
        System.out.println("----------------------------------------");
        lap2.displayLaptopInfo();
    }

    public void displayLaptopInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("RAM Size: " + ramSize + " GB");
        System.out.println("Storage Size: " + storageSize + " GB");
        System.out.println("Price: $" + price);
}
}