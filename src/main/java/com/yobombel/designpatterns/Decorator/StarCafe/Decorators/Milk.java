package com.yobombel.designpatterns.Decorator.StarCafe.Decorators;

public class Milk extends IngredientDecorator{

    @Override
    public String getDescription() {
        return "Milk";
    }

    @Override
    public double cost() {
        return 0.5;
    }
}
