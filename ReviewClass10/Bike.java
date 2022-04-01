package com.syntax.ReviewClass10;
//THIS IS A GREAT EXAMPLE OF USING A SUPER KEYWORD IN INHERETANCE!!!
public class Bike {
    int MaxSpeed=100;
    int engineCC=150;
    void printMaxSpeed(){
        System.out.println(MaxSpeed);
    }
    void printEngineCC(){
        System.out.println(engineCC);
    }
}
class HondaBike extends Bike{
    int MaxSpeed=150;
    int engineCC=125;

    void printEngineCC(){
        System.out.println(engineCC);
    }

    void printMaxSpeed(){
        int MaxSpeed=200;
        System.out.println(MaxSpeed);
        System.out.println(this.MaxSpeed);
        System.out.println(super.MaxSpeed);
    }
    void printInfoFromParentAndChild(){
        printEngineCC();
        super.printEngineCC();
    }
}
class Test234{
    public static void main(String[] args) {
        HondaBike hondaBike=new HondaBike();
        hondaBike.printMaxSpeed();
        hondaBike.printInfoFromParentAndChild();
    }
}
