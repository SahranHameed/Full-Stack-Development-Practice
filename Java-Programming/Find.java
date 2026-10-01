import java.util.Scanner;

// This program is used to find whether the given number is even or odd.
public class Find {

    void EvenOdd(int num)
    {
        if(num%2==0)
        {
            System.out.println(num + " is Even Number");
        }
        else
        {
            System.out.println(num + " is Odd Number");
        }
    }

// Main method 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        Find obj = new Find();
        obj.EvenOdd(num);

    }
    
}
