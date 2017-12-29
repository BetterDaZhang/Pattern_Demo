package com.example.Strategy.Bean;

import com.example.Strategy.Bean.Duck;

/**
 * Created by camdora on 17-12-7.
 */

public class ModuleDuck extends Duck {

    public ModuleDuck() {
//        flyBehavior = new FlyNoWay();
//        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        swim();
        performFly();
        persormQuack();
    }
}
