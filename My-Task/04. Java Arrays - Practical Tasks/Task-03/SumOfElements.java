/*
  Task 03 - Calculate the Sum of All Elements
*/

import java.util.Arrays;

public class SumOfElements {
    public static void main(String[] args) {

        // Create an array
        int[] numbers = { 5, 13, 10, 2, 4, 5, 7 };
        int sum = 0; // Initialize the sum variable

        // Add each array element to the sum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // add each element to sum
        }

        // Display the total sum
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Sum of Elements: " + sum);
    }
}
