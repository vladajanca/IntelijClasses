package com.syntax;

import java.lang.constant.Constable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        ArrayList<Integer> fibinaciNumbers=new ArrayList<>();
        int num1=0;
        int num2=1;
        int num3;
        int count=8;
        fibinaciNumbers.add(num1);
        fibinaciNumbers.add(num2);
        for(int i=0;i<count;i++){
            num3=num1+num2;
            num1=num2;
            num2=num3;
            fibinaciNumbers.add(num3);
        }
        for(int fibinaciNum: fibinaciNumbers){
            System.out.print(fibinaciNum+" ");
        }
    }
}



