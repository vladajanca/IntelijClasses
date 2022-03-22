package com.syntax.class19;

public class SeriousHorseTester {
    public static void main(String[] args) {
        Horse horse=new Horse("Jacky",20,40);
        /*
        Horse                -> Data type(Name of classes)
        horse                -> Object/instance/refrence variable/variable
        =                    -> Assignment operator
        Horse("Jacky",20,40) ->Call to the constructor
         */
        horse.printhorseName();
    }
}
