package com.syntax.class21;

public class ClassAA {
    String name;
    int age;
    double weight;

    public ClassAA( String name, int age,double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    void printInfo(){
        System.out.println(name+" "+age+" "+weight);
    }
}
class ClassBB extends ClassAA{
    public ClassBB( String name, int age,double weight) {
        super(name, age,weight);//mostly this is how it will be used at your job
        /*
        Because constructor from the parent class dont participate in inheritance
        we need to create a matchig constructor in the child classes as well
        we can use super()to call the constructor from parent class so that we dont need to repeat the code
         */
    }
}
class Test{
    ClassBB classbb=new ClassBB("Tristan",25,65);


}
