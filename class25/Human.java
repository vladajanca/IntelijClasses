package com.syntax.class25;

public interface Human {
    //public static final redundant because by default all variables are public static final
    int legs=2;
    void walk();
    static void printlegs(){
        System.out.println(legs);
    }
    public default void NoNeedToWorry(){
        System.out.println("default methods are here for functional programing");
    }
}
interface LivingBeing{
    static void printlegs(){
        System.out.println("Not sure");
    }
}
class Maha implements Human,LivingBeing{

    @Override
    public void walk() {
        System.out.println("I can walk");
    }

    public static void main(String[] args) {
        Maha maha=new Maha();
        maha.walk();
        //Maha.printlegs();
        Human.printlegs();// if we want to call a static method from interface, we calll it by interface method
        LivingBeing.printlegs();

    }
}
