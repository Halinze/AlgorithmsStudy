package com.css.headfirstshejimoshi.B;

/**
 * Created by 46597 on 2018/5/7.
 */
public class WeatherStation {


    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurments(80,65,30.4f);
        weatherData.setMeasurments(82,70,29.2f);
        weatherData.setMeasurments(78,90,29.2f);

    }
}
