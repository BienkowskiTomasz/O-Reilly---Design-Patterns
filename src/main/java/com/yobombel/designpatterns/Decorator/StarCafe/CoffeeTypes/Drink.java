package com.yobombel.designpatterns.Decorator.StarCafe.CoffeeTypes;

import java.util.Locale;

public abstract class Drink {

    public enum Size { SMALL, MEDIUM, LARGE};
    Size size = Size.SMALL;

    String description = "Unknown drink";

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();

    @Override
    public String toString() {
        return getSize() + " " + this.getDescription() + " $" + this.cost();
    }
}
