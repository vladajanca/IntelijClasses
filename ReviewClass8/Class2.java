package com.syntax.ReviewClass8;

import java.util.Scanner;

import static java.lang.System.in;

public class Class2 {
    String generateUsername(String firstName, String lastName){

        return firstName+"123"+lastName+".com";
    }

    static void vladimirDemand(){
        System.out.println("This is Vladimirs functions");
    }

    public static void main(String[] args) {
        vladimirDemand();
        Class2 obj=new Class2();
        System.out.println(obj.generateUsername("vlada","janca"));
    }
}
