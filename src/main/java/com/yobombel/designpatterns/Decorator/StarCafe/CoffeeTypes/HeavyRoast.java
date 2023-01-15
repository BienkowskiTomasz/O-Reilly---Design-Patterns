package com.yobombel.designpatterns.Decorator.StarCafe.CoffeeTypes;

public class HeavyRoast extends Drink {

    public HeavyRoast() {
        description = "Heavy roast coffee";
    }

    @Override
    public double cost() {
        return 4;
    }
}
