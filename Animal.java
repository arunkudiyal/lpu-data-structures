package com.company;

public class Animal {

    // ATTRIBUTES OF A CLASS
    // properties
    String kind;
    String breed;
    int no_of_legs;
    String color;
    String gender;

    // Constructor
    Animal() {

    }

    // METHODS OF THE CLASS
    // behavior/ functionalities -> eat, sleep, walk, produce_sound, play
    public void eat() {
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping....");
    }
     public void walk() {
         System.out.println("Walking....");
     }

     public void play() {
         System.out.println("Playing");
     }


    // CREATE REAL WORLD ENTITIES
    public static void main(String[] args) {
        // Step 1: Create an instance of the class | Creating an object
        // ClassName instanceName = new constructor()
        Animal dog = new Animal();
        dog.breed = "German Shepard";
        dog.color = "Black";
        dog.gender = "Male";
        dog.kind = "Dog";
        dog.no_of_legs = 4;
        dog.eat();
        dog.play();
        dog.walk();
        dog.sleep();
        System.out.println("Jack is a " + dog.breed + " which is " + dog.gender + " has a color of " + dog.color );

        Animal cat = new Animal();
        cat.breed = "Persian Cat";
        cat.color = "White";
        cat.gender = "Female";
        cat.kind = "Cat";
        cat.no_of_legs = 4;
        cat.eat();
        cat.play();
        cat.walk();
        cat.sleep();
        System.out.println("Meowth is a " + cat.breed + " which is " + cat.gender + " has a color of " + cat.color);

    }
}
