package com.syntax.class17;

public class HealthyDog {
    //when information is expected to be different from object to object
    //we store info in an instance variable
    String name;//instance variable
    String color;//instance variable
    //if we know that a value will stay same for all the objects of a class
    //we create a static variable for that
    static int numberOfLegs=4;//static
    void eat() {
        int noOfTimes=3;//local variable
        System.out.println(name+" eats "+noOfTimes);
    }

    public static void main(String[] args) {
        HealthyDog dog=new HealthyDog();//local
        dog.name="scooby";
        dog.color="green";
        HealthyDog.numberOfLegs=6;
        dog.eat();

        HealthyDog dog2=new HealthyDog();
        dog2.name="tommy";
        dog2.color="navi blue";
        HealthyDog.numberOfLegs=4;
        dog2.eat();

    }
}
