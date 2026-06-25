import java.util.Scanner;

public class Coding_Challenge {

    public static void main(String args[])
    {
        Scanner store = new Scanner(System.in);
        System.out.println("Enter Your Mark: ");
        int mark = store.nextInt();

        if (mark >= 35) {
            System.out.println("You are Pass");            
        }
        else{
            System.out.println("You are Fail");
        }
    }
}