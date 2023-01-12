package com.yobombel.designpatterns.Introduction.flying;

public class CantFly implements FlyInterface{

    @Override
    public void fly() {
        System.out.println("I can't fly.");
    }

}