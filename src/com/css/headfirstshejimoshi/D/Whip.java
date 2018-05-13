package com.css.headfirstshejimoshi.D;

/**
 * Created by 46597 on 2018/5/8.
 */
public class Whip extends CondimentDecorator {
     Berverage berverage;

     public Whip(Berverage berverage){
         this.berverage = berverage;

     }

    @Override
    public String getDescription() {
        return berverage.getDescription() + ",Whip";
    }

    @Override
    public double cost() {
        return .10 + berverage.cost();
    }
}
