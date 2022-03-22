package com.syntax.class22;

public class IfElseDemo {
    int maxNumber(int num1, int num2){
       /* if(num1>num2){
            return num1;
        }else{
            return num2;
        }*/
       return num1>num2?num1:num2;//this code is same as above, just shorter

    }
    public static void main(String[] args) {
        int number=10;
        System.out.println();
        //Ternary operator has the limitation that is must return something, we cant use it to print out
        //number>10?  System.out.println("Number is greater"):  System.out.println("Number is smaller");
    }
}
