package com.syntax.class20;

public class Task2A {
    /*
    Write program to inherit class A that has method printF which is static
    and call or reuse that method into class B.
     */
    static void printF() {
        System.out.println("This is static method");
    }
}
class Task2B extends Task2A{
    public static void main(String[] args) {
        Task2B task2B=new Task2B();
        task2B.printF();
    }
}
