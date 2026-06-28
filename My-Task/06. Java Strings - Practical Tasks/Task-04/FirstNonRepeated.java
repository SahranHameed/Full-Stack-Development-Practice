/*
  Task 04 - Find the First Non-Repeated Character
*/
public class FirstNonRepeated {
    public static void main(String[] args) {
        String str = "aabbcddeff";

        // Count frequency using array (26 letters)
        int[] freq = new int[26];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }

        // Find first character with frequency 1
        char result = '-';
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i) - 'a'] == 1) {
                result = str.charAt(i);
                break;
            }
        }

        System.out.println("String: \"" + str + "\"");
        if (result != '-') {
            System.out.println("First Non-Repeated Character: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
        // Output: c
    }
}
