package com.syntax.class16;

public class Task {
    public static void main(String[] args){
        //TASK3 You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
// How would you find out how many sentences are in that String?
String s="Is it saturday? Is it raining? Do we have a Java Class today?";
String[] sArr=s.split("[?]");
        System.out.println(sArr.length);
    }
}
