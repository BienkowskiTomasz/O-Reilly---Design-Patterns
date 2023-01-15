package com.yobombel.designpatterns.Decorator.StarCafe.Decorators;

import com.yobombel.designpatterns.Decorator.StarCafe.Drink;

public abstract class IngredientDecorator extends Drink {

    public Drink drink;
    public abstract String getDescription();

}
