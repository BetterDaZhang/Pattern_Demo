package com.example.Strategy.Bean;

import com.example.Strategy.Interface.FlyBehavior;

/**
 * Created by camdora on 17-12-7.
 */

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying with wings.");
    }
}
