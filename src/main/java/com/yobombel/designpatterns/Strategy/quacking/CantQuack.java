package com.yobombel.designpatterns.Strategy.quacking;

public class CantQuack implements QuackInterface{

    @Override
    public void quack() {
        System.out.println("<<SILENCE>>");
    }
}
