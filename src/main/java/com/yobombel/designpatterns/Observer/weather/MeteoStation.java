package com.yobombel.designpatterns.Observer.weather;

import com.yobombel.designpatterns.Observer.weather.panels.CurrentWeatherPanel;
import com.yobombel.designpatterns.Observer.weather.panels.ForecastPanel;
import com.yobombel.designpatterns.Observer.weather.panels.StatisticsPanel;

public class MeteoStation {

    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentWeatherPanel currentWeatherPanel = new CurrentWeatherPanel(weatherData);
        StatisticsPanel statisticsPanel = new StatisticsPanel(weatherData);
        ForecastPanel forecastPanel = new ForecastPanel(weatherData);

        weatherData.setReadings(26f,65f, 1013.1f);
        weatherData.setReadings(27.7f, 70f, 997.0f);
        weatherData.setReadings(25.5f, 90f, 997.0f);

    }

}
