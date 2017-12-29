package com.example.Factory.Demo3.Bean;


import com.example.Factory.Demo3.Interface.Pizza;

/**
 * Created by camdora on 17-12-13.
 */

public class ChicagoSylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        return SimplePizzaFactory.createPizza(type);
    }
}
