/*
  Task 05 - Find All Duplicate Characters and Their Occurrence Counts
*/
public class DuplicateChars {
    public static void main(String[] args) {
        String str = "programming";

        int[] freq = new int[26];

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }

        System.out.println("String: \"" + str + "\"");
        System.out.println("Duplicate Characters:");

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 1) {
                System.out.println("  " + (char) (i + 'a') + " → " + freq[i] + " times");
            }
        }
    }
}
