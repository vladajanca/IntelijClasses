package com.syntax.class28;
//Create a class Insurance that will have an attribute as insuranceName
//and unimplemented behaviour as getQuote and cancelInsurance.
//Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel
//and Class Pet has petType attribute. Create 3 objects of the sub classes and store them in ArrayList.
//Using for loop/advanced for loop/ iterator access all methods of the class.
public class HM1 {
    public static void main(String[] args) {
Insurance[] obj={new Car(),new Pet(),new Health()};
for(int i=0;i< obj.length-1;i++){// 1
    System.out.println(obj[i]);
}
for(Insurance o:obj){  //2
    o.cancelInsurance();
    o.getQuote();
}
    }
}
abstract class Insurance{
    String insuranceName;
    abstract void getQuote();
    abstract void cancelInsurance();
}
class Car extends Insurance{
    String carModel;

    void getQuote() {
        System.out.println("Car Quote");
    }
    void cancelInsurance() {
        System.out.println("Cancel Car Insurance");
    }
}
class Pet extends Insurance{
    String petType;

    void getQuote() {
        System.out.println("Pet Quote");
    }
    void cancelInsurance() {
        System.out.println("Cancel Pet Incurance");
    }
}
class Health extends Insurance{

    void getQuote() {
        System.out.println("Health Quote");
    }
    void cancelInsurance() {
        System.out.println("Cancel Health Insurance");
    }
}
