package com.upgrad;

// DYNAMIC POLYMORPHISM
class ParentClass {
    int a = 10, b = 20;
    // Method
    public String showDetails() {
        return (a + ", " + b);
    }

    public void display() {
        System.out.println("DISPLAYING");
    }
}

class ChildClass extends ParentClass {
    int x = 100, y = 200;
    // Method
    /* public String showDetails() {
        return (x + ", " + y);
    } */

    // Override the showDetails method
    public String showDetails() {
        return super.showDetails() + ", " + x + ", " + y;
    }
}

public class TestingPolymorphism {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();

        System.out.println(child.showDetails());
        child.display();
    }
}
