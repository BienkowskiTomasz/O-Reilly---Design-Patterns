package com.yobombel.designpatterns.Strategy.flying;

public class FlyWithWings implements FlyInterface {

    @Override
    public void fly() {
        System.out.println("I fly cause I have wings.");
    }
}
