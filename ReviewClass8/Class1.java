package com.syntax.ReviewClass8;

public class Class1 {
    public void printSmallerDigit(int x, int y){
        if(x<y){
            System.out.println("X is smaller one");
        }else if(y<x){
            System.out.println("Y is smaler one");
        }else{
            System.out.println("Both values are the same");
        }
    }

    public static void main(String[] args) {
        Class1 obj=new Class1();
        obj.printSmallerDigit(3,5);
        int [] arr = new int[5];
    }
}
