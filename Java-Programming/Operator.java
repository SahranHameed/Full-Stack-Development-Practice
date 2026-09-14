public class Operator {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Modulus: " + (a % b));

        // Unary Operator
        // Post => a++ (Print Then Update)
        a = 10;
        System.out.println("Before Increment Variable a :" + a++); // Value = 10
        System.out.println("After Increment Variable a :" + a); // Value = 11

        // Pre => --b (Update Then Print)
        int c = 10;
        System.out.println("Before Decrement Variable c :" + c); // Value = 10
        System.out.println("After Decrement Variable c :" + --c); // Value = 9

        // Assignment Operator
        int d = 10;
        d += 5; // Addition
        System.out.println("Variable: d + 5 = " + d);

        int e = 10;
        e -= 5; // Substraction
        System.out.println("Variable: e - 5 = " + e);

        int f = 10;
        f *= 5; // Multiplication
        System.out.println("Variable: f * 5 = " + f);

        int g = 10;
        g /= 5; // Division
        System.out.println("Variable: g / 5 = " + g);
    }
}
