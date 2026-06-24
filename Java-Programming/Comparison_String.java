import java.util.Scanner;

public class Comparison_String {
    public static void main(String[] args) {
        
        String a1 = "Apple";
        String a2 = "Apple";

        System.out.println(a1==a2); // Compare With Referance


        String b1 =  new String("Orange");
        String b2 =  new String("Orange");

        System.out.println(b1.equals(b2)); // Compare With Values.
        // Two Strings Compare Using (Variable one name.equals(variable two name))

    ////////////////////////////////////
        String a = "one"; //one
        String b = "one"; //Reference of one
        String c = b; //Reference of one store in c
        System.out.println(c); // final output is one

    ////////////////////////////////////
        String A = "two"; //Save in Pool Referance
        String B = new String("two"); //Save in Object Referance
        String C = B; //Store in Object Referance Address
        System.out.println(A==C); // false (Both Referance address is not same)

/////////////////////////////////////////////
        Scanner input = new Scanner(System.in);
        System.out.print("\nMeghana is Dead? ");

        String meghana = input.nextLine();

        if ((meghana.equals("yes"))) {
            System.out.println("Surya Meets Ramya");
        }
        else{
            System.out.println("Surya weds meghana");
        }
    }
}
