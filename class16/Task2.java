package com.syntax.class16;

public class Task2 {
    public static void main(String[]args){
// How would you reverse a String word by word? for example
//		// input=>This is sentence i want to reverse
//		// output=>sihT si ecnetnes i tnaw ot esrever

        StringBuilder stringBuilder=new StringBuilder("Sunday is great");
        System.out.println(stringBuilder.reverse());

        String s="Sunday";
        StringBuilder str=new StringBuilder(s);
        str.reverse();
        s=str.toString();
        System.out.println(s);

        String newStr="";

    }
}
