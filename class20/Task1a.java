package com.syntax.class20;

public class Task1a {
    /*
    Write program for multilevel inheritance where class C inherits
    from class B and Class B inherits from Class A.
     */
    int num;
    double price;
    String name="Asqar";
}
class Task1b extends Task1a{

}
class Task1c extends Task1b {


    public static void main(String[] args) {
        Task1c task1c = new Task1c();
        System.out.println(task1c.name);
        task1c.name="";
    }
}
