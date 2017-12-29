package com.example.Factory.Demo4.Interface;

/**
 * Created by camdora on 17-12-13.
 */

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggles[] createVeggles();
    public Pepperoni createPepperoni();
    public Clams createClams();
}
