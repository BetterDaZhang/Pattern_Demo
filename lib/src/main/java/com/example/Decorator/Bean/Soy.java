package com.example.Decorator.Bean;

/**
 * Created by camdora on 17-12-12.
 */

public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 51.2d;
    }
}
