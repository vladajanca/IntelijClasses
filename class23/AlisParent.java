package com.syntax.class23;

public class AlisParent {
    String  girlName="Salma";
    double money=1000000;
    void marry(){
        System.out.println("Ali shoud marry "+girlName);
    }
}
class Ali extends AlisParent{
    String girlName="Rihhana";

    void marry(){
        super.marry();
        System.out.println("But dad I want to marry "+girlName);

    }
}
