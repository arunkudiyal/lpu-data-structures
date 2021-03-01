package com.company;

public class Circle {
    // Attribute
    private float radius;

    // Constructors | Way of initialising the data
    // constructor has the SAME NAME AS THAT OF THE CLASS
    // IT DOES NOT HAVE ANY RETURN TYPE, NOT EVEN VOID

    Circle(float radius) {
        // this.attributeName = parameterName
        this.radius = radius;
    }

    // Method
    public float calculateArea() {
        return 3.14f * radius * radius;
    }

    public float calculateCircumference() {
        return 2 * 3.14f * radius;
    }
}

class MainClass {
    public static void main(String[] args) {
        // Object - 1
        Circle circle1 = new Circle(10.5f);
        // circle1.radius = 10.5f;

        // Object - 2
        Circle circle2 = new Circle(5.55f);
        // circle2.radius = 5.55f;

        System.out.println(circle1.calculateArea());
        System.out.println(circle1.calculateCircumference());

        System.out.println(circle2.calculateArea());
        System.out.println(circle2.calculateCircumference());
    }
}

