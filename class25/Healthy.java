package com.syntax.class25;

public interface Healthy {
    void Healthy();
}
interface Portable{
    void canCarry();
}
interface Eatable{
    void eat();
}
class Orange implements Healthy, Portable, Eatable{

    @Override
    public void Healthy() {
        System.out.println("Orange is healthy");
    }

    @Override
    public void canCarry() {
        System.out.println("We can carry orang easily");
    }

    @Override
    public void eat() {
        System.out.println("We can eat orange");
    }
}
class Laptop implements Portable{

    @Override
    public void canCarry() {
        System.out.println("We can carry laptop easily");
    }
}
class InterfaceTester{
    public static void main(String[] args) {
        Healthy healthy=new Orange();
    }
}
