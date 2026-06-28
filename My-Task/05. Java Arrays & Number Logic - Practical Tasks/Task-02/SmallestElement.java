/*
  Task 02 - Find the smallest element in an array
*/
public class SmallestElement {
    public static void main(String[] args) {
        int[] numbers = { 7, 9, 3, 4, 10, 8 }; // Create an array

        // Assume the first element is the smallest value
        int smallest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest)
                smallest = numbers[i]; // Compare each element with the smallest value

        }
        System.out.println("Smallest: " + smallest); // Display the largest element
    }
}
