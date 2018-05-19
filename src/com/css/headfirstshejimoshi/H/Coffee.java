package com.css.headfirstshejimoshi.H;

/**
 * Created by 46597 on 2018/5/14.
 */
public class Coffee extends CaffeineBeverage {

    @Override
    protected void addCondiments() {
        System.out.println("Adding Sugar and Milk");

    }

    @Override
    protected void brew() {
        System.out.println("Dripping Coffee through filter");
    }
}
