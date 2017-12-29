package com.example.Observer.Bean;

import com.example.Observer.Interface.Observer;
import com.example.Observer.Interface.Subject;

import java.util.ArrayList;

/**
 * Created by camdora on 17-12-8.
 */

public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(temperature, humidity, pressure);
        }
    }

    private void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasureMents(float temp, float humidity, float pressure){
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
