package com.syntax.ReviewClass8;

import java.util.Locale;

public class StringClass1 {
    public static void main(String[] args) {


    //Ways to define a String
    String batch="SDET Batch 12";
    String employee="Vladimir";
    // String batch12= new String("My value");

        System.out.println(batch);
        System.out.println(batch.toUpperCase());
        System.out.println(employee.toLowerCase(Locale.ROOT));
        String employeeName="Sai gopi krishna gopala kashtabai venkata ramana";
        System.out.println(employeeName.length());
}
}
