package com.yobombel.designpatterns.Observer.weather.panels;

import com.yobombel.designpatterns.Observer.weather.WeatherData;
import com.yobombel.designpatterns.Observer.weather.interfaces.InfoPanel;
import com.yobombel.designpatterns.Observer.weather.interfaces.Observer;

public class CurrentWeatherPanel implements Observer, InfoPanel {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentWeatherPanel(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("Current weather: " + temperature + "C, humidity: " + humidity + "%.");
    }

}
