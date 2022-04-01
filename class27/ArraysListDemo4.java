package com.syntax.class27;

import java.util.ArrayList;

public class ArraysListDemo4 {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Bannana");

        ArrayList<String> vegetables=new ArrayList<>();
        vegetables.add("Potato");
        vegetables.add("Onion");
        vegetables.add("Carrot");

        ArrayList<String> groceries=new ArrayList<>();
        groceries.addAll(fruits);
        groceries.addAll(vegetables);
        System.out.println(groceries);

    }
}
