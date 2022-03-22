package com.syntax.class16;

public class Task1 {
    public static void main(String[]args){
//TASK1 Create a String that will hold a sentence. Write a program to get a new String without any spaces.
        String s="Hello Batch 12,How are you?";
        String news=s.replace(" ","");
        System.out.println(news);
//TASK2 Create a String that should be combination of letters, numbers and special characters.
// Find out how many Alphanumeric characters are there in the String.
        String s1="123456werty!@#$%^&";
        System.out.println(s1.length());
        System.out.println(s1.replaceAll("[^A-Za-z0-9]","").length());
        System.out.println(s1.replaceAll("[^A-Za-z0-9]",""));
//TASK3 You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
// How would you find out how many sentences are in that String?
        String a="Is it saturday? Is it raining? Do we have a Java Class today?";
        System.out.println(a.length());//String class to count anumber of char in a class
        System.out.println(a.split("[?]").length);//length property that we use to count the numbers of elemensts

        int[]arr={10,10};
        System.out.println(arr.length);
    }
}
