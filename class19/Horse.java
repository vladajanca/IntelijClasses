package com.syntax.class19;

public class Horse {
    //It is very good practice to make fields private
    //if fields are not private we dont need to use a constructor, we can access them without it.
    private String name;
    private int age;
    private double weight;
    Horse(String horseName,int horseAge, double horseWeight){
        name=horseName;
        age=horseAge;
        weight=horseWeight;

    }

    //No argument/zero constructor
    Horse(){
        /*write same important lines of code that you want to execute when
        the object of the class is created for example, you might want to fetch some info
        from internet or hard disk to give initial values to the fields
         */
    }
    //Rule no 1->Constructor  dont have return types like int, String, not even void...
    //Rule no 2->Name of the constructor same as a name of the class.
    /*void Horse(String horseName,int horseAge, double horseWeight){
        name=horseName;
        age=horseAge;
        weight=horseWeight;
    }
    */
    void printhorseName(){

        System.out.println("Name "+name);
    }
    void setName(String horseName){
        name=horseName;
    }
}
