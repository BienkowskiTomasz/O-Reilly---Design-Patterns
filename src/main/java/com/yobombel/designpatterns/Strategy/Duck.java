package com.yobombel.designpatterns.Strategy;

import com.yobombel.designpatterns.Strategy.flying.FlyInterface;
import com.yobombel.designpatterns.Strategy.quacking.QuackInterface;

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

    public void setFlyInterface(FlyInterface flyInterface) {
        this.flyInterface = flyInterface;
    }

    public void setQuackInterface(QuackInterface quackInterface) {
        this.quackInterface = quackInterface;
    }
}
