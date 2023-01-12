package com.yobombel.designpatterns.Strategy.quacking;

public class Squeak implements QuackInterface{

    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
