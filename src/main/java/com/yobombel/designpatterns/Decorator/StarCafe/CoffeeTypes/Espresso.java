package com.yobombel.designpatterns.Decorator.StarCafe.CoffeeTypes;

public class Espresso extends Drink {

    public Espresso() {
        description = "Espresso coffee";
    }

    public double cost() {
        return 6.49;
    }
}
