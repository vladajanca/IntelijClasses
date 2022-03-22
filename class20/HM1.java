package com.syntax.class20;

public class HM1 {


    private HM1(){
        System.out.println("Private");
    }
    HM1(double a){
        System.out.println("Default");
    }
    protected HM1(String a){
        System.out.println("Protected");
    }
    public HM1(boolean a){
        System.out.println("Public");
    }

    public static void main(String[] args) {
        new HM1();
        new HM1("haha");
        new HM1(10.1);
        new HM1(false);

    }
}
