package com.example.Singleton.Bean;

/**
 * Created by camdora on 17-12-14.
 */

public class Singleton2 {
    private static Singleton2 singleton2 = null;

    private Singleton2(){

    }

    public static Singleton2 getSingleton2(){
        if(singleton2 == null){
            singleton2 = new Singleton2();
        }
        return  singleton2;
    }
}
