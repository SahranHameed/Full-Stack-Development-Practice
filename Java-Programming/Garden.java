public class Garden {
    int apple_price = 20;
    int apple_count = 5;

    void total_apple_price() {
        System.out.println("Total Apple Price: " + (apple_price * apple_count));
    }

    public static void main(String[] args) {
        Garden garden = new Garden();
        garden.total_apple_price();
    }
}