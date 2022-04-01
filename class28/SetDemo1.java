package com.syntax.class28;

import java.util.HashSet;

public class SetDemo1 {
    public static void main(String[] args) {
        //HashSet ==> No duplicates and no isertion order(does not print in the order that was input)
        HashSet<String> fruit=new HashSet<>();
        fruit.add("apple");
        fruit.add("mango");
        fruit.add("kiwi");
        fruit.add("orange");
        fruit.add("bannana");
        fruit.add("apple");
        System.out.println(fruit);
    }
}
