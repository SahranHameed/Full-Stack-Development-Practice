public class Variable
{
    static int a = 10;
    int b = 10;

    public static void main(String[] args)
    {
        System.out.println("Static variable: " + a);

        Variable object = new Variable();
        System.out.println("Instance variable: " + object.b);

        int localVariable = 10;
        System.out.println("Local variable: " + localVariable);
    }
}
    
