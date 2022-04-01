package com.syntax.class28;

import java.util.ArrayList;

//Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
public class Task3 {
    public static void main(String[] args) {
        //In this task no need to use iterator because the size of the arraylist is the same, only elements are modified
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Coke");
        drinks.add("Tea");
        drinks.add("coffee");
        drinks.add("aloevera");
        drinks.add("milk");

        for (int i=0;i<drinks.size();i++){
            if(drinks.get(i).contains("a")||drinks.get(i).contains("e")){
               drinks.set(i,"Water");
            }
        }
        System.out.println(drinks);
    }
}
