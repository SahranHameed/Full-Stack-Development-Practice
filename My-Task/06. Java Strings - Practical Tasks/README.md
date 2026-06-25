# ☕ Java Strings – Practical Tasks

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![Tasks](https://img.shields.io/badge/Tasks-10%2F10-blue?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Beginner-yellow?style=for-the-badge)

> A collection of 10 practical Java programs covering string manipulation — including reversing strings, palindrome check, anagram check, character frequency, and word reversal — built as part of a Full-Stack Web Development course.

---

## 📁 Project Structure

```
06. Java Strings – Practical Tasks/
│
├── Task01_ReverseString.java          # Reverse a string without built-in methods
├── Task02_PalindromeString.java       # Check if a string is palindrome
├── Task03_CharacterCount.java         # Count vowels, consonants, digits, special chars
├── Task04_FirstNonRepeated.java       # Find first non-repeated character
├── Task05_DuplicateChars.java         # Find duplicate characters and their counts
├── Task06_AnagramCheck.java           # Check if two strings are anagrams
├── Task07_RemoveDuplicateChars.java   # Remove duplicate characters (preserve order)
├── Task08_CharFrequency.java          # Count frequency of each character
├── Task09_ReverseWords.java           # Reverse order of words in a sentence
└── Task10_LongestWord.java            # Find the longest word in a sentence
```

---

## 📋 Task Summary

| # | Program | Description | Concept Used |
|---|---------|-------------|--------------|
| 01 | Reverse String | Flip string without `reverse()` | Loop from end to start |
| 02 | Palindrome Check | Same forward and backward | Compare chars |
| 03 | Character Count | Count vowels, consonants, digits, specials | Conditions + counters |
| 04 | First Non-Repeated | First unique character | Frequency array logic |
| 05 | Duplicate Chars | Chars appearing more than once | Nested loop / count array |
| 06 | Anagram Check | Two strings with same characters | Sort or count compare |
| 07 | Remove Duplicates | Unique chars, preserve order | Seen-check logic |
| 08 | Char Frequency | How often each char appears | Frequency counting |
| 09 | Reverse Words | Flip word order, not letters | Split + reverse word array |
| 10 | Longest Word | Find max length word | Split + length compare |

---

## 🎯 Sample Outputs

### Task 01 — Reverse String
```
Original String : hello
Reversed String : olleh
```

### Task 02 — Palindrome Check
```
String: madam
"madam" is a Palindrome ✅
```
```
String: hello
"hello" is NOT a Palindrome ❌
```

### Task 03 — Character Count
```
String: "Hello World 123!"
Vowels          : 3
Consonants      : 7
Digits          : 3
Special Chars   : 2
```

### Task 04 — First Non-Repeated Character
```
String: "aabbcddeff"
First Non-Repeated Character: c
```

### Task 05 — Duplicate Characters
```
String: "programming"
Duplicate Characters:
  r → 2 times
  g → 2 times
  m → 2 times
```

### Task 06 — Anagram Check
```
String 1: listen
String 2: silent
"listen" and "silent" are Anagrams ✅
```

### Task 07 — Remove Duplicate Characters
```
Original : "programming"
Unique   : "progamin"
```

### Task 08 — Character Frequency
```
String: "hello"
h → 1
e → 1
l → 2
o → 1
```

### Task 09 — Reverse Word Order
```
Original  : "Hello World Java"
Reversed  : "Java World Hello"
```

### Task 10 — Longest Word
```
Sentence    : "Java is a powerful programming language"
Longest Word: "programming" (11 characters)
```

---

## 💡 Key Concepts Learned

### 🔁 Reverse String Without Built-in (Task 01)
```java
String str = "hello";
String reversed = "";

for (int i = str.length() - 1; i >= 0; i--) {
    reversed += str.charAt(i);
}
```

### 🔤 Check Vowel / Consonant (Task 03)
```java
char ch = Character.toLowerCase(c);
if ("aeiou".indexOf(ch) != -1) {
    vowelCount++;
} else if (Character.isLetter(ch)) {
    consonantCount++;
} else if (Character.isDigit(ch)) {
    digitCount++;
} else {
    specialCount++;
}
```

### 🔍 Anagram Check Logic (Task 06)
```java
// Two strings are anagrams if they have the same characters
// Approach: count each character's frequency and compare
int[] count = new int[26];
for (char c : str1.toCharArray()) count[c - 'a']++;
for (char c : str2.toCharArray()) count[c - 'a']--;
// If all counts are 0 → Anagram ✅
```

### 🔃 Reverse Word Order (Task 09)
```java
String[] words = sentence.split(" ");
String result = "";
for (int i = words.length - 1; i >= 0; i--) {
    result += words[i];
    if (i != 0) result += " ";
}
// "Hello World Java" → "Java World Hello"
```

---

## 🔍 Logic Summary

| Task | Key Logic |
|------|-----------|
| 01 | Loop from last index to 0, build new string |
| 02 | Compare char at `i` and `length-1-i` |
| 03 | Check each char: isLetter, isDigit, else special |
| 04 | Count frequency, return first char with count = 1 |
| 05 | Count frequency, print chars with count > 1 |
| 06 | Count char frequency in both strings, compare |
| 07 | Check if char already added, skip if yes |
| 08 | Use int array of size 26 to count each letter |
| 09 | Split by space, loop words in reverse, join |
| 10 | Split by space, compare each word's length |

---

## 🚀 How to Run

### Prerequisites
- Java JDK 8 or above installed
- Any IDE (VS Code, IntelliJ IDEA, Eclipse) or terminal

### Steps

**1. Clone the repository**
```bash
git clone https://github.com/SahranHameed/Full-Stack-Development-Practice.git
```

**2. Navigate to the folder**
```bash
cd "Full-Stack-Development-Practice/My-Task/06. Java Strings - Practical Tasks"
```

**3. Compile a Java file**
```bash
javac Task01_ReverseString.java
```

**4. Run the program**
```bash
java Task01_ReverseString
```

---

## 📌 Code Standards Followed

- ✅ `Javadoc /** */` comments for every class
- ✅ `PascalCase` for class names
- ✅ `camelCase` for variable names
- ✅ No built-in `reverse()` used for logic tasks
- ✅ Handles both uppercase and lowercase properly
- ✅ Meaningful variable names (`vowelCount`, `frequency`, `longestWord`)
- ✅ K&R brace style
- ✅ Clean and readable output formatting

---

## 👨‍💻 Author

**Sahran Hameed**
🔗 [GitHub Profile](https://github.com/SahranHameed)

---

## 📚 Part Of

This repository is part of the **Full-Stack Web Development Practicals** series.

| Module | Topic |
|--------|-------|
| 01 | [Java Operators & Control Flow Statements](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/01.%20Java%20Operators%20and%20Control%20Flow%20Statements%20Practical%20Tasks) |
| 02 | [Java While Loop](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/02.%20Java%20While%20Loop%20-%20Practical%20Tasks) |
| 03 | [Java For Loop & Nested For Loop](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/03.%20Java%20For%20Loop%20%26%20Nested%20For%20Loop%20-%20Practical%20Tasks) |
| 04 | [Java Arrays](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/04.%20Java%20Arrays%20-%20Practical%20Tasks) |
| 05 | [Java Arrays & Number Logic](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/05.%20Java%20Arrays%20%26%20Number%20Logic%20-%20Practical%20Tasks) |
| 06 | [Java Strings](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main/My-Task/06.%20Java%20Strings%20-%20Practical%20Tasks) |

👉 [View Full Repository](https://github.com/SahranHameed/Full-Stack-Development-Practice/tree/main)

---

## 📄 License

This project is open source and available for educational purposes.
