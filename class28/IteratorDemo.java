package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> courses =new LinkedList<>();
        courses.add("SDLC");
        courses.add("ManualTesting");
        courses.add("Java");
        courses.add("Java");
        courses.add("Selenium");
        //DO NOT USE LOOPS WHEN YOU NEED TO CHANGE THE SIZE OF THE ARRAY!
        //dOWN BELOW ARE TWO EXAMPLES OF TRYING TO USE FOR AND FOR EACH LOOP WHICH DOESNT WORK
        //ITERATOR SHOUD BE USED INSTEAD
        /*for(int i=0;i<5;i++){
            if(courses.get(i).equals("Java")){
                courses.remove("Java");
            }
        }*/

        /*for (String corse:courses){
            if(corse.equals("Java")){
                courses.remove((corse));
            }
        }*/
        Iterator<String> iterator= courses.iterator();

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());

    }
}
