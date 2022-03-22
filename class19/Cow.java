package com.syntax.class19;

public class Cow {
    /*
    the constructor that is provided automaticlly when we dont
    create any constructor is called default constructor
     */
    static int normalNumberOfLegs=4;
    //when we dont asign values to the instance fields
    //java assigns default to these fields.
    //int=0; double=0.0; class object with null; boolean= false; char \u0000
    private String name;
    int age;
    double weight;
    String breed;
    char ch;
    //below is zero argument or no argument constructor
    Cow(){

    }
    void printName(){
        System.out.println(name);
        System.out.println(ch);
        System.out.println(weight);
    }
}
