/*
  Task 05 - Count Even and Odd Elements
  % 2 == 0  →  Even number
  % 2 != 0  →  Odd number
 */

public class EvenOddCount {
    public static void main(String[] args) {

        // Create an array
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int evenCount = 0;
        int oddCount = 0;

        // Initialize even and odd counters
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++; // Count even numbers
            } else {
                oddCount++; // Count odd numbers
            }
        }

        // Display the result
        System.out.println("Array: [1, 2, 3, 4, 5, 6, 7, 8]");
        System.out.println("Even Count: " + evenCount);
        System.out.println("Odd  Count: " + oddCount);
    }
}
