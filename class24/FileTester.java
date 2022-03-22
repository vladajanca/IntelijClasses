package com.syntax.class24;

public class FileTester {
    public static void main(String[] args) {
        File[] file={new JavaFile(),new PdfFile(),new WorldFile()};
        //if a method is not present in a parent class we cant call that method usein polimorphisam
        file[0].open();
        for(int i=0;i< file.length;i++){
            file[i].open();
            file[i].close();
            file[i].edit();
        }
        /*JavaFile javafile=new JavaFile();
        javafile.open();
        PdfFile pdffile=new PdfFile();
        pdffile.open();
        WorldFile worldFile=new WorldFile();
        worldFile.open();
        */
    }
}
