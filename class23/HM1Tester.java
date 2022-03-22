package com.syntax.class23;

public class HM1Tester {
    public static void main(String[] args) {
        Student syntaxStudent = new SyntaxStudent();
        Student schoolStudent = new SchoolStudent();
        //as we can store the object of a child class in parent class
        //we can also create an array of these students as show below
        Student[] students={ new SyntaxStudent(),new SchoolStudent(),new ColledgeStudent()};
        for(Student student:students){
            //calling the methods from all the children classes
            student.study();
            student.doHomework();
            student.practice();
        }

    }
}
