package com.example.Factory.Demo1.Bean;

import com.example.Factory.Demo1.Interface.Pizza;

/**
 * Created by camdora on 17-12-13.
 */

public class PizzaStore {
    public static Pizza orderPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")){
            pizza = new GreekPizza();
        }else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
