/*
  Task 06 - Find the Second Largest Element
*/
public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = { 5, 2, 9, 1, 7, 3, 8 }; // Create an array
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];

                // Update the largest and second largest values
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }
        System.out.println("Array: [5, 2, 9, 1, 7, 3, 8]");
        System.out.println("Largest        : " + largest);
        System.out.println("Second Largest: " + secondLargest); // Display the second largest element
    }
}