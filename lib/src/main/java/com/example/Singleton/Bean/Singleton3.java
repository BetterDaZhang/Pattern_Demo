package com.example.Singleton.Bean;

/**
 * Created by camdora on 17-12-14.
 */

public class Singleton3 {
    private static Singleton3 singleton3 = new Singleton3();

    private Singleton3(){

    }

    public static Singleton3 getSingleton3(){
        return singleton3;
    }

}
