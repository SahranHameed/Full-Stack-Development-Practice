public class Parameter_Exercise {

// Method to calculate the sum of two integers
    void sum(int x, int y){
        int result = x + y;
        System.out.println("Sum: x + y = " + result);
    }
    
// Method to calculate the product of two integers
    void multiply(int x, int y){
        int result = x * y;
        System.out.println("Multiply: x * y = " + result);
    }

// Method to calculate the division of two integers
    void divide(int x, int y){
        int result = x / y;
        System.out.println("Division: x / y = " + result);
    }

// Method to calculate the subtraction of two integers
    void subtract(int x, int y){
        int result = x - y;
        System.out.println("Subtraction: x - y = " + result);
    }

    
    public static void main(String[] args){

        Parameter_Exercise obj = new Parameter_Exercise();
        obj.sum(10,20);
        obj.multiply(10, 20);
        obj.divide(20, 10);
        obj.subtract(20, 10);

    }
}
