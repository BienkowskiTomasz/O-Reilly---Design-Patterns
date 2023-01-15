package com.yobombel.designpatterns.Decorator.StarCafe.CoffeeTypes;

public class StarCafeSpecial extends Drink {

    public StarCafeSpecial() {
        description = "Star Cafe Special coffee";
    }

    @Override
    public double cost() {
        return 5;
    }
}
