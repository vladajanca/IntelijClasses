package com.syntax.class24;
//Create a class File that will have the following behaviors: open, edit, close.
//Edit and close are implemented method while open is an abstract.
//Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide
//specific implementation of open behaviour: Example:
//to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
public abstract class File {
    abstract void open();
    void edit(){
        System.out.println("Edit class");
    }
    void close(){
        System.out.println("Close class");
    }
}
class JavaFile extends File{
    void open(){
        System.out.println("In order to open Java File we need notpad++");
    }
}
class WorldFile extends File{
    void open(){
        System.out.println("In order to opne a world file we need Microsoft office to be instaled");
    }
}
class PdfFile extends File{
    void open(){
        System.out.println("Im order to open PDF file we need Adoby instaled");
    }
}
