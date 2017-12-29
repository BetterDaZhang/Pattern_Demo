package com.example.Strategy.Bean;

import com.example.Strategy.Interface.FlyBehavior;
import com.example.Strategy.Interface.QuackBehavior;

/**
 * Created by camdora on 17-12-7.
 */

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void swim(){
        System.out.println("All Ducks　Can Swim.");
    }

    public void setFlyBehavior(FlyBehavior mFlyBehavior) {
        this.flyBehavior = mFlyBehavior;
    }

    public void setQuackBehavior(QuackBehavior mQuackBehavior) {
        this.quackBehavior = mQuackBehavior;
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void persormQuack(){
        quackBehavior.quack();
    }

    public abstract void display();
}
