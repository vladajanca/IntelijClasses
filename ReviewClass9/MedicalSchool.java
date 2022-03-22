package com.syntax.ReviewClass9;

public class MedicalSchool {
    public static void main(String[] args) {
        //I want to test accessability
        Doctor doc=new Doctor("Asel","Kiatova","Dermatologist");

        doc.printInfo();//publiv method
        doc.work();//protected method
        doc.hello();//default
        //doc.getPaid();// private method is not available

        System.out.println(doc.firstName);
        System.out.println(doc.lastName);
        System.out.println(doc.specalty);
        //System.out.println(doc.salary);//private method not available

    }
}
