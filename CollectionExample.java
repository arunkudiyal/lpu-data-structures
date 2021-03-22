package com.upgrad;

public class CollectionExample {

    public static void printStudentList(String[] studentList) {
        for(int i=0; i < studentList.length; i++) {
            System.out.println(studentList[i]);
        }
    }

    public static void main(String[] args) {

        // Array containing names of 3 students
        String[] studentList = {"Student - 1", "Student - 2", "Student - 3"};
        printStudentList(studentList);
    }
}
