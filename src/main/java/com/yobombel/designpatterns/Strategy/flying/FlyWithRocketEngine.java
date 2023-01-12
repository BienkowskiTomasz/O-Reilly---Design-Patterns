package com.yobombel.designpatterns.Strategy.flying;

public class FlyWithRocketEngine implements FlyInterface {

    @Override
    public void fly() {
        System.out.println("Raketu!");
    }
}
