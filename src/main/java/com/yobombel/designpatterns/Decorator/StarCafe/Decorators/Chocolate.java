package com.yobombel.designpatterns.Decorator.StarCafe.Decorators;

public class Chocolate extends IngredientDecorator{

    @Override
    public String getDescription() {
        return "Chocolate";
    }

    @Override
    public double cost() {
        return 1.0;
    }
}
