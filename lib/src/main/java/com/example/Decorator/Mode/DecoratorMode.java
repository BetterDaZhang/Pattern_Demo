package com.example.Decorator.Mode;

import com.example.Decorator.Bean.Beverage;
import com.example.Decorator.Bean.Espresso;
import com.example.Decorator.Bean.HouseBlend;
import com.example.Decorator.Bean.Mocha;
import com.example.Decorator.Bean.Soy;

/**
 * Created by camdora on 17-12-12.
 */

public class DecoratorMode {
    public static void decoratorModePlatform(){
        //订一杯Espresso咖啡,不添加任何调料
        Beverage beverage1 = new Espresso();
        System.out.println("Espresso　Cost:" + beverage1.cost());

        //最后来一杯调料为豆浆/摩卡的HouseBlend咖啡
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println("Soy/Mocha HouseBlend　Coffee Cost:" + beverage2.cost());
        System.out.println("Description:" + beverage2.getDescription());

    }
}
