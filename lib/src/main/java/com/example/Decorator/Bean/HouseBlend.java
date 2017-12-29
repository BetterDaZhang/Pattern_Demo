package com.example.Decorator.Bean;

/**
 * Created by camdora on 17-12-12.
 */

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = " HouseBlend";
    }

    @Override
    public double cost() {
        return 4.5d;
    }
}
