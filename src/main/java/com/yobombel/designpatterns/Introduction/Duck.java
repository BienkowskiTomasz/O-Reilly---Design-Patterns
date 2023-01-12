package com.yobombel.designpatterns.Introduction;

import com.yobombel.designpatterns.Introduction.flying.FlyInterface;
import com.yobombel.designpatterns.Introduction.quacking.QuackInterface;

public abstract class Duck {

    FlyInterface flyInterface;
    QuackInterface quackInterface;

    public Duck() {
    }

    public abstract void display();

    public void doFly(){
        flyInterface.fly();
    }

    public void doQuack(){
        quackInterface.quack();
    }

    public void swim(){
        System.out.println("All ducks swim, even rubber ones.");
    }

}
