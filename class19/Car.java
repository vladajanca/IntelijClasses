package com.syntax.class19;

public class Car {
    String name;
    String made;
    String color;
    String model;
    String type;

    Car(String name,String make,String color,String type){
        /*
        if we have same local and instance variables java always
        prefer local variables and if you want to instruct
        java to use instance variables we use "this" keyword
         */
        this.name=name;
        this.made=made;
        this.color=color;
        this.type=type;
}
    Car(){

    }
    void PrintCar(){
        String name="Tesla";
        System.out.println(name);
        System.out.println(this.name);
    }
}
