package com.company;

import java.util.Scanner;

public class Functions {
    // Step1: Declare the function
    // Step2: Define the function -> Give the logic to the function
    // Step3: Use the function

    // 1. Create a function within the same class as that of main.
        // static
    // 2. Create a separate class and use the functions by creating the object.

    // public returnType functionName( parameter(s) )
    // parameter is the thing used for calculation in the function

    public static void sayHelloWorld() {
        System.out.println("HELLO WORLD...!!");
    }

    public static void greetUser(String name) {
        System.out.println("Hello, Welcome " + name);
    }

    public static int addNumbers(int a, int b) {
        // Business Logic
        int ans = a + b;
        // Return statement
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q: Create a function to say "Hello World!"
        sayHelloWorld();

        // Q: Create a function which greets a user
//        System.out.print("Enter you name: ");
//        String name = sc.nextLine();
//        greetUser(name);

         // 3 user
//        for(int i=0; i<3; i++) {
//            System.out.print("Enter you name: ");
//            String name = sc.nextLine();
//            greetUser(name);
//        }

        // Q: Take two numbers, add it and display the result
        System.out.print("Enter the value of a: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int num2 = sc.nextInt();

        int result = addNumbers(num1, num2);
        System.out.println(result);
    }
}
