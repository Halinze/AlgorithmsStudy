package com.css.headfirstshejimoshi.H;

/**
 * Created by 46597 on 2018/5/14.
 */
public class Tea extends CaffeineBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    protected void brew() {

        System.out.println("Steeping the tea");
    }
}
