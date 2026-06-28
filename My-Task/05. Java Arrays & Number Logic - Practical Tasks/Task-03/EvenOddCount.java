/*
  Task 03 - Count Even and Odd Numbers
*/
public class EvenOddCount {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8 }; // Check each element
        int evenCount = 0;
        int oddCount = 0;

        // Initialize even and odd counters
        for (int i = 0; i < numbers.length; i++) {
            
            // Count the even and odd numbers
            if (numbers[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        // Display the total count
        System.out.println("Even Count: " + evenCount);
        System.out.println("Odd  Count: " + oddCount);
    }
}
