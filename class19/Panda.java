package com.syntax.class19;

public class Panda {
    String name="Poe";
    String breed="Red Panda";
    String color="Red";
    double height=2.2;
    int age=12;
    double weight=35;
    Panda(String pandaName, String pandaBreed,String pandaColor,double pandaHight, int pandaAge, double pandaWeight){
        name= pandaName;
        breed=pandaBreed;
        color=pandaColor;
        height=pandaHight;
        age=pandaAge;
        weight=pandaWeight;
    }
    Panda(String pandaName){
        name=pandaName;
    }
    Panda(String pandaName,String pandaBreed){
        name=pandaName;
        breed=pandaBreed;
    }
    void printInfo(){
        System.out.println(name+" "+breed+" "+color+" "+height+" "+age+" "+weight);
    }
}
