package com.syntax.GroupTasksJava;
//Create an Interface 'Shape' with undefined methods
//as calculateArea and calculatePerimiter. Create 2
//classes Circle & Square that implements functionality
//defined in the Shape Interface. Test your code.
public class Task1AsgarVersion {
    public static void main(String[] args) {
        Square1 square1=new Square1();
        square1.calculatePerimeter(10);
        square1.calculateArea(10);
        Circle1 circle1=new Circle1();
        circle1.calculateArea(20);
        circle1.calculatePerimeter(20);
    }
}
interface Shape1{
    void calculateArea(double input);
    void calculatePerimeter(double input);
}
class Circle1 implements Shape1{

    public void calculateArea(double input) {
        double area=Math.PI*Math.pow(input,2);
        System.out.println(area);
    }
    public void calculatePerimeter(double input) {
        System.out.println(2*Math.PI*input);
    }
}
class Square1 implements Shape1{

    public void calculateArea(double input) {
        double area=input*input;
        System.out.println(area);
    }
    public void calculatePerimeter(double input) {
        double perimeter=4*input;
        System.out.println(perimeter);
    }
}
