package com.example.Factory.Demo3.Bean;

import com.example.Factory.Demo3.Interface.Pizza;

/**
 * Created by camdora on 17-12-13.
 */

public class SimplePizzaFactory {
    public static Pizza createPizza(String type){
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")){
            pizza = new GreekPizza();
        }else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }
        return  pizza;
    }
}
