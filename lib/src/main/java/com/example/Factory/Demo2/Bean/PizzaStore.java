package com.example.Factory.Demo2.Bean;

import com.example.Factory.Demo2.Interface.Pizza;

/**
 * Created by camdora on 17-12-13.
 */

public class PizzaStore {
    public static Pizza orderPizza(String type) {
        Pizza pizza = null;
        pizza = SimplePizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
