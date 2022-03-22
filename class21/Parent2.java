package com.syntax.class21;

public class Parent2 {
    String name="Parent";
    void printName(){
        System.out.println(name);
    }
}
class Child2 extends Parent2{

    String name="Child";
    void printName(){
        String name="Teyfuring";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);

    }
}
class ParentTester{
    public static void main(String[]args){
        Child2 child2=new Child2();
        child2.printName();
    }
}