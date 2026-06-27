/*
  Task 04 - Calculate the Average of Array Elements
*/

public class AverageOfElements {
    public static void main(String[] args) {

        // Create an array
        int[] numbers = {8, 4, 10, 7, 3, 8, 11};
        
        // Initialize the sum variable
        int sum = 0; 

        // Add all array elements
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Calculate the average
        double average = (double) sum / numbers.length;

        // Display the Result
        System.out.println("Array: [8, 4, 10, 7, 3, 8, 11]"); 
        System.out.println("Sum    : " + sum); 
        System.out.println("Average: " + average); 
    }
}
