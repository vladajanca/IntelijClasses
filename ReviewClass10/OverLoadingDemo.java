package com.syntax.ReviewClass10;

public class OverLoadingDemo {
    static void add(int a, int b){
        System.out.println(a+b);
        System.out.println("1");
    }
    static void add(double a, int b){
        System.out.println(a+b);
        System.out.println("2");
    }
    static void add(double a, double b){
        System.out.println(a+b);
        System.out.println("3");
    }
    static void add(int a, int b,int c){
        System.out.println(a+b+c);
        System.out.println("1");
    }

    public static void main(String[] args) {
        add(10.1,10);
    }
}
