package com.syntax.class27;

import java.util.ArrayList;

public class ArraysListDemo1 {
    public static void main(String[] args) {
        ArrayList<Double> numberList=new ArrayList<>();
        Double double1= 12.4;
        double number=double1.doubleValue();//unboxing
        Double number2= number;//boxing
        double number3=10.5;//autoboxing
        Double numebr4=number3;
        number3=numebr4;//autoUnboxing

        String name=new String("Hakan");
        String nane="Hakan";

    }
}
