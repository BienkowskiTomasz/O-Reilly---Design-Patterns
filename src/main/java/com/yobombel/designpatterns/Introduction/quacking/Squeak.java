package com.yobombel.designpatterns.Introduction.quacking;

public class Squeak implements QuackInterface{

    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
