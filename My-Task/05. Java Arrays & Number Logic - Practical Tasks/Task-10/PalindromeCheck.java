/*
  Task 10 - Check Whether a Number is Palindrome
  Palindrome = reads same forward and backward
  Example: 121, 1221, 12321
 * Logic:
    - Reverse the digits
    - Compare reversed number with original
*/

public class PalindromeCheck {
    public static void main(String[] args) {

        int number   = 121;  // Change to test
        int original = number;
        int reversed = 0;

        // Reverse the digits
        while (number > 0) {
            int digit = number % 10;          // get last digit
            reversed  = reversed * 10 + digit; // build reversed number
            number    = number / 10;           // remove last digit
        }

        if (original == reversed) {
            System.out.println(original + " is a Palindrome Number");
        } else {
            System.out.println(original + " is NOT a Palindrome Number");
        }
    }
}

