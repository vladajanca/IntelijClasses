package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

//Create an arraylist of cars and retrieve all the values using 3 different ways.
public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Toyota");
        cars.add("Honda");
        System.out.println(cars);  //1
        System.out.println("************************************");
        for (String car : cars) {   //2
            System.out.println(car);
        }
        System.out.println("************************************");
        for(int i =0;i<cars.size();i++){ //3
            System.out.println(cars.get(i));
        }
        System.out.println("************************************");
        int i =0;
        while ( i<cars.size()){         //4
            System.out.println(cars.get(i));
            i++;
        }
        System.out.println("************************************");
        Iterator<String> iterator=cars.iterator(); //5
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
