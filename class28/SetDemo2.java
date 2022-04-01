package com.syntax.class28;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {
        //LinkedHashSet ==> maintanis isertion order but still no duplicates
        LinkedHashSet<String> fruit=new LinkedHashSet<>();
        fruit.add("apple");
        fruit.add("mango");
        fruit.add("kiwi");
        fruit.add("orange");
        fruit.add("bannana");
        fruit.add("apple");
        System.out.println(fruit);
    }
}
