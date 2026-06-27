/*
  Task 02 - Find the Smallest Element in an Array
*/

public class SmallestElement {

    public static void main(String[] args) {

        int[] numbers = { 6, 3, 15, 4, 8, 6, 10 };

        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        // Print the smallest element
        System.out.println("Array: [6, 3, 15, 4, 8, 6, 10]");
        System.out.println("Smallest Element: " + smallest);
    }
}
