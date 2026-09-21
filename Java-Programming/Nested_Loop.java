public class Nested_Loop {
    public static void main(String[] args) {

// Star Pattern Using Nested Loop

        for (int i=1; i<=3; i++){
            for (int j=1; j<=3; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------");

        

// Star Pattern Using Nested Loop
        for (int i=1; i<=3; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }        
        System.out.println("------------------------------------------------------");
    }
}

