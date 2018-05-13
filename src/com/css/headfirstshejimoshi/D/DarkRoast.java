package com.css.headfirstshejimoshi.D;

/**
 * Created by 46597 on 2018/5/8.
 * 具体饮料类
 */
public class DarkRoast extends Berverage {

    public DarkRoast(){
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
