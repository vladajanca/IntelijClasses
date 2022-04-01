package com.syntax.ReviewClass10;
class Grandparent {
    String name;
    Grandparent(String name){
        this.name=name;
        System.out.println("Grandparent");
    }
    void printName(){}
}
public class Parent extends Grandparent {
    Parent(String name){
        super(name);
        System.out.println("Parent");
    }
}
class Child extends Parent{
    Child(String name){
        super(name);
        System.out.println("Child");
    }
}
class Tester{
    public static void main(String[] args) {
        Child child=new Child("Vlad");
    }
}
