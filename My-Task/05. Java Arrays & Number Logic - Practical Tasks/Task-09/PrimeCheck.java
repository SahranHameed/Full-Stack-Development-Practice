/*
  Task 09 - Check Whether a Number is Prime
  Prime Number = divisible only by 1 and itself
  Example: 2, 3, 5, 7, 11, 13...

 * Logic:
    - Loop from 2 to number/2
    - If any number divides it evenly → NOT prime
 */

public class PrimeCheck {
    public static void main(String[] args) {

        int number = 7; // Change this to test different numbers
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is NOT a Prime Number");
        }
    }
}