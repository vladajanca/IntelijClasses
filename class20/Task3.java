package com.syntax.class20;

public class Task3 {
    /*
Write a Java program called Teacher.
Identify features and behaviour of that Class.
Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
that would have it their own features and behaviour. Test all 4 classes
 */
    public static void main(String[] args) {
        MathProfessor mathProfessor= new MathProfessor();
        mathProfessor.name="Vladimir";
        mathProfessor.teachBiology();
    }
}
class Profesor{
    String name;
    int age;
    double weight;
    void printName(){
        System.out.println(name);
    }
}
class MathProfessor extends Profesor{
    boolean canTeachTrigonometry=true;
    void teachBiology(){
        System.out.println("Teaching Biology");
    }
}
class ChemistryProfessor extends Profesor{
    boolean canTeachFormulas=true;
    void teachChemistry(){
        System.out.println("Teaching Chemistry");
    }
}
class PianoProfessor extends Profesor{
    void teachPiano(){
        System.out.println("Teaching Piano");
    }
}
