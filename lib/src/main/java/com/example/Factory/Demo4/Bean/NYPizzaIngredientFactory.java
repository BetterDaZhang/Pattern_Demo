package com.example.Factory.Demo4.Bean;

import com.example.Factory.Demo4.Interface.Cheese;
import com.example.Factory.Demo4.Interface.Clams;
import com.example.Factory.Demo4.Interface.Dough;
import com.example.Factory.Demo4.Interface.Pepperoni;
import com.example.Factory.Demo4.Interface.PizzaIngredientFactory;
import com.example.Factory.Demo4.Interface.Sauce;
import com.example.Factory.Demo4.Interface.Veggles;

/**
 * Created by camdora on 17-12-14.
 */

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public NYPizzaIngredientFactory() {
    }

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggles[] createVeggles() {
        return new Veggles[]{new Garlic(),new Onion(),new Mushroom()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
