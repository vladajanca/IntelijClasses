package com.syntax.class19;
public class Homework1 {
    /*
    Write a java class that have 4 constructors with 4 different access levels
    of constructors(private,public,default,protected) and create 4 objects of this class:
    1 - inside same class; 2 - from outside the class;
    3 - from different class inside different package  and observe result.
     */
    int a1;
    int a2;
    int a3;
    public Homework1(int a1,int a2,int a3){
        this.a1=a1;
        this.a2=a2;
        this.a3=a3;
        System.out.println("Public Constractor");
    }
    private Homework1(int a1, int a2){
        System.out.println("Private Counstructor");
        this.a1=a1;
        this.a2=a2;
    }
    Homework1(int a1){
        System.out.println("Default Constructor");
        this.a1=a1;
    }
    protected Homework1(){System.out.println("Protected Constructor");}

    public static void main(String[] args) {
    Homework1 h1=new Homework1(1,2,3);
    Homework1 h2=new Homework1(1,2);
    Homework1 h3=new Homework1(1);
    Homework1 h4=new Homework1();
    }
}
