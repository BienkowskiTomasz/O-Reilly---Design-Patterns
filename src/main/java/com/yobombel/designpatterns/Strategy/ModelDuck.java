package com.yobombel.designpatterns.Strategy;

import com.yobombel.designpatterns.Strategy.flying.CantFly;
import com.yobombel.designpatterns.Strategy.quacking.Quack;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyInterface = new CantFly();
        quackInterface = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck.");
    }
}
