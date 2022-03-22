package com.syntax.class24;

public interface Employee {
    public static final int age=10;
    //by default all variables in an interface are public static final
    void work();

    //All the methods inside an interface which do not have body are abstract and public
}
class Tester implements Employee{

    @Override
    public void work() {

    }

    public static void main(String[] args) {
        Tester tester=new Tester();
        tester.work();
        System.out.println(Employee.age);
    }
}