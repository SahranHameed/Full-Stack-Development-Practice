import java.util.Scanner;
import java.util.Random;

public class While_Loop {
    
    public static void main(String[] args) {
        int i = 1;
        while (i <=5)
        {
            System.out.println("SAHRAN");
            i++;
        }
        System.out.println("------------------------------------------------------");


// Random Number Generator Using While Loop
        Random random = new Random();
        int randomNumber = 0;

        while (randomNumber != 5)
        {
            randomNumber = random.nextInt(10); // Generate a random number between 0 and 9
            System.out.println(randomNumber);
        }
    }
}
