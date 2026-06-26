public class Nested_If {
    public static void main(String args[]){

        
    // Example Using if, else if, Nested if
     boolean kfc = true;
     boolean chicken = true;
     boolean pepsi = true;

        if (kfc) {
            System.out.println("Enter Into KFC");
            
            if (chicken) {
                System.out.println("Eating Chicken");

                if(pepsi){
                    System.out.println("Drinking Pepsi");
                }
            }
        }
    }

}
