package com.syntax.class21;

public class MethodOverloadingDemo2 {
    void printInfo(String name, int age, double weight){
        System.out.println("M1");
        System.out.println(name+" "+age);
    }
    void printInfo( int age,String name, double weight){
        System.out.println("M2");
        System.out.println(name+" "+age);
    }
    void printInfo(double weight, String name, int age ){
        System.out.println("M3");
        System.out.println(name+" "+age);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo2 methodOverloadingDemo2=new MethodOverloadingDemo2();
        methodOverloadingDemo2.printInfo("Zulfia",16,28.0);
    }
}
