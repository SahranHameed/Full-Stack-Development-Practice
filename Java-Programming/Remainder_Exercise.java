// This program is used to find the sum of two numbers.

public class Remainder_Exercise {
    int sum (int num1, int num2)
    {
        int total = num1 + num2;
        return total;
    }

// Main method
    public static void main(String[] args) {
        Remainder_Exercise add = new Remainder_Exercise();
        int Total = add.sum(35 , 25);
        System.out.println("Total: " + Total);
    }
}
