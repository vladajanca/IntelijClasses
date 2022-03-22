package com.syntax.ReviewClass9;
public class Doctor {

    public String firstName;
    protected String lastName;
    String specalty;
    private int salary;
//local variable is a variable declared inside a method or constructor or bloc of code
    //local variables cant be access outside of block of code where are used
    //VARIABLES INSIDE THIS CONSTRUCTOR ARE LOCAL VARIABLSE


    //We can have multiple constructors by overloading them
    public Doctor(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Doctor(String firstName, String lastName, String specalty) {
        this(firstName,lastName);
        this.specalty = specalty;
    }

    static String hospital="George Washington";

    protected void work(){
        System.out.println("All doctors works at the "+hospital);
    }
    public void printInfo(){
        hello();//we dont need to write this. because its added by default
        System.out.println("Doctor "+firstName+lastName+" is a "+specalty+" at "+hospital);
    }

    void work1(){
        System.out.println("All doctors works at "+hospital);
    }
    void hello(){
        System.out.println("Hello");
    }
    private void getPaid(){
        System.out.println("Doctor "+firstName+" "+lastName+" guess pay "+salary);
    }
}
