// Remainder.java

public class Remainder {
    int getsoap (int money)
    {
        int soap_price = 28;
        int balance = 35-soap_price;
        return balance; 
    }

// Main method
    public static void main(String[] args) {
        Remainder obj = new Remainder();
        int balance = obj.getsoap(35);
        System.out.println("Balance after buying soap: " + balance);
    }
}
