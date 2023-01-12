package com.yobombel.designpatterns.Introduction.quacking;

public class CantQuack implements QuackInterface{

    @Override
    public void quack() {
        System.out.println("<<SILENCE>>");
    }
}
