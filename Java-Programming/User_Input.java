import java.util.Scanner;

// Get User Input Intiger Type 

class user
{
    public static void main(String args[])
    {
        Scanner store = new Scanner(System.in);
        int a = store.nextInt();

        Scanner store2 = new Scanner(System.in);
        int b = store2.nextInt();
        
        System.out.println(a + b);

    }
}


// Get User Input String Type 
class user2
{
    public static void main(String args[])
    {
        Scanner store = new Scanner(System.in);
        String a = store.nextLine();

        Scanner store2 = new Scanner(System.in);
        String b = store2.nextLine();
        
        System.out.println(a + b);

    }
}

