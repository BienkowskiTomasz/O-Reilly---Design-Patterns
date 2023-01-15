package com.yobombel.designpatterns.Decorator.StarCafe;

public abstract class Drink {

    String description = "Unknown drink";

    public String getDescription() {
        return description;
    }

    public abstract double cost();


}
