package com.yobombel.designpatterns.Strategy;

import com.yobombel.designpatterns.Strategy.flying.FlyWithWings;
import com.yobombel.designpatterns.Strategy.quacking.Quack;

//Kaczka Krzyżówka
public class MallardDuck  extends Duck {

    public MallardDuck() {
        quackInterface = new Quack();
        flyInterface = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a true mallard duck.");
    }
}
