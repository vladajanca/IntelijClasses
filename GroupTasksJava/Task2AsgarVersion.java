package com.syntax.GroupTasksJava;
//.We have to calculate the average of marks obtained in three subjects by student A and by student B.
//Create   class   'Marks'   with   an   abstract   method 'getPercentage' that will be returning the average
//percentage   of   marks.   Provide   implementation   of abstract   method   in   classes   'A'   and   'B'.
//constructor of student A takes the marks in three subjects as its parameters and the marks in four
//The subjects as its parameters for student B. Test your code
public class Task2AsgarVersion {
    public static void main(String[] args) {
        A a=new A(77,88,66);
        B b=new B(65,87,89,99);
        System.out.println(a.getPercentage());
        System.out.println(b.getPercentage());

    }

}
abstract class Marks1{
    abstract double getPercentage();
}
class A extends Marks1{
    private double subject1;
    private double subject2;
    private double subject3;
A(double subject1,double subject2,double subject3){
    this.subject1=subject1;
    this.subject2=subject2;
    this.subject3=subject3;
}
    double getPercentage() {
    double avg=(subject1+subject2+subject3)/3;
        return avg;
    }
}
class B extends Marks1{
    private double subject1;
    private double subject2;
    private double subject3;
    private double subject4;
    B(double subject1,double subject2,double subject3,double subject4){
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
        this.subject4=subject4;
    }
    double getPercentage() {
        double avg=(subject1+subject2+subject3+subject4)/4;
        return avg;
    }
}
