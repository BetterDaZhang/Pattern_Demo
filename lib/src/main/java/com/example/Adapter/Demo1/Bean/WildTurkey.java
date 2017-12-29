package com.example.Adapter.Demo1.Bean;

import com.example.Adapter.Demo1.Interface.Turkey;

/**
 * Created by camdora on 17-12-18.
 */

public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("gobble.");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance.");
    }
}
