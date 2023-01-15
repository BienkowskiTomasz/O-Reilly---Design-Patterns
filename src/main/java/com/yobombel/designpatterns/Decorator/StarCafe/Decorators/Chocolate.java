package com.yobombel.designpatterns.Decorator.StarCafe.Decorators;

import com.yobombel.designpatterns.Decorator.StarCafe.CoffeeTypes.Drink;

public class Chocolate extends IngredientDecorator{

    public Chocolate(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", chocolate";
    }

    @Override
    public double cost() {
        return drink.cost() + 1.10;
    }
}
