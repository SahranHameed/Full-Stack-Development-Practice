import java.util.Scanner;

public class Coding_Challenge {

    public static void main(String args[])
    {  
/* 
        Scanner store = new Scanner(System.in);
        System.out.println("Enter Your Mark: ");
        int mark = store.nextInt();

        if (mark >= 35) {
            System.out.println("You are Pass");            
        }
        else{
            System.out.println("You are Fail");
        }
*/

/////////////////////////////////////////////////////////

// Example Using if, else if
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Exam Mark: ");
        int number = scan.nextInt();

        if (number>=35 && number<60) {
            System.out.println("Video Game");
        }
        else if (number>=60 && number<90) 
            {
            System.out.println("Iphone");
        }
        else if (number>=90) {
            System.out.println("MacBook Pro");
        }
    }
} 