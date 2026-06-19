import java.util.Scanner;

// Get User Input Intiger Type 

class user
{
    public static void main(String args[])
    {
        try (Scanner store = new Scanner(System.in)) {
            int a = store.nextInt();
            int b = store.nextInt();
            System.out.println(a + b);
        }
    }
}


// Get User Input String Type 
class user2
{
    public static void main(String args[])
    {
        try (Scanner store = new Scanner(System.in)) {
            String a = store.nextLine();
            String b = store.nextLine();
            System.out.println(a + b);
        }
    }
}

