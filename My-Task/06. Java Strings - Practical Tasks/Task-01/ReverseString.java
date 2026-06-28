/*
  Task 01 - Reverse a String Without Built-in reverse()
  Loop from last character to first
*/
public class ReverseString {
    public static void main(String[] args) {
        String str      = "hello";
        String reversed = "";

        // Loop from end to start
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Original : " + str);
        System.out.println("Reversed : " + reversed);
    }
}
