package com.yobombel.designpatterns.Decorator.StarCafe.CoffeeTypes;

public abstract class Drink {

    String description = "Unknown drink";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    @Override
    public String toString() {
        return this.getDescription() + " $" + this.cost();
    }
}
