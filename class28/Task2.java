package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

//Create an arrayList of words. Remove every word that ends with “e”.
public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Java");
        words.add("Love");
        words.add("lahore");
        words.add("cake");
        System.out.println(words);

       // words.removeIf(s ->s.toLowerCase(Locale.ROOT).endsWith("e")); this is a shorter way to the the same as below

        Iterator<String> iterator = words.iterator();
        while(iterator.hasNext()){
            if(iterator.next().toLowerCase(Locale.ROOT).endsWith("e")){
                iterator.remove();
            }
        }
        System.out.println(words);


    }
}
