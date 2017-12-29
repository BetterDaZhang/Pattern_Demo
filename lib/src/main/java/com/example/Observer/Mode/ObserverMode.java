package com.example.Observer.Mode;

import com.example.Observer.Bean.CurrentConditionsDisplay;
import com.example.Observer.Bean.StatisticsDisplay;
import com.example.Observer.Bean.WeatherData;

/**
 * Created by camdora on 17-12-8.
 */

public class ObserverMode {
    public static void observerPlatform(){
        WeatherData weatherData = new WeatherData();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasureMents(24.0f,25.0f,26.0f);
    }
}
