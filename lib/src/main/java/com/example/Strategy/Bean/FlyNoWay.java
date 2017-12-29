package com.example.Strategy.Bean;

import com.example.Strategy.Interface.FlyBehavior;

/**
 * Created by camdora on 17-12-7.
 */

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly.");
    }
}
