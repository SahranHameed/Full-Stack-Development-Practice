public class Demo {

// Method to display a simple message    
    void displayMessage() 
    {
        System.out.println("Hello, this is a simple Java program.");
    }
    
// Method to display user information
    void displayInfo(String name, int age) 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    public static void main(String[] args) {

        Demo demo = new Demo();
        
        // Call the method to display a message
        demo.displayMessage();
        
        // Call the method to display user information
        demo.displayInfo("Alice", 30);
    }
}