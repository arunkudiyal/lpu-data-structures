package com.upgrad;

class Student {
    private String name;
    private int year;
    private int annualFees = 100000;

    public Student() {
    }

    public Student(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getDetails() {
        return "Name " + name + " is in the year " + year;
    }

    public int computeFee() {
        return this.annualFees;
    }
}

class ResearchStudent extends Student {
    private String reserachArea;

}

public class StudentInfo {
    public static void main(String[] args) {
        // instance for child class

        ResearchStudent student1 = new ResearchStudent();
        // Method of the parent class
        student1.computeFee();
    }
}
