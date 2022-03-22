package com.syntax.class25;
//Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
//Define common behavior within and some fields in parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Create objects of child classes and store them into array. Loop through each object and execute available methods.
public class HM1SameAsClass24 {
    public static void main(String[] args) {
        Lenovo lenovo=new Lenovo("lenovo");
        lenovo.login();
        HP hp=new HP("HP");
        hp.login();//if class is not providing the implementation in its ovw, once we call it it will call it from parent class

    }
}
class Computer{
    String make;
    Computer(String make){
        this.make=make;
    }
    void login(){
        System.out.println("Use username and password to login");
    }

}
class Apple extends Computer{
    Apple(String make) {
        super(make);
    }
    void login(){
        System.out.println("Use fingerprint to login as well");
    }
}
class Lenovo extends Computer{
    Lenovo(String make) {
        super(make);
    }
    void  login(){
        System.out.println("use windows hello as login");
    }
}
class HP extends Computer{

    HP(String make) {
        super(make);
    }
}
