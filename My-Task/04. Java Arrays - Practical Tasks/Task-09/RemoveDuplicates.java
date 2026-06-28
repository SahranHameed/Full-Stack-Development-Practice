/**
 * Task 09 - Remove Duplicate Elements from an Array
 * Check each element against already-added unique elements
 */
public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 2, 3, 4, 4, 5};
        int[] unique  = new int[numbers.length];
        int   count   = 0;

        for (int i = 0; i < numbers.length; i++) {
            boolean isDuplicate = false;

            // Check if this element is already in unique array
            for (int j = 0; j < count; j++) {
                if (numbers[i] == unique[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                unique[count] = numbers[i];
                count++;
            }
        }

        System.out.print("Original : ");
        for (int i = 0; i < numbers.length; i++) System.out.print(numbers[i] + " ");

        System.out.print("\nUnique   : ");
        for (int i = 0; i < count; i++) System.out.print(unique[i] + " ");
    }
}
