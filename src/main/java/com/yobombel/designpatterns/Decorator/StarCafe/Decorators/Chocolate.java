package com.yobombel.designpatterns.Decorator.StarCafe.Decorators;

public class Chocolate extends IngredientDecorator{

    @Override
    public String getDescription() {
        return "+ chocolate";
    }

    @Override
    public double cost() {
        return 1.0;
    }
}
