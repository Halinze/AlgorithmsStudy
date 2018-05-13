package com.css.headfirstshejimoshi.D;

/**
 * Created by 46597 on 2018/5/8.
 * 具体饮料类
 */
public class Espresso extends Berverage {

    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
