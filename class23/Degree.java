package com.syntax.class23;
//Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
//Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
//Call the method by creating an object of each of the three classes.
public class Degree {
    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Degree{

}
class Masters extends Degree{
    @Override
    void getPrerequisite(){
        System.out.println("To get a Masters degree you need Bachleros");
    }
}
class DegreeTester{
    public static void main(String[] args) {
        Bachelors bachelors = new Bachelors();
        Masters masters = new Masters();

        bachelors.getPrerequisite();
        masters.getPrerequisite();
    }
}
