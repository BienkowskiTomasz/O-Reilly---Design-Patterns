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
        double cost = drink.cost();
        Size size = drink.getSize();

        if (size == Size.SMALL) cost += .10;
        else if (size == Size.MEDIUM) cost += .20;
        else if (size == Size.LARGE) cost += .30;

        return cost;

    }
}
