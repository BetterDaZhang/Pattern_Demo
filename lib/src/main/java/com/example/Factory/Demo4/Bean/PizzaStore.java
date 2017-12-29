package com.example.Factory.Demo4.Bean;

import com.example.Factory.Demo4.Bean.Pizza;

/**
 * Created by camdora on 17-12-13.
 */

public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.box();
        pizza.cut();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
