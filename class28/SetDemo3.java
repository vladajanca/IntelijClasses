package com.syntax.class28;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {
        //TreeSet ==>Sorting the elements + Removing duplicates
        TreeSet<String> fruit=new TreeSet<>();
        fruit.add("z");
        fruit.add("a");
        fruit.add("b");
        fruit.add("g");
        fruit.add("d");
        fruit.add("z");
        System.out.println(fruit);
    }
}
