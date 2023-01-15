package com.yobombel.designpatterns.Decorator.StarCafe.CoffeeTypes;

public class StarCafeSpecial extends Drink {

    public StarCafeSpecial() {
        description = "Star Cafe Special coffee";
    }

    public double cost() {
        return 4.99;
    }
}
