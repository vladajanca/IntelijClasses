package com.syntax.class19;

public class Student {
    /*
    Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
    Your program should print an average mark of each students name.
     */
    String name;
    int grade1;
    int grade2;
    int grade3;

    public Student(String name, int grade1, int grade2, int grade3) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }
    void average(){
        System.out.println(name+" "+(grade1+grade2+grade3)/3);
    }


}
