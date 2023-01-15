package com.yobombel.designpatterns.Decorator.StarCafe.Decorators;

public class Milk extends IngredientDecorator{

    @Override
    public String getDescription() {
        return "+ milk";
    }

    @Override
    public double cost() {
        return 0.5;
    }
}
