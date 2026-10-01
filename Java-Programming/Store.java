public class Store {
    void getsoap(int money) {
        // Implementation for getting soap
        System.out.println("Getting soap...");
    }

    void fruits(int money) {
        // Implementation for buying fruits
        System.out.println("Buying fruits...");
    }

    void vegetables(int money) {
        // Implementation for buying vegetables
        System.out.println("Buying vegetables...");
    }


    public static void main(String[] args) {
        Store item1 = new Store();
        item1.getsoap(20);

        Store item2 = new Store();
        item2.fruits(30);

        Store item3 = new Store();
        item3.vegetables(25);
    }
}


