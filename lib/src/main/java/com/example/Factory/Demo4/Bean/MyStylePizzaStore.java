package com.example.Factory.Demo4.Bean;



/**
 * Created by camdora on 17-12-13.
 */

public class MyStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        return SimplePizzaFactory.createPizza(type);
    }
}
