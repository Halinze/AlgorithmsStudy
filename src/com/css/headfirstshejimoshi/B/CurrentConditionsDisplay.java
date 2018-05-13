package com.css.headfirstshejimoshi.B;

/**
 * Created by 46597 on 2018/5/7.
 */
public class CurrentConditionsDisplay implements  Observer , DisplayElement {

    private float temperature;

    private float humidity;

    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        //牛逼！
        weatherData.registerObserver(this);
    }


    @Override
    public void update(float temp, float humidity, float pressure) {

        this.temperature = temp ;
        this.humidity = humidity ;
        display();

    }

    @Override
    public void display() {
        System.out.println("Current conditions : " + temperature + "F degree and " + humidity + " % humidity");
    }
}
