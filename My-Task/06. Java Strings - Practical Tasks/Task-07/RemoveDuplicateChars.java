/*
  Task 07 - Remove Duplicate Characters While Preserving Order
*/
public class RemoveDuplicateChars {
    public static void main(String[] args) {
        String str = "programming";
        String result = "";
        boolean[] seen = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx = ch - 'a';

            if (!seen[idx]) {
                result += ch; // add only if not seen before
                seen[idx] = true;
            }
        }

        System.out.println("Original : " + str);
        System.out.println("Unique   : " + result);
        // Output: progamin
    }
}
