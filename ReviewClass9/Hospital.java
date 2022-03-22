package com.syntax.ReviewClass9;

public class Hospital {
    public static void main(String[] args) {
        Doctor doc=new Doctor("Francis","NAganou","Cardio");
        doc.printInfo();
        Doctor doc1=new Doctor("John","Smith");
        doc1.specalty="Dermatologist";
        doc1.printInfo();

        System.out.println("Changing value of static variable");
        //Static variable shoud be accessed static way-->using a class name
        Doctor.hospital="Inova";
        doc.printInfo();
        doc1.printInfo();
        System.out.println("=====================================================");
        doc1.hospital="Best Hospital";
        doc.printInfo();
        doc1.printInfo();
    }
}
