package com.syntax.class16;

public class StringvsStringBulder {
    public static void main(String[]args){
        String s="Asghar Is Great";//original string
        s.concat("hahaha");//add new string hahaha to the string
        System.out.println(s);//printing the original string

        StringBuilder stringBuilder=new StringBuilder("Asghar Is Great");//original string
        stringBuilder.append("hahaha");//add new string to the string
        System.out.println(stringBuilder);//print changed string
        System.out.println(stringBuilder.reverse());



        //*String(Mutable)(mutable means can be change) builder is faster but takes more space, if we dont care about memory but we want speed
        //always use String builder
        //*String(Imutable)(imutable means unchangable) is the most widely use class, we use it when we care aout memory
        //changing one variable will chnage them all
        //string creates one same memory for all strings
        String str="";
        for(int i=0;i<1000;i++){
        }
    }
}
