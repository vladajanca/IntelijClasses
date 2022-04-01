package com.syntax.class27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysListDemo6 {
    public static void main(String[] args) {
        List<String> groceries= Arrays.asList("Apple","Oranges","Bannana");
        //groceries.add("Apple");
        //groceries.add("Orange");
        //groceries.add("Banana");
        //groceries.add("Potato");
        //groceries.add("Onion");
        //groceries.add("Carrot");
        System.out.println(groceries);

        ArrayList<String> itemsToBeRemoved=new ArrayList<>();
        itemsToBeRemoved.add("Apple");
        itemsToBeRemoved.add("Onion");
    }
}
