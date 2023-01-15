package com.yobombel.designpatterns.Decorator.StarCafe.Decorators;

import com.yobombel.designpatterns.Decorator.StarCafe.CoffeeTypes.Drink;

public class WhippedCream extends IngredientDecorator {

    public WhippedCream(Drink drink) {
        this.drink = drink;
    }

    public String getDescription() {
        return drink.getDescription() + ", whipped cream";
    }

    public double cost() {
        return drink.cost() + 0.69;
    }
}
