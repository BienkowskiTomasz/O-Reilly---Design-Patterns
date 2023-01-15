package com.yobombel.designpatterns.Decorator.StarCafe.CoffeeTypes;

public class Espresso extends Drink {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 3.75;
    }
}
