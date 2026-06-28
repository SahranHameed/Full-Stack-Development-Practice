/*
  Task 08 - Find the Second Largest Element
  Track both largest and secondLargest in one loop
*/
public class SecondLargest {
    public static void main(String[] args) {

        int[] numbers = { 5, 2, 9, 1, 7, 3, 8 };
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest; // old largest becomes second
                largest = numbers[i]; // update largest
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        System.out.println("Array: [5, 2, 9, 1, 7, 3, 8]");
        System.out.println("Largest        : " + largest);
        System.out.println("Second Largest : " + secondLargest); // Display the second largest element
    }
}
