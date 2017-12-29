package com.example.Factory.Demo4.Bean;


import com.example.Factory.Demo4.Interface.PizzaIngredientFactory;

/**
 * Created by camdora on 17-12-13.
 */

public class SimplePizzaFactory {
    public static Pizza createPizza(String type){
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
        } else if (type.equals("greek")){
            pizza = new GreekPizza(pizzaIngredientFactory);
        }else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza(pizzaIngredientFactory);
        }
        return  pizza;
    }
}
