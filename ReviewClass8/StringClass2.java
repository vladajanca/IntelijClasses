package com.syntax.ReviewClass8;

import java.util.Locale;

public class StringClass2 {
    public static void main(String[] args) {
        String student="Teyfur";
        System.out.println(student.startsWith("T"));
        student.toLowerCase().startsWith("T");
        System.out.println(student.startsWith("r"));
        System.out.println(student.contains("y"));

        String name = "Habib";
        char output=name.charAt(2);
        System.out.println(output);
    }
}
