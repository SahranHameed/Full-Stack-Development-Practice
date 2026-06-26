import java.util.Scanner;

// Find out Whether Number is Divisible by 3 or 5
public class If_Else {
    
    public static void main(String args[])
    {   
    try (Scanner scan = new Scanner(System.in)) {
        System.out.println("Enter the Number: ");
        int number = scan.nextInt();

        if (number%3 == 0 && number%5 == 0) {
            System.out.println("Can Divide by 3 and 5");
        }
        else{
            System.out.println("Can't Divided");
        }
    }  

        
// Find out Whether Number is Even or Odd
/*      Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = scan.nextInt();

        if (number%2 == 0 && number%1 == 0) {
            System.out.println("The Number is Even");
        }
        else{
            System.out.println("The Number is Odd");
        }
*/

    }
}
