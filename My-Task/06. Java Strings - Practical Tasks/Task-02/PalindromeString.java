/*
  Task 02 - Check Whether a String is a Palindrome
  Compare characters from both ends toward center
*/
public class PalindromeString {
    public static void main(String[] args) {
        String str = "madam"; // Change to test
        boolean isPalindrome = true;

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("\"" + str + "\" is a Palindrome");
        } else {
            System.out.println("\"" + str + "\" is NOT a Palindrome");
        }
    }
}
