package com.yobombel.designpatterns.Observer.weather.panels;

import com.yobombel.designpatterns.Observer.weather.WeatherData;
import com.yobombel.designpatterns.Observer.weather.interfaces.InfoPanel;
import com.yobombel.designpatterns.Observer.weather.interfaces.Observer;

import java.util.LinkedList;

public class StatisticsPanel implements Observer, InfoPanel {

    private float minTemperature = 0f;
    private float maxTemperature = 0f;
    private float averageTemperature = 0f;
    private LinkedList<Float> readingsFor30Days;
    private WeatherData weatherData;

    public StatisticsPanel(WeatherData weatherData) {
        readingsFor30Days = new LinkedList<>();
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Temperatures average / max / min = " + averageTemperature + " / " + maxTemperature + " / " + minTemperature);
    }

    @Override
    public void update() {
        float currentTemperature = weatherData.getTemperature();
        minTemperature = Math.min(currentTemperature, minTemperature);
        maxTemperature = Math.max(currentTemperature, maxTemperature);
        updateAverage(currentTemperature);
        display();
    }

    private void updateAverage(float currentTemperature){
        if(readingsFor30Days.size() >= 30) readingsFor30Days.removeFirst();
        readingsFor30Days.add(currentTemperature);
        averageTemperature = readingsFor30Days.stream().reduce(0f, Float::sum) / readingsFor30Days.size();
    }

}
