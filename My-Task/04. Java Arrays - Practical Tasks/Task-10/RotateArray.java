/*
  Task 10 - Rotate Array to the Right by One Position
  Save last element, shift all right, place last at index 0
*/
public class RotateArray {
    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5 };

        System.out.print("Original Array : ");
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");

        // Save last element
        int lastElement = numbers[numbers.length - 1];

        // Shift all elements to the right
        for (int i = numbers.length - 1; i > 0; i--) {
            numbers[i] = numbers[i - 1];
        }

        // Place last element at index 0
        numbers[0] = lastElement;

        System.out.print("\nAfter Rotation : ");
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");
        // Output: 5 1 2 3 4
    }
}
