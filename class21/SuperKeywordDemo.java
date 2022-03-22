package com.syntax.class21;

public class SuperKeywordDemo {
    public static void main(String[] args) {
       Child child=new Child();
       child.printColor();
       child.print();
    }
}
class GrandParent{
    String color="Blue";
    void printInfo(){
        System.out.println("I am granpa");
    }
}
class Parent{
    String color="Black";
    void printInfo(){
        System.out.println("I am father");
    }
    void print(){
        printInfo();
    }
}
class Child extends Parent{
String color="Red";
    void printInfo(){
        System.out.println("I am child");
    }
    void print(){
        printInfo();
    }
void printColor(){
    String color="green";
    System.out.println(color); //refers to the local variable
    System.out.println(this.color);//refers to the instance variable
    System.out.println(super.color);//refers to the parent variable
}
}

