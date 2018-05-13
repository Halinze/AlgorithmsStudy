package com.css.headfirstshejimoshi.C;

import com.css.headfirstshejimoshi.B.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by 46597 on 2018/5/8.
 */
public class ForecastDisplay implements Observer ,DisplayElement {

    private  Observable observable;

    private  float currentPressure = 29.2f ;

    private float lastPressure ;

    public ForecastDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {


    }

    @Override
    public void update(Observable o, Object arg) {
        if( o instanceof  WeatherData){
            lastPressure = currentPressure ;
            currentPressure = ((WeatherData) o).getPressure();
        }
        display();
    }
}
