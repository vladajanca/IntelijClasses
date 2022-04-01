package com.syntax.class27;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysListDemo5 {
    public static void main(String[] args) {

        ArrayList<String> groceries=new ArrayList<>();
        groceries.add("Apple");
        groceries.add("Orange");
        groceries.add("Banana");
        groceries.add("Potato");
        groceries.add("Onion");
        groceries.add("Carrot");
        System.out.println(groceries);

        ArrayList<String> itemsToBeRemoved=new ArrayList<>();
        itemsToBeRemoved.add("Apple");
        itemsToBeRemoved.add("Onion");
        itemsToBeRemoved.add("Pillow");

        groceries.removeAll(itemsToBeRemoved);
        System.out.println(groceries);
    }
}
