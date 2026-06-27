/*
  Task 01 - Find the Largest Element in an Array
  Concept: Loop through array, track the maximum value
*/

public class LargestElement {

    public static void main(String[] args) {

        int[] numbers = { 6, 3, 15, 4, 8, 6, 10 };

        // Assume first element is the largest
        int largest = numbers[0];

        // Compare with each element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        // Print the largest element
        System.out.println("Array: [6, 3, 15, 4, 8, 6, 10]");
        System.out.println("Largest Element is: " + largest);
    }

}
