package com.yobombel.designpatterns.Observer.weather.panels;

import com.yobombel.designpatterns.Observer.weather.WeatherData;
import com.yobombel.designpatterns.Observer.weather.interfaces.InfoPanel;
import com.yobombel.designpatterns.Observer.weather.interfaces.Observer;

public class ForecastPanel implements Observer, InfoPanel {

    private float currentPressure = 1010.1f;
    private float previousPressure;
    private WeatherData weatherData;

    public ForecastPanel(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    public void update() {
        previousPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }

    public void display() {
        int weatherPrediction = Float.compare(currentPressure, previousPressure);

        switch (weatherPrediction) {
            case (0) -> System.out.println("Weather will stay the same.");
            case (1) -> System.out.println("Weather will get better.");
            case (-1) -> System.out.println("Weather will get worse.");
        }

    }

}
