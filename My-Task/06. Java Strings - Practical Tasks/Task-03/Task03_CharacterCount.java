/**
 * Task 03 - Count Vowels, Consonants, Digits, Special Characters
 * Vowels : a e i o u
 * Consonants : other letters
 * Digits : 0-9
 * Special Chars : anything else (space, !, @, # etc.)
 */

public class Task03_CharacterCount {
    public static void main(String[] args) {
        String str = "Hello World 123!";

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int special = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else {
                special++;
            }
        }

        System.out.println("String: \"" + str + "\"");
        System.out.println("Vowels          : " + vowels);
        System.out.println("Consonants      : " + consonants);
        System.out.println("Digits          : " + digits);
        System.out.println("Special Chars   : " + special);
    }
}
