package com.syntax.class27;

import java.util.ArrayList;

//Create an ArrayList that will store 5 names into it.
//Find out whether the given ArrayList is empty or not?
//Check whether the specific name is present in an ArrayList or not?
//Find the size of your arrayList and print all values from that
public class Tsk1 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Asel");
        names.add("Mozzam");
        names.add("Asghar");
        names.add("Ekatarina");
        names.add("Beni");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Alex"));
        System.out.println(names.contains("Asel"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
