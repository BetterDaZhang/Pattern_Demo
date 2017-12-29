package com.example.Decorator.Bean;

/**
 * Created by camdora on 17-12-12.
 */

public abstract class Beverage {
    protected String description = "Unknown Beberage";
    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public abstract double cost();
}
