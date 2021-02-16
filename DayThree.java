package com.company;

// Step 1
import java.util.Scanner;

public class DayThree {

    public static void main(String[] args) {

        // How to take input from the user

        // Step 2: Create an instance of the Scanner class
        // className instaceName = new className()
        Scanner sc = new Scanner(System.in);

        // take two integer inputs, add them and display them
//        System.out.print("Enter the value of a: ");
//        int a = sc.nextInt();
//
//        System.out.print("Enter the value of b: ");
//        int b = sc.nextInt();
//          int c = a + b;
//
//        System.out.println("The sum is: " + (a+b));

        // take firstName and lastName and print the full name
//        System.out.print("Enter the First Name: ");
//        String firstName = sc.next();
//
//        System.out.print("Enter the Last Name: ");
//        String lastName = sc.next();
//
//        String fullName = firstName + " " + lastName;
//        System.out.println("Your full name is: " + fullName);


        // TYPE CASTING
//        int a = 100;
//        int b = 14;
//
//        // 100 / 14
//        // Type casting
//        double c = (double)a / (double)b;
//
//        // interting part
//        System.out.println(a + "  " + b);
//
//        System.out.println("The division is: " + c);
//
//        System.out.print("Arun");
//        System.out.println("Hello");
//
//        char ch = 'a';
//        int value = ch;
//        System.out.println("The value is: " + value);


        // ARRAYS

        // You want marks of 10 people at a same time
        // 1. create 10 variables and ask your user to input

        // creating one variable which is going to contain multiple values inside it
        // MULTIPLE VALUES, ALL HAVE SAME DATATYPE

        // Declare an array
        // 1. dataType[] arrayName = { values seperated by the commas }

        // Declared an array
        String[] str;                     // Empty array
        int[] values = {10, 20, 30, 40, 50};


        // access the array = arrayName[index_you_want_to_access]
        System.out.println("The value at index 0 is: " + values[0]);
        System.out.println("The value at index 1 is: " + values[1]);
        System.out.println("The value at index 2 is: " + values[2]);
        System.out.println("The value at index 3 is: " + values[3]);
        System.out.println("The value at index 4 is: " + values[4]);

        // Insert a value to an array
//        str[0] = "Arun";
//        str[1] = "Amit";
//        str[2] = "Sumit";
//
//        System.out.println(str[0]);
//        System.out.println(str[1]);
//        System.out.println(str[2]);

        // 2. Decalraing an array
        // -> create an empty array, where i can put fixed amount of data
        // dataType[] arrayName = new dataType[size]

        // declaring an array and initializing it by telling JVM to reserve
        // some memory for particular size of array
//        int[] arr = new int[10];
//
//        str = new String[5];
//
//        System.out.println(arr[0]);
//
//        System.out.println(str[0]);


        // OPERATORS -> 2 + 3 -> Arithmetic Operators [ +, -, *, / ]

        // 1. Logical Operator
        // 2. Relational Operator
        // 3. Conditional Operators

        // 1. greater than
        int a = 10;
        int b = 20;

        boolean check = a >= b;
        System.out.println(check);

        int[] arr = new int[10];
        // [0 ... 9]
        System.out.println(arr[10]);

        // &&
        // (condition1) && (condition2) { }
        // (condition1) || (condition2) { }
        // !(condition) { }


    }
}
