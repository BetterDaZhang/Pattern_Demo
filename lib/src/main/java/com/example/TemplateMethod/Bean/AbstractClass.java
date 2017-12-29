package com.example.TemplateMethod.Bean;

/**
 * Created by camdora on 17-12-19.
 */

public abstract class AbstractClass {
    public final void templateMethod(){
        primitiveOperation1();
        primitiveOperation1();
        concreteOperation();
        hook();
    }

    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();

    private void concreteOperation() {

    }
    public void hook(){

    }
}
