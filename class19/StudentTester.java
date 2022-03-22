package com.syntax.class19;

public class StudentTester {
    public static void main(String[] args) {
        Student student1=new Student("Vladimir",78,89,96);
        Student student2=new Student("Lyes",65,78,87);
        Student student3=new Student("Elena",74,72,99);
        Student student4=new Student("Sayed",33,66,88);
        Student student5=new Student("Mujeeb",99,77,55);
        student1.average();
        student2.average();
        student3.average();
        student4.average();
        student5.average();
    }
}
