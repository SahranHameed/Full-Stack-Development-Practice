/*
  Task 06 - Search for a Specific Element in an Array
  Linear Search: check each element one by one
*/

public class SearchElement {
    public static void main(String[] args) {

        // Create an array
        int[] numbers = { 10, 20, 30, 40, 50 };
        int target = 30;
        boolean found = false;

        // Define the element to search
        for (int i = 0; i < numbers.length; i++) {
            // Check each array element
            if (numbers[i] == target) {
                System.out.println("Element " + target + " found at index " + i); // Display the index if found
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element " + target + " not found in the array."); // Display a message if not found
        }
    }
}
