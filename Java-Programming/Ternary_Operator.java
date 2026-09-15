import java.util.Scanner;

public class Ternary_Operator {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

        System.out.println("Ternary Operator in Java");
 
        System.out.println("Enter number1: ");
        int number1 = scan.nextInt();
 
        System.out.println("Enter number2: ");
        int number2 = scan.nextInt();

        // Ternary Operator
        // (Condition) ? (True) : (False)
        int max = (number1 > number2) ? number1 : number2;

        System.out.println("Max Value is: " + max);
    }
}
}