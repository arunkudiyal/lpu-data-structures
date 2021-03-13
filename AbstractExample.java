package com.upgrad;

// A class containing an abstract methods | Abstract Class
abstract class Shape {
    private String name;

    // Parametrized Constructor
    Shape(String name) {
        this.name = name;
    }

    // A method which has a body is inside an Abstract Class
    public void show() {
        System.out.println("This method is CONCRETE");
    }

    // A method which does not have a body | Abstract Methods
    public abstract double calculateArea();
    public abstract void draw();
}

// Any class which extends the abstract class, needs to override the abstract methods
class Rectangle extends Shape {
    private int length, breath;

    // Parameterized Constructor
    Rectangle(int length, int breath, String name) {
        super(name);
        this.length = length;
        this.breath = breath;
    }

    @Override
    public double calculateArea() {
        return (double) length * breath;
    }

    @Override
    public void draw() {
        System.out.println("A Rectangle was drawn");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20, "Rectangle-One");
        System.out.println("The Area is: " + rectangle.calculateArea());
        rectangle.draw();
    }
}
