package com.yobombel.designpatterns.Decorator.StarCafe.Decorators;

import com.yobombel.designpatterns.Decorator.StarCafe.CoffeeTypes.Drink;

public class SoyMilk extends IngredientDecorator {

    public SoyMilk(Drink drink) {
        this.drink = drink;
    }

    public String getDescription() {
        return drink.getDescription() + ", soy milk";
    }

    public double cost() {
        return drink.cost() + 0.55;
    }
}
