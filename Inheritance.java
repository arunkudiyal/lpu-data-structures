package com.upgrad;

class Parent {
    // properties
    protected int a, b, c;

    // Default Constructor
    Parent() {
        System.out.println("Parent Object Created!");
    }

    // Parameterized Constructor
    public Parent(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // method
    public int showA() {
        return a;
    }
    public int showB() {
        return b;
    }
    public int showC() {
        return c;
    }
}

class Child1 extends Parent {
    // properties
    private int d, e;

    // Constructor
    Child1() {
        super(10, 20, 30);
    }

    // Parameterized Constructor
    Child1(int d, int e) {
        this. e = e;
        this. d = d;
    }


    // methods
    public int showD() {
        return d;
    }
    public int showE() {
        return e;
    }
}

class Child2 {
    private int g = 50;

    public Child2() {
        System.out.println("Child2 Object Created!");
    }

    public int getG() {
        return g;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // creating the instance sof the classes
        Child1 c = new Child1();
        Child2 c2 = new Child2();
    }
}
