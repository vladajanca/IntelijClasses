package com.syntax.class28;

import java.util.LinkedList;

public class ListDemo4 {
    public static void main(String[] args) {
        Student student=new Student("Teyfur",20,"Memes");
        Student student1=new Student("Mr.A",22,"Study");
        Student student2=new Student("Emilia",21,"Coding");

        LinkedList<Student> studentLinkList=new LinkedList<>();
        studentLinkList.add(student);
        studentLinkList.add(student1);
        studentLinkList.add(student2);
        System.out.println(studentLinkList);
    }
}
class Student{
    String name;
    int age;
    String hobbies;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies='" + hobbies + '\'' +
                '}';
    }

    public Student(String name, int age, String hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;

    }
}
