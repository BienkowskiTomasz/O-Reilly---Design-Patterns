package com.yobombel.designpatterns.Decorator.StarCafe.CoffeeTypes;

import com.yobombel.designpatterns.Decorator.StarCafe.Drink;

public class StarCafeSpecial extends Drink {

    @Override
    public double cost() {
        return 0;
    }
}
