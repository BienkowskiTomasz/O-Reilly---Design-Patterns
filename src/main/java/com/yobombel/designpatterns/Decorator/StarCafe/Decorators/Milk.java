package com.yobombel.designpatterns.Decorator.StarCafe.Decorators;

import com.yobombel.designpatterns.Decorator.StarCafe.CoffeeTypes.Drink;

public class Milk extends IngredientDecorator{

    public Milk(Drink drink) {
        this.drink = drink;
    }

    public String getDescription() {
        return drink.getDescription() + ", milk";
    }

    public double cost() {
        return drink.cost() + 0.45;
    }
}
