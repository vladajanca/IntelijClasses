package com.syntax.class23;

public class StaticDemo {

}
class Cat{
    static int NoOfLegs=4;
    String name;

    public Cat(final String name) {
        this.name = name;
    }
    public void printInfo(){
        System.out.println(name+NoOfLegs);
    }
    public static void Print(){
        //If we are inside a static method we can not access inside fileds directly inside static method
        //
        //System.out.println(name+NoOfLegs);
        //We cant use instance fields with static methods
        System.out.println(NoOfLegs);
    }

    public static void main(String[] args) {
        Cat cat1=new Cat("Stella");
        Cat.Print();
        Cat cat2=new Cat("Nutella");
        Cat.Print();


    }

}
