package com.example.Strategy.Bean;

import com.example.Strategy.Interface.QuackBehavior;

/**
 * Created by camdora on 17-12-7.
 */

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
