package com.example.Adapter.Demo1.Adapter;

import com.example.Adapter.Demo1.Interface.Duck;
import com.example.Adapter.Demo1.Interface.Turkey;

/**
 * Created by camdora on 17-12-18.
 */

public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
