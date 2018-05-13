package com.css.headfirstshejimoshi.D;

/**
 * Created by 46597 on 2018/5/8.
 * 饮料类
 */
public abstract class Berverage {

    String description = "Unkown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();

}
