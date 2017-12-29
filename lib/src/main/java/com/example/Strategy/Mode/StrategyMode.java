package com.example.Strategy.Mode;

import com.example.Strategy.Bean.ModuleDuck;
import com.example.Strategy.Interface.FlyBehavior;
import com.example.Strategy.Interface.QuackBehavior;

/**
 * Created by camdora on 17-12-8.
 */

public class StrategyMode {
    public static void strategyPlatform(){
        ModuleDuck moduleDuck = new ModuleDuck();
        moduleDuck.setFlyBehavior(new FlyBehavior() {
            @Override
            public void fly() {
                System.out.println("我不会飞...");
            }
        });

        moduleDuck.setQuackBehavior(new QuackBehavior() {
            @Override
            public void quack() {
                System.out.println("我不会叫...");
            }
        });
        moduleDuck.display();
    }
}
