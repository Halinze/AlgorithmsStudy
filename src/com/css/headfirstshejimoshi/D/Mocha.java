package com.css.headfirstshejimoshi.D;

/**
 * Created by 46597 on 2018/5/8.
 * 具体调料
 */
public class Mocha extends CondimentDecorator {

    Berverage berverage;

    public Mocha(Berverage berverage){
        this.berverage = berverage;
    }

    @Override
    public String getDescription() {
        return berverage.getDescription() + ",Mocha";
    }

    @Override
    public double cost() {
        return .20 + berverage.cost() ;
    }
}
