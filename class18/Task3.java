package com.syntax.class18;

public class Task3 {
    //Create a method that will accept a String as a parameter and return a new String that consist
    // only of vowels. Method should be available inside the class only
    // where it was declared and executed by calling it is name.

    //static methods can access other static methods and fields without needing an
    //object of that class or the class name if they are inside a same class
    private static String onlyvowels(String input){
       // String newStr=input.replaceAll("[aeiouAEIOU]","");
        // return newStr;
        //same thig just shorter way
        return input.replaceAll("[aeiouAEIOU]","");
    }

    public static void main(String[] args) {

        System.out.println(onlyvowels("Emili"));
    }
}
