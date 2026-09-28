import java.util.Scanner;

public class Do_While {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter a number (0 to exit): ");
            number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } while (number != 0);
    }
    
}
