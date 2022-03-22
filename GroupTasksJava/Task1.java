package com.syntax.GroupTasksJava;
//Create an Interface 'Shape' with undefined methods
//as calculateArea and calculatePerimiter. Create 2
//classes Circle & Square that implements functionality
//defined in the Shape Interface. Test your code.
public class Task1 {
    public static void main(String[] args) {
        Shape circle= new Circle();
        Shape square=new Square();

        System.out.println(circle.calculateArea(5.5));
        System.out.println(circle.calculatePerimeter(5.5));
        System.out.println(square.calculateArea(6.7));
        System.out.println(square.calculatePerimeter(6.7));
    }
}
interface Shape{
    double pi=3.14;
    double calculateArea(double x);
    double calculatePerimeter(double x);
}
class Circle implements Shape{

    public double calculateArea(double x) {
        return pi*x*x;
    }
    public double calculatePerimeter(double x) {
        return 2*x*pi;
    }
}
class Square implements Shape{

    public double calculateArea(double x) {
        return x*x;
    }
    public double calculatePerimeter(double x) {
        return 4*x;
    }
}
