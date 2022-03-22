package com.syntax.class25;

import com.syntax.class19.Car;

public interface MoveAble {
    void move();
}
interface driveAble{
    void drive();
}
interface car extends driveAble, MoveAble{

}
class BMW implements car{

    @Override
    public void move() {
        System.out.println("We can move the BMW");
    }

    @Override
    public void drive() {
        System.out.println("We can drive BMW");
    }
}

