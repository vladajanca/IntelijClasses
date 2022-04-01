package com.syntax.class28;

import java.util.ArrayList;

public class ListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList();
        arrayList.add("10");
        arrayList.add("Name");
       // arrayList.add(true);
       // arrayList.add(12.5);

        for(int i=0;i<arrayList.size();i++){
            if(arrayList.get(i) instanceof String){ //this instanceof keyword will tell us is it dataType convertable or not


            }
            System.out.println(((String)arrayList.get(i)).length());
        }
        //this is how it was in java older versions, before 1.5, you can call any data type in ArrayList
        //after 1.5 versions devs developed dimond operator
    }
}
