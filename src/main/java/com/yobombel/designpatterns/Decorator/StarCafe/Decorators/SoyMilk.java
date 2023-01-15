package com.yobombel.designpatterns.Decorator.StarCafe.Decorators;

public class SoyMilk extends IngredientDecorator{

    @Override
    public String getDescription() {
        return "soy milk";
    }

    @Override
    public double cost() {
        return 1.25;
    }
}
