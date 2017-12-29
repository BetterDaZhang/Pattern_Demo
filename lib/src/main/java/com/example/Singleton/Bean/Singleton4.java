package com.example.Singleton.Bean;

/**
 * Created by camdora on 17-12-14.
 */

public class Singleton4 {
    private volatile static Singleton4 singleton4;

    private Singleton4(){

    }

    public static Singleton4 getSingleton4(){
        if(singleton4 == null){
            synchronized (Singleton4.class){
                if(singleton4 == null){
                    singleton4 = new Singleton4();
                }
            }
        }
        return singleton4;
    }
}
