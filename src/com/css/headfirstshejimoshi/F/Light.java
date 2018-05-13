package com.css.headfirstshejimoshi.F;

/**
 * Created by 46597 on 2018/5/13.
 */
public class Light {

    private String name ;

    public Light(String name){
        this.name = name ;
    }

    public void on() {
        System.out.println("Light is on !");
    }

    public void off() {
        System.out.println("Light is off !");
    }
}
