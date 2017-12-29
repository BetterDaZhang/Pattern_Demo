package com.example.Factory.Demo4.Bean;

import com.example.Factory.Demo4.Interface.Cheese;
import com.example.Factory.Demo4.Interface.Clams;
import com.example.Factory.Demo4.Interface.Dough;
import com.example.Factory.Demo4.Interface.Pepperoni;
import com.example.Factory.Demo4.Interface.PizzaIngredientFactory;
import com.example.Factory.Demo4.Interface.Sauce;
import com.example.Factory.Demo4.Interface.Veggles;

/**
 * Created by camdora on 17-12-13.
 */

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggles[] veggles;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    PizzaIngredientFactory pizzaIngredientFactory;

    public Pizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void bake(){

    }

    public void box(){

    }

    public void cut(){

    }

    public abstract void prepare();
}
