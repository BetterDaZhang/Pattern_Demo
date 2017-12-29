package com.example.Decorator.Bean;

/**
 * Created by camdora on 17-12-12.
 */

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 4.5d;
    }
}
