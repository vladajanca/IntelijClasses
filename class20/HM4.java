package com.syntax.class20;

public class HM4 {
    /*
    Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    Instance variables are being initialized
    Both Constructors are being executed
     */
    String bookName;
    double price;

    public HM4(){
        System.out.println("No argument constructor");
    }
    public HM4(String bookName, double price){
        this();
        this.bookName=bookName;
        this.price=price;
        System.out.println("Two arguments constructor");
    }
}
