package com.css.headfirstshejimoshi.C;

import com.css.headfirstshejimoshi.B.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by 46597 on 2018/5/7.
 */
public class CurrentConditionDisplay implements Observer ,DisplayElement {


    Observable observable;
    private float temperature ;
    private float humidity ;



    public CurrentConditionDisplay(Observable observable){
        this.observable = observable;
        this.observable.addObserver(this);


    }

    @Override
    public void update(Observable o, Object arg) {

        if(o instanceof  WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }


    }


    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }


}
