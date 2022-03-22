package com.syntax.class22;
//Create 1 class with a private method that has 3 overloaded forms.
//Then call each overloaded method with specific arguments and observe result.

public class HM4 {
    private void method(int a) {
        System.out.println(a);
    }

    private void method(int a, int b) {
        System.out.println(a+b);
    }

    private void method(int a, int b, int c) {
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        HM4 hm4 = new HM4();
        hm4.method(1);
        hm4.method(1, 2);
        hm4.method(1, 2, 3);
    }
}
