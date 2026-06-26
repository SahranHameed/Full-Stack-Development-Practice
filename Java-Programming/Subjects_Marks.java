import java.util.Scanner;

public class Subjects_Marks {
    public static void main(String[] args) {
        
        try(Scanner marks = new Scanner(System.in)){

        System.out.println("Enter Your Subject Mark: ");
        int maths = marks.nextInt();
        int ict = marks.nextInt();
        int tamil = marks.nextInt();
        int science = marks.nextInt();
        int english = marks.nextInt();

        System.out.println("maths:" + maths + " ict:" + ict + " tamil:" + tamil + " science:" + science + " english:" + english);
        
        int totalMark = maths+ict+tamil+science+english;

        int aveRage = totalMark/5;

        if (aveRage<35) {
            System.out.println("Additional Class is Required");            
        }
        else{
            System.out.println("You are Good to Go!");
        }
        
        
    }
}
}
