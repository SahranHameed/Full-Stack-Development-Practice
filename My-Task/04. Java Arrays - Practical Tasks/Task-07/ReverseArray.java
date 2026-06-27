/*
  Task 07 - Reverse an Array Without Built-in Methods
  Two-pointer technique: swap from both ends toward center
*/

public class ReverseArray {
    public static void main(String[] args) {

        // Create an array
        int[] numbers = { 1, 2, 3, 4, 5 };

        // Display the original array
        System.out.print("Original Array : ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Swap elements from both ends
        int start = 0;
        int end = numbers.length - 1;

        // Continue until the middle of the array
        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
        // Display the reversed array
        System.out.print("\nReversed Array : ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
