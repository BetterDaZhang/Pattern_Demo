package com.example.Adapter.Demo1.Bean;

import com.example.Adapter.Demo1.Interface.Duck;

/**
 * Created by camdora on 17-12-18.
 */

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack.");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying.");
    }
}
