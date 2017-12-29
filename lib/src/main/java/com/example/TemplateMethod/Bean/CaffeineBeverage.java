package com.example.TemplateMethod.Bean;

/**
 * Created by camdora on 17-12-19.
 */

public abstract class CaffeineBeverage {
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCoodiments();
    }

    private void boilWater(){

    }

    private void pourInCup(){

    }

    public abstract void brew();
    public abstract void addCoodiments();
}
