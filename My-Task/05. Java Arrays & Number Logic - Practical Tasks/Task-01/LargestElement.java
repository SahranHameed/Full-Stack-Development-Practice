/*
  Task 01 - Find the largest element in an array
*/
public class LargestElement {
    public static void main(String[] args) {
        int[] numbers = { 7, 9, 3, 4, 10, 8 };

        // Assume the first element is the largest value
        int largest = numbers[0]; // Create an array
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest)
                largest = numbers[i]; // Compare each element with the largest value

        }
        System.out.println("Array: [7, 9, 3, 4, 10, 8]");
        System.out.println("Largest Element: " + largest); // Display the largest element
    }
}
