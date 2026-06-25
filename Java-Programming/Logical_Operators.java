// Logical AND Operator
// True && True = True
// False && False = False
// True && False = False
// False && True = False

public class Logical_Operators {
    public static void main(String[] args) {

        // Hungry + IceCream =Eat
        boolean hungry = false;
        boolean icecream = true;

        if (hungry && icecream) {
            System.out.println("Eat");
        } else {
            System.out.println("Don't Eat");
        }

        ////////////////////////////////////////

        // Logical OR Operator
        // True || True = True (Play)
        // True || False = True (Play)
        // False || True = True (Play)
        // False || False = False (Don't Play)

        // Cricket or Football = Play
        boolean cricket = true;
        boolean football = true;

        if (cricket || football) {
            System.out.println("Play");
        } else {
            System.out.println("Don't Play");
        }
    }
}
