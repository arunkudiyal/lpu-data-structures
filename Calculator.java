package com.upgrad;

public class Calculator {


    // Method Overloading - You can create methods in the same class
    // of the same name but different parameters (type / number)

    public int add(int a, int b) {
        return a + b;
    }

    public String add(String a, int b) {
        return "added";
    }

    public int division(int a, int b) {
        return a/b;
    }

    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public String add(String s1, String s2) {
        return s1 + "---" + s2;
    }
 }

class CalculatorMain {
    // Main method -> One main method | static
    public static void main(String[] args) {

        // Checked Exceptions - checked on compile time
        int[] arr = {10, 20, 30, 40};
        System.out.println(arr[10]);

        // Object - 1
        Calculator c1 = new Calculator();
        System.out.println(c1.add(10, 20));                     // 30
        System.out.println(c1.add(10, 20, 30, 40));      // 100
        System.out.println(c1.add("Suraj", "Kumar"));                // Suraj---Kumar
        // Unchecked Exception -> Checked on Run-time
        System.out.println(c1.division(10, 0));
    }
}
