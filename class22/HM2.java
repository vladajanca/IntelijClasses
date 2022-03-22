package com.syntax.class22;

public class HM2 {
    /*
    Create a class named 'Programming'. While creating an object of the class,
    if nothing is passed to it, then the message "I love programming languages" should be printed.
    If some String is passed to it, then in place of "programming languages" the value variable should be printed.
    Example, if we pass "Java", then "I love Java" should be printed
     */
    HM2(){
        System.out.println("I love programming languages");
    }
    HM2(String s){
        System.out.println("I love "+s);
    }

    public static void main(String[] args) {
        HM2 hm2 = new HM2();
        HM2 hm22 = new HM2("Java");
    }
}

