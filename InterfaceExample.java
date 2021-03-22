package com.upgrad;

interface Drawable {
    // An interface contains JUST abstract methods
    public void draw();
}

class Square implements Drawable {
    public void display() {
        System.out.println("A square was created!!");
    }

    @Override
    public void draw() {
        System.out.println("A square was drawn!!");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Square square = new Square();
        square.display();
        square.draw();
    }
}
