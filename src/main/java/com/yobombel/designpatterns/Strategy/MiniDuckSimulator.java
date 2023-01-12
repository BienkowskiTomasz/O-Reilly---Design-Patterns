package com.yobombel.designpatterns.Strategy;

import com.yobombel.designpatterns.Strategy.flying.FlyWithRocketEngine;

public class MiniDuckSimulator {

    public static void main(String[] args){

        Duck wildDuck = new MallardDuck();
        wildDuck.doQuack();
        wildDuck.doFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.doFly();
        modelDuck.setFlyInterface(new FlyWithRocketEngine());
        modelDuck.doFly();

    }

}
