package com.syntax.class22;
//Create 1 class with a static method that has 3 overloaded forms.
//Then call each overloaded method with specific arguments and observe result.
public class HM3 {
    static void method (int a){
        System.out.println(a);
    }
    static void method (int a, int b){
        System.out.println(a+b);
    }
    static void method (int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        HM3 hm3=new HM3();
        hm3.method(1);
        hm3.method(1,2);
        hm3.method(1,2,3);

        //we cab call methods directly because its static and its in a same class!!!
        method(1);
        method(1,2);
        method(1,2,3
        );

    }
}
