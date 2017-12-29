package com.example.Singleton.Bean;

/**
 * Created by camdora on 17-12-14.
 */

public class Singleton {

    private static Singleton singleton;

    private Singleton() {

    }

    public static  synchronized Singleton  getSingleton(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
