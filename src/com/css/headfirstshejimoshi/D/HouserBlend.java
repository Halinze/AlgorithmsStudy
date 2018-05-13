package com.css.headfirstshejimoshi.D;

/**
 * Created by 46597 on 2018/5/8.
 * 具体饮料类
 */
public class HouserBlend extends Berverage {

    public HouserBlend(){
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
