package com.example.Factory.Demo4.Bean;


import com.example.Factory.Demo4.Interface.PizzaIngredientFactory;

/**
 * Created by camdora on 17-12-13.
 */

public class PepperoniPizza extends Pizza {


    public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        super(pizzaIngredientFactory);
    }

    public void prepare() {
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }

    public void bake() {

    }

    public void cut() {

    }

    public void box() {

    }
}
