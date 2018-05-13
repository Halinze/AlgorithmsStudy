package com.css.headfirstshejimoshi.D;

/**
 * Created by 46597 on 2018/5/8.
 */
public class Soy extends CondimentDecorator {

    Berverage berverage;

    public Soy(Berverage berverage){
        this.berverage = berverage;
    }

    @Override
    public String getDescription() {
        return berverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return .15 + berverage.cost();
    }
}
