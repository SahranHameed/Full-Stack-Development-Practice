/*
  Task 09 - Reverse the Order of Words in a Sentence
  Input : "Hello World Java"
  Output: "Java World Hello"
*/
public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "Hello World Java";

        // Split into words by space
        String[] words = sentence.split(" ");
        String result = "";

        // Loop words from last to first
        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i];
            if (i != 0)
                result += " ";
        }

        System.out.println("Original : " + sentence);
        System.out.println("Reversed : " + result);
    }
}
