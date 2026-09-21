import java.util.Scanner;

class Array{

    public static void main(String[]args){

// Array of Strings
        String[] months = {"January", "February", "March", "April", "May"};
        System.out.println(months[2]);
        System.out.println("Number of months: " + months.length);
        System.out.println("------------------------------------------------------");


// Array of Integers
        int[] marks = new int[5];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your 5 Subjects' Marks: ");
        for(int i=0; i<5; i++){
            marks[i] = scan.nextInt();
            System.out.println("Your Mark is: " + marks[i]);
        }
        System.out.println("Total number of Marks: " + marks.length);
        System.out.println("------------------------------------------------------");



// 10 Numbers in an Array Using For Loop
        int[] number =  {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for(int i=0; i<10; i++){
            System.out.println("Number is: " + number[i]);
        }
        System.out.println("------------------------------------------------------");


// 2 Table in Array Using For Loop
        for(int i=1; i<=10; i++){
            System.out.println(i + "x2 = " + (i*2));
        }
        System.out.println("------------------------------------------------------");



// Multiplication Table of User Input
            Scanner num = new Scanner(System.in);
            System.out.println("Enter Your Multiplication Table of :");
            int table = num.nextInt();
            for(int i=1; i<=10; i++){
                System.out.println(table + "x" + i + " = " + table*i);
            }
            System.out.println("------------------------------------------------------");


// Get input size of an Array and print the elements
            Scanner store = new Scanner(System.in);
            System.out.println("Enter the size of an Array: ");
            int size = store.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the elements of an Array: ");
            for(int i=0; i<size; i++){
                arr[i] = store.nextInt();
            }
            System.out.println("Elements of an Array are: ");
            for(int i=0; i<size; i++){
                System.out.println(arr[i]);
            }
        }
    }


