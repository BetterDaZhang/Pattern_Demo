package com.example;

import com.example.Adapter.Demo1.Mode.AdapterMode;
import com.example.Command.Demo1.Mode.Client;
import com.example.Decorator.Mode.DecoratorMode;
import com.example.Observer.Mode.ObserverMode;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class MyClass {

    public static void main(String[] args) throws IOException {
//        StrategyMode.strategyPlatform();
//        ObserverMode.observerPlatform();
//        DecoratorMode.decoratorModePlatform();
//        Client.clientPlatform();

//        AdapterMode.adapterPlatform();
//        HttpUtils.method1();
//        HttpUtils.method2();

        ScheduledThreadPoolExecutor scheduledExecutor = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(1);

//        scheduledExecutor.shutdownNow();
        scheduledExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("zhangjunling");
            }
        });

//        scheduledExecutor.shutdownNow();

    }
}
