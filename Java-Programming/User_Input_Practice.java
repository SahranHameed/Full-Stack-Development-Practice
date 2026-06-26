// Get User Input Intiger Type 
import java.util.Scanner;

class User_Input_Practice 
{
    public static void main(String args[])
    {
        try (Scanner store = new Scanner(System.in))
        {
            String Name = store.nextLine();
            double Score = store.nextDouble();
            store.nextLine();
            String department = store.nextLine();
           
            System.out.println("My Name is "+ Name);
            System.out.println("My Score is "+ Score/10 +"/10");       
            System.out.println("My Department is "+ department);        
        }
    }
}

////////////////////////////////////////////////

class Practice 
{
    public static void main(String args[])
    {
        try (Scanner store = new Scanner(System.in))
        {
            int a = store.nextInt();
            int b = store.nextInt();
            int c = store.nextInt();

            int d = a * b * c; // Multiple all Variables & Store d
            int e = a + b + c ; // Add all Variables and store it in e

            System.out.println("Now Divide d by e Answar is ="+ d / e); // Now Divide d by e
        }
    }
}

/////////////////////////////
class test
{
    public static void main(String args[])
    {
        try (Scanner store = new Scanner(System.in)) {
            String Name = store.nextLine();
            int Age = store.nextInt();
            store.nextLine();
            String Address = store.nextLine();

            System.out.println("My Name is "+Name);
            System.out.println("My Age is "+Age);
            System.out.println("My Address is "+Address);

        }
    }
}
