package com.syntax.class23;
//Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
//Define common behavior within parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Write example of achieving run time polymorphism
public class HM1 {
}
class Student{
void study(){
    System.out.println("Students must study to pass");
}
void doHomework(){
    System.out.println("Students must do homework");
}
void practice(){
    System.out.println("Student must practice");
}
}
class SyntaxStudent extends Student{
    @Override
   void study(){
       System.out.println("Syntax students must study 25 hours a week");
   }
   @Override
   void doHomework(){
       System.out.println("Syntax students must solve repls");
   }
   void practice(){
       System.out.println("Syntax students must do their own research");
   }
}
class ColledgeStudent extends Student{
void doHomework(){
    System.out.println("Colledge Student can skip some homework ");
}
}
class SchoolStudent extends Student{

}
