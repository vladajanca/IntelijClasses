package com.syntax.class26;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        String name ="Yazgul";
        String name1="Farah";
        //Not scalable if we have to store large amount of data
        //Arrays can be good option to store large amount of data
        String[] names={"Yazgul","Andrew"};
        //The problem with array is that it is fix size, must me stored as determend before
        //if we store more we get error and if less we still waist the space
        //names[2]="Teyfur";
        String[] names2=new String[1000];
        names2[0]="Elena";
        names2[2]="Andrew";
        System.out.println(Arrays.toString(names2));

        ArrayList<String> syntaxStudents=new ArrayList<>();
        //ArrayList==> Name of the class
        //<> diamond operator
        //String==> datatype
        syntaxStudents.add("Dimitry");
        syntaxStudents.add("Mike");
        syntaxStudents.add("Andrew");
        System.out.println(syntaxStudents);


    }
}
