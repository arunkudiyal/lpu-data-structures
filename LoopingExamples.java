package com.company;

import java.util.Scanner;

// LOOPS
public class LoopingExamples {

    // Step1: Initialize the starting point
    // Step2: Iniatilise / Conditionalize the end point very specifically
    // Step3: Be specific how to transit

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. while Loops

        // INFINITE LOOP using while
//        while(true) {
//            System.out.println("Arun");
//        }

//        int index = 0;
//        // Conditionalize the end point | index : 0 - 10
//        while(index < 11) {
//            System.out.println(index);
//            // how to transit
//            index += 1;                 // index = index + 1
//        }

        // STEP1
//        System.out.print("Enter the value of a: ");
//        int a = sc.nextInt();
//        System.out.print("Enter the value of b: ");
//        int b = sc.nextInt();
//
//        // STEP2
//        while (a < b) {
//            // Code
//            System.out.println(a + " " + b);
//            // Transition
//            a += 1;
//        }

        // DESIGN A TABLE FOR 2

//        int number = 2;
//        int product = 0;
//        int counter = 1;
//        while(counter <= 10) {
//            product = number * counter;
//            System.out.println(number + " X " + counter + " = " + product);
//            counter += 1;
//        }

        // 2. for loop

        // for(;;) | Infinite for Loop

        for(int i = 0; i <= 10; i += 1) {
            System.out.println(i);
        }

        int product = 0;
        for(int i=1; i<=10; i += 1) {
            product = 3 * i;
            System.out.println("3 X " + i + " = " + product);
        }
    }
}
