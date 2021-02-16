package com.company;

import java.util.Scanner;

public class ConditionalStatements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // I'm expecting the user input  to be 10
        // if 10 occurs, say 10 has been found!
        // if 10 does not occur, say try again

        // System.out.print("Enter the value: ");
        // int value = sc.nextInt();

        /*
        * if(condition1) { what to do when condition is True }
        * else { what to do when condition is False }
        * */

        // Conditional Statements
//        if(value == 10) {
//            // do something
//            System.out.println("10 has been found!");
//        }
//        else {
//            System.out.println("Try again!!");
//        }

//        System.out.print("Enter the new value: ");
//        int value1 = sc.nextInt();
//
//        if(value1 == 5) {
//            // Do something
//            System.out.println(" 5 was found, value changed to 10 ");
//            value1 = 10;
//            System.out.println("New value is: " + value1);
//        }
//        System.out.println("Value is: " + value1);

//        System.out.print("Enter the value: ");
//        int check = sc.nextInt();

        // Range 1 : 0 to 3 -> print(range1)
        // Range 2 : 4 to 7 -> print(range2)
        // Range 3 : 8 to 10 -> print(range3)
        // Range 4 : 11 to 15 -> print(range4)
        // Range dead -> print(Dead Range)

//        if(check <= 3) : else if(check >=4 && check <=7) :
//        if(check == 0 || check == 1 || check == 2 || check == 3) {
//            System.out.println("Range - 1");
//        }
//        else if(check == 4 || check == 5 || check == 6 || check == 7) {
//            System.out.println("Range - 2");
//        }
//        else if(check == 8 || check == 9 || check == 10) {
//            System.out.println("Range - 3");
//        }
//        else if(check == 11 || check == 12 || check == 13 || check == 14 || check == 15) {
//            System.out.println("Range - 4");
//        }
//        else {
//            System.out.println("Dead Range Occured!");
//        }
//        System.out.println("Code Ended!");

//        System.out.print("Enter the value of a: ");
//        int a = sc.nextInt();
//
//        System.out.print("Enter the value of b: ");
//        int b = sc.nextInt();

        // Comparing the two integer values
        // c1 : a > b
        // c2 : a < b
        // c3 : a = b

//        if(a == b) {
//            System.out.println("a and b has an equal value of " + a);
//        } else if(a > b) {
//            System.out.println(a + " is greater than " + b);
//        } else if(a < b) {
//            System.out.println(a + " is lesser than " + b);
//        } else {
//            System.out.println("Code Stuck!");
//        }

//        if(a == b) {
//            System.out.println("a and b has an equal value of " + a);
//        } else if(a > b) {
//            System.out.println(a + " is greater than " + b);
//        } else {
//            System.out.println(a + " is lesser than " + b);
//        }

        // NESTED IF BLOCKS

        // Range 1 : 0 to 3 -> print(range1)
        // Range 2 : 4 to 7 -> print(range2)
        // Range 3 : 8 to 10 -> print(range3)
        // Range 4 : 11 to 15 -> print(range4)
        // Range dead -> print(Dead Range)

//        System.out.print("Enter a positive value: ");
//        int value = sc.nextInt();
//
//        // Check if the value is positive of not
//        if(value >= 0) {
//            if(value >= 0 && value <= 3) {
//                System.out.println("Range - 1");
//            }
//            else if(value >= 4 && value <= 7) {
//                System.out.println("Range - 2");
//            }
//            else if(value >= 8 && value <= 10) {
//                System.out.println("Range - 3");
//            }
//            else if(value >= 11 && value <= 15) {
//                System.out.println("Range - 4");
//            }
//            else {
//                System.out.println("Dead Range!");
//            }
//        } else {
//            System.out.println("Enter a positive value...");
//        }


        // SWITCH

        // number -> 1 to 7
        // 1 - Monday, 2 - Tuesday, 3 - Wednesday....

//        System.out.print("Enter the number: ");
//        int number = sc.nextInt();
//
//        // switch(options/ choice)
//        switch (number) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
////            default:
////                System.out.println("Your week might have diff no of days, I only have 7 days... SORRY!");
////                break;
//        }


    }
}
