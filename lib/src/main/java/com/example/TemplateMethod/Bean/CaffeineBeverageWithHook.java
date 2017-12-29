package com.example.TemplateMethod.Bean;

/**
 * Created by camdora on 17-12-19.
 */

public abstract class CaffeineBeverageWithHook {
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(isWantsCondiments()){
            addCoodiments();
        }
    }
    private void boilWater(){
        System.out.println("Boiling water.");
    }

    private void pourInCup(){
        System.out.println("Pour into cup.");
    }

    public boolean isWantsCondiments(){
        return true;
    }

    public abstract void brew();
    public abstract void addCoodiments();
}
