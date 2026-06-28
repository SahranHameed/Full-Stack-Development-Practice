/*
  Task 08 - Remove Duplicate Elements from an Array
*/
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 2, 3, 4, 4, 5 }; // Create an array
        int[] unique = new int[numbers.length]; // Create another array to store unique values
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            boolean found = false;
            for (int j = 0; j < count; j++) {
                if (numbers[i] == unique[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique[count] = numbers[i];
                count++;
            }
        }

        System.out.print("Original : ");
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");
        System.out.print("\nUnique   : ");
        for (int i = 0; i < count; i++)
            System.out.print(unique[i] + " ");
    }
}
