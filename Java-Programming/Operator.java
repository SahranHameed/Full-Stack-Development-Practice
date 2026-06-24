public class Operator {

    public static void main(String[] args) {
    int a = 10;
    int b = 20;
    System.out.print(a%b);
}
}

// Unary Operator
public class Operator {

    public static void main(String[] args) {
    
    // Post => a++ (Print Then Update)
    int a = 10;
    System.out.println("Before Increment Variable a :" + a++); // Value = 10
    System.out.println("After Increment Variable a :" + a); // Value = 11

    // Pre => ++a (Update Then Print)
    int b = 10;
    System.out.println("Before Decrement Variable a :" + b); // Value = 10
    System.out.println("After Decrement Variable a :" + --b); // Value = 9
 
}
}

// Assignment Operator
public class Operator {

    public static void main(String[] args) {
    
    int a = 10;
    a += 5; // Addition
    System.out.println("Variable: a + 5 = " + a); 

     int b = 10;
    b -= 5; // Substraction
    System.out.println("Variable: b - 5 = " + b); 

     int c = 10;
    c *= 5; // Multiplication
    System.out.println("Variable: c * 5 = " + c);
    
     int d = 10;
    d /= 5; // Division
    System.out.println("Variable: d / 5 = " + d); 
}
}
