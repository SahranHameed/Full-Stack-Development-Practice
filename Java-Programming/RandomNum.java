import java.util.Random;

public class RandomNum {
    // Random Number Generator Using While Loop
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = 0;

        while (randomNumber != 5) {
            randomNumber = random.nextInt(10); // Generate a random number between 0 and 9
            System.out.println(randomNumber);
        }
    }
}