/*
  Task 03 - Calculate the Sum of All Elements
*/

public class SumOfElements {
    public static void main(String[] args) {

        int[] numbers = {5, 13, 10, 2, 4, 5, 7};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];  // add each element to sum
        }

        System.out.println("Array: [5, 13, 10, 2, 4, 5, 7]");
        System.out.println("Sum of Elements: " + sum);
    }
}
