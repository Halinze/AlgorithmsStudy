package com.css.headfirstshejimoshi.F;

/**
 * Created by 46597 on 2018/5/13.
 */
public class CellingFan {

    public static final int HIGH = 3;

    public static final int MEDIUM = 2;

    public static final int LOW = 1;

    public static final int OFF = 0;

    private String name;

    int speed ;


    public CellingFan(String name) {
        this.name = name;
        speed = OFF ;
    }

    public void high() {
        speed = HIGH;
        System.out.println("Living Room celling fan is on high !");
    }



    public void medium() {
        speed = MEDIUM;
        System.out.println("Living Room celling fan is on medium !");
    }

    public void low(){
        speed = LOW ;
        System.out.println("Living Room celling fan is on low !");
    }

    public void off() {
        speed = OFF;
        System.out.println("Living Room celling fan is off");
    }

    public int getSpeed() {
        return speed;
    }

}
