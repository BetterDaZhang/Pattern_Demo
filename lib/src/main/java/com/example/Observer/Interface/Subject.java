package com.example.Observer.Interface;

/**
 * Created by camdora on 17-12-8.
 */

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
}
