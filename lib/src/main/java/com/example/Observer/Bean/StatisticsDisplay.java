package com.example.Observer.Bean;

import com.example.Observer.Interface.DisplayElement;
import com.example.Observer.Interface.Observer;
import com.example.Observer.Interface.Subject;

/**
 * Created by camdora on 17-12-8.
 */

public class StatisticsDisplay implements Observer,DisplayElement {

    private Subject weatherData;
    private float temperature;
    private float humidity;
    private float pressure;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Statistics Conditions:\n" +
                "temperature:" + temperature + "\n" +
                "humidity:" + humidity + "\n" +
                "pressure:" + pressure+"\n");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
