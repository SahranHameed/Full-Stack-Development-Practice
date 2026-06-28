/*
  Task 04 - Reverse an Array
*/
public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Create an array

        int start = 0, end = numbers.length - 1; // Swap the first and last elements
        
        // Continue swapping until the middle
        while (start < end) {
            int temp       = numbers[start];
            numbers[start] = numbers[end];
            numbers[end]   = temp;
            start++;
            end--;
        }

        System.out.print("Reversed Array: "); // Reverse the array
        for (int i = 0; i < numbers.length; i++) System.out.print(numbers[i] + " "); // Display the reversed array
    }
}




