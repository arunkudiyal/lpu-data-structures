package com.company;

import java.util.Scanner;

public class Functions {
    // Step1: Declare the function
    // Step2: Define the function -> Give the logic to the function
    // Step3: Use the function

    // 1. Create a function within the same class as that of main.
    // Signature -> public static returnType functionName( parameter(s) )
        // static
    // 2. Create a separate class and use the functions by creating the object.

    // name = sayHelloWorld, return = void
    public static void sayHelloWorld() {
        // Logic
        System.out.println("Hello World!!");
    }

    // name = sayHello, return = String
    public static String sayHello() {
        return "Hello";
    }

    // name = giveFive, return = int
    public static int giveFive() {
        return 5;
    }

    // Create a function which take a value, and calculates it square
    public static int calculateSquare(int number) {
        return number * number;
    }

    public static int calculateCube(int num) {
        return (num * num * num);
    }

    // Create a function which takes 2 integer values, sums them and returns the sum
    public static int sumNumbers(int num1, int num2) {
        int c = (num1 + num2);
        return c;
    }

    // take 2 String values, if the length of both the strings values is 5 or more return true else return false
    public static boolean compareStrings(String s1, String s2) {
        if(s1.length() >= 5 && s2.length() >= 5) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPrime(int number) {
        // Logic - if a number is divisible by 1 or itself
        int check = 0;
        for(int i=1; i<=number; i++) {
            if(number%i == 0) {
                check += 1;
            }
        }
        if(check == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // HOW TO USE FUNCTIONS (inBuilt)

        String name = "Upgrad";
        // Find out the length of the string
        System.out.println(name.length());

        System.out.println("the Upper case is: " + name.toUpperCase());

        System.out.println(name.toUpperCase().charAt(2));

        // USE -> Calling the function | saying the name of the function
        for(int i=1; i<=3; i++) {
            sayHelloWorld();
        }

        String result = sayHello();
        System.out.println(result);

        int out = giveFive();
        System.out.println(out);

        // Way - 1
        int sq = calculateSquare(10); // 100
        System.out.println("Square of 10 is: " + sq);

        // way - 2
        System.out.println("The square of 15 is: " + calculateSquare(15));

        System.out.println("The sum of 100 and 25 is: " + sumNumbers(100, 25));

        System.out.println("The comparision is: " + compareStrings("abc", "abcdefg"));

//        System.out.print("Enter the number you want to find the cube of - ");
//        int number = sc.nextInt();
//        System.out.println("The cube of " + number + " is - " + calculateCube(number));

        System.out.print("Enter the number you want to check for PRIME - ");
        int num = sc.nextInt();
        System.out.println(num + " is PRIME: " + isPrime(num));
    }
}
