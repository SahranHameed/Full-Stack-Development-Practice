/*
 Task 08 - Count the Frequency of Each Character
*/
public class CharFrequency {
    public static void main(String[] args) {
        String str = "hello";

        int[] freq = new int[26];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }

        System.out.println("String: \"" + str + "\"");
        System.out.println("Character Frequencies:");
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println("  " + (char) (i + 'a') + " → " + freq[i]);
            }
        }
    }
}
