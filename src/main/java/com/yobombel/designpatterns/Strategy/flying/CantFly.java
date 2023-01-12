package com.yobombel.designpatterns.Strategy.flying;

public class CantFly implements FlyInterface{

    @Override
    public void fly() {
        System.out.println("I can't fly.");
    }

}