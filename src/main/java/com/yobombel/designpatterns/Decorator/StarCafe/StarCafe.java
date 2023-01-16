package com.yobombel.designpatterns.Decorator.StarCafe;

import com.yobombel.designpatterns.Decorator.StarCafe.CoffeeTypes.Drink;
import com.yobombel.designpatterns.Decorator.StarCafe.CoffeeTypes.Espresso;
import com.yobombel.designpatterns.Decorator.StarCafe.CoffeeTypes.HeavyRoast;
import com.yobombel.designpatterns.Decorator.StarCafe.CoffeeTypes.StarCafeSpecial;
import com.yobombel.designpatterns.Decorator.StarCafe.Decorators.Chocolate;
import com.yobombel.designpatterns.Decorator.StarCafe.Decorators.SoyMilk;
import com.yobombel.designpatterns.Decorator.StarCafe.Decorators.WhippedCream;

public class StarCafe {

    public static void main(String[] args){

        Drink drink = new Espresso();
        System.out.println(drink);

        Drink drink2 = new HeavyRoast();
        drink2 = new Chocolate(drink2);
        drink2 = new Chocolate(drink2);
        drink2 = new WhippedCream(drink2);
        System.out.println(drink2);

        Drink drink3 = new StarCafeSpecial();
        drink3.setSize(Drink.Size.LARGE);
        drink3 = new SoyMilk(drink3);
        drink3 = new Chocolate(drink3);
        drink3 = new WhippedCream(drink3);
        System.out.println(drink3);

    }

}
