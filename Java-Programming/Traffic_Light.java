import java.util.Scanner;

public class Traffic_Light {
 
    public static void main(String args[]){

        
        try(Scanner light = new Scanner(System.in)){

        //System.out.println("What is the Traffic light Color? "); 
        
        String colorRed = new String("red");
        String colorYellow = new String("yellow");
        String colorGreen = new String("green");
        
       // boolean color = true;

        if (colorRed.equals("red")) {
            System.out.println("Stop");            
        }
        else if (colorYellow.equals("yellow")) {
            System.out.println("Get Ready"); 
        }
        else if (colorGreen.equals("green")) {
            System.out.println("You are Good to Go!");
        }
    }
    }
}
