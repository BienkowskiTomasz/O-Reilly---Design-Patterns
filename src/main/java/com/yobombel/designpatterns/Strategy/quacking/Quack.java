package com.yobombel.designpatterns.Strategy.quacking;

public class Quack implements QuackInterface{

    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
