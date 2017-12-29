package com.example.Factory.Demo4.Bean;


import com.example.Factory.Demo4.Interface.PizzaIngredientFactory;

/**
 * Created by camdora on 17-12-13.
 */

public class CheesePizza extends Pizza {

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        super(pizzaIngredientFactory);
    }

    public void prepare() {

    }

    public void bake() {

    }

    public void cut() {

    }

    public void box() {

    }

}
