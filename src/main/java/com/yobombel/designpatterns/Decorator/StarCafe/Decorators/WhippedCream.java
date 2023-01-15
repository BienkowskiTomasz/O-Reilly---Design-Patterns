package com.yobombel.designpatterns.Decorator.StarCafe.Decorators;

public class WhippedCream extends IngredientDecorator{

    @Override
    public String getDescription() {
        return "+ whipped cream";
    }

    @Override
    public double cost() {
        return 0.75;
    }
}
