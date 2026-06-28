/*
  Task 11 - Check Whether a Number is Armstrong
*/
public class ArmstrongCheck {
    public static void main(String[] args) {

        int number = 153; // Change to test
        int original = number;
        int sum = 0;

        // while loop - required by the task
        while (number > 0) {
            int digit = number % 10; // get last digit
            sum += digit * digit * digit; // cube and add
            number = number / 10; // remove last digit
        }

        if (original == sum) {
            System.out.println(original + " is an Armstrong Number");
            System.out.println("(" + getSumString(original) + " = " + sum + ")");
        } else {
            System.out.println(original + " is NOT an Armstrong Number");
        }
    }

    // Helper method to show the calculation
    static String getSumString(int n) {
        String result = "";
        int temp = n;
        while (temp > 0) {
            int d = temp % 10;
            result = d + "³" + (result.isEmpty() ? "" : " + " + result);
            temp /= 10;
        }
        return result;
    }
}