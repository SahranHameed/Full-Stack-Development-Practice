import java.util.Scanner;

public class Control_Flow_State {
    public static void main(String[] args) {
        System.out.println("Enter Your Exam Marks: ");
        try (Scanner scan = new Scanner(System.in)) {
            int number = scan.nextInt();

            if (number <= 35) {
                System.out.println("You are Fail");
            } 
            else if (number <= 50) {
                System.out.println("You are Pass");
            }
            else if (number <= 85){
                System.out.println("You are Excellent");
            }
            else if (number <= 100){
                System.out.println("You are Outstanding");
            }
            else {
                System.out.println("Invalid Marks");
            }
        }
    }
    
}
