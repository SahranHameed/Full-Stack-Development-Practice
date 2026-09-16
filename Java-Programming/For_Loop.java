import java.util.Scanner;

public class For_Loop {
    public static void main(String[] args) {
    

// Print each name using a for loop
        System.out.println("Printing name 5 times:");
        for (int i=1; i<=5; i++){
            
            System.out.println("SAHRAN");
        }        
        
System.out.println("--------------------------------------------------------");



// Print numbers from 1 to 10 using a for loop
        System.out.println("Printing numbers from 1 to 10:");
        for (int i=1; i<=10; i++){
            System.out.println(i);
        }

System.out.println("--------------------------------------------------------");



// Q-1: Print numbers from 10 to 1 using a for loop
      System.out.println("Printing numbers from 10 to 1:");
      for (int i=10; i>0; i--){
            System.out.println(i);
        }

System.out.println("--------------------------------------------------------");



// Q-2: Print numbers from a to b using a for loop
System.out.println("Printing numbers from a to b:");
int a ;
int b ;
Scanner scan = new Scanner(System.in);

System.out.print("Enter the value of a: ");
a = scan.nextInt();

System.out.print("Enter the value of b: ");
b = scan.nextInt();

for (int i=a; i<=b; i++) {
    System.out.println(i);
}

System.out.println("--------------------------------------------------------");



// Q-3: Print even and odd numbers from 1 to 10 using a for loop

int oddCount = 0; // Initialize a variable to count the number of odd numbers
System.out.println("Printing Even and Odd numbers from 1 to 10:");
for (int i=1; i<=10; i++) {
    if(i%2==0) {
        System.out.println("Even number: " + i);
    }
    else {
        System.out.println("Odd number: " + i);
        oddCount = oddCount + 1; // Increment the oddCount variable by 1 for each odd number found
    }
}
    System.out.println("Total odd numbers from 1 to 10: " + oddCount);

System.out.println("--------------------------------------------------------");



// Q-4: Print numbers from 1 to 100 that are divisible by both 3 and 5 using a for loop 
System.out.println("Printing numbers from 1 to 100 that are divisible by both 3 and 5:");
for (int i=1; i<=100; i++) {
    if(i%3==0 && i%5==0) {
        System.out.println("Number divisible by both 3 and 5: " + i);
    }
    else {
        System.out.println("Odd number: " + i);
    }
}
scan.close();

}
}
