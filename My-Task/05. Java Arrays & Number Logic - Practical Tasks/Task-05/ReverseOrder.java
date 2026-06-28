/*
  Task 05 - Print Array Elements in Reverse Order
  (No need to reverse the array — just print from last index)
*/
public class ReverseOrder {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.print("Original      : ");
        for (int i = 0; i < numbers.length; i++) System.out.print(numbers[i] + " ");

        System.out.print("\nReverse Order : ");
        // Loop from last index to 0
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        // Output: 5 4 3 2 1
    }
}
