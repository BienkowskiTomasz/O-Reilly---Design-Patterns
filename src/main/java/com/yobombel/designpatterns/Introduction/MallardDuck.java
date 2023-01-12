package com.yobombel.designpatterns.Introduction;

import com.yobombel.designpatterns.Introduction.flying.FlyWithWings;
import com.yobombel.designpatterns.Introduction.quacking.Quack;

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
