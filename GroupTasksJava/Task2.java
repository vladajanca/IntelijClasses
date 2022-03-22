package com.syntax.GroupTasksJava;
//.We have to calculate the average of marks obtained in three subjects by student A and by student B.
//Create   class   'Marks'   with   an   abstract   method 'getPercentage' that will be returning the average
//percentage   of   marks.   Provide   implementation   of abstract   method   in   classes   'A'   and   'B'.
//constructor of student A takes the marks in three subjects as its parameters and the marks in four
//The subjects as its parameters for student B. Test your code
public class Task2 {
    public static void main(String[] args) {
        Marks A=new StudentA(67,34,99);
        Marks B=new StudentB(88,77,85,96);
        System.out.println(A.getPrecentage());
        System.out.println(B.getPrecentage());
    }
}
abstract class Marks{
    abstract double getPrecentage();
}
class StudentA extends Marks{
    double grade1;
    double grade2;
    double grade3;

    public StudentA(double grade1, double grade2, double grade3) {
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    double getPrecentage() {
        return (grade1+grade2+grade3)/3;
    }
}
class StudentB extends Marks{
    double grade1;
    double grade2;
    double grade3;
    double grade4;

    public StudentB( double grade1, double grade2, double grade3, double grade4) {
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.grade4 = grade4;
    }

    double getPrecentage() {
        return (grade1+grade2+grade3+grade4)/4;
    }
}
