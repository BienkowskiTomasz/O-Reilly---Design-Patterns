package com.yobombel.designpatterns.Decorator.StarCafe.CoffeeTypes;

public class Decaffeinated extends Drink {

    public Decaffeinated() {
        description = "Decaffeinated coffee";
    }

    @Override
    public double cost() {
        return 5.0;
    }
}
