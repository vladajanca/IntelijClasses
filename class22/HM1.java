package com.syntax.class22;

public class HM1 {
    /*Create 1 class in which create a methods that will calculate the area (volume in case of box) of
     Rectangle
     Square
     Box*/
    int height, width, length;
    static void rectangular(int width){
        System.out.println(Math.pow(width,2));
    }
    static void square(int length, int width){
        System.out.println(length*width);
    }
    static void boxArea(int length,int width, int height){
        System.out.println(length*width*height);
    }

    public static void main(String[] args) {
        HM1 hm1=new HM1();
        hm1.rectangular(10);
        hm1.boxArea(10,20,15);
        hm1.square(12,12);
    }
}


