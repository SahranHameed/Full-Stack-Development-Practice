/*
  Task 06 - Check Whether Two Strings Are Anagrams
*/
public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        // Convert to lowercase for fair comparison
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        boolean isAnagram = true;

        // Length must be same
        if (str1.length() != str2.length()) {
            isAnagram = false;
        } else {
            int[] count = new int[26];

            // Increment for str1, decrement for str2
            for (int i = 0; i < str1.length(); i++) {
                count[str1.charAt(i) - 'a']++;
                count[str2.charAt(i) - 'a']--;
            }

            // If any count is not 0 → not anagram
            for (int i = 0; i < 26; i++) {
                if (count[i] != 0) {
                    isAnagram = false;
                    break;
                }
            }
        }

        if (isAnagram) {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are Anagrams");
        } else {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are NOT Anagrams");
        }
    }
}
