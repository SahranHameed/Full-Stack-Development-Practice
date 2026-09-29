public class Hotel_Class {

    int CoffeePrice = 5;
    int TeaPrice = 10;
    int SandwichPrice = 15;
    int BurgerPrice = 20;

    public static void main(String[] args) {

        Hotel_Class Server1 = new Hotel_Class();
        
        System.out.println("Coffee Price: $" + Server1.CoffeePrice);
        System.out.println("Tea Price: $" + Server1.TeaPrice);
        System.out.println("Sandwich Price: $" + Server1.SandwichPrice);
        System.out.println("Burger Price: $" + Server1.BurgerPrice);    

    }
}