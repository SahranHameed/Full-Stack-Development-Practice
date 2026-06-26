import java.util.Scanner;

public class Score_Game {
    public static void main(String args[])
    {

// Q3 - What is the Score in a Game?
        try (Scanner store = new Scanner(System.in)) {
            System.out.println("Enter Your Game Score: ");
            int score = store.nextInt();

            if (score < 50) {
                System.out.println("You need to Improve");            
            }
            else if (score>=50 && score<=70) {
                System.out.println("Good Job"); 
            }
            else{
                System.out.println("Excellent Performance");
            }
        }
    }
}
