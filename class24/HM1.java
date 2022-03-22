package com.syntax.class24;
//Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
//Define common behavior within and some fields in parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Create objects of child classes and store them into array. Loop through each object and execute available methods.
public class HM1 {
    public static void main(String[] args) {
        Computer[] computer={new Apple(),new HP(),new Deli(), new Lenovo()};
        for(int i=0;i<computer.length;i++){
            computer[i].browser();
            computer[i].hardvare();
            computer[i].message();
            computer[i].ramCapacity();
            computer[i].os();
        }
    }
}
abstract class Computer{
    void browser(){
        System.out.println("Can surff internet");
    }
    void hardvare(){
        System.out.println("Have hardvare");
    }
    void message(){
        System.out.println("Sending a message");
    }
    abstract void ramCapacity();
    abstract void os();
}
class Apple extends Computer{
    void ramCapacity(){
        System.out.println("16 Gig");
    }
    void os(){
        System.out.println("IOS Operational System");
    }

}class Lenovo extends Computer{
    void ramCapacity(){
        System.out.println("8 Gig");
    }
    void os(){
        System.out.println("Lenovo Microsoft Operational System");
    }

}class HP extends Computer{
    void ramCapacity(){
        System.out.println("24 Gig");
    }
    void os(){
        System.out.println("HP Microsoft Operational System");
    }

}class Deli extends Computer{
    void ramCapacity(){
        System.out.println("12 Gig");
    }
    void os(){
        System.out.println("Deli Microsoft Operational System");
    }

}

