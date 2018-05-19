package com.css.headfirstshejimoshi.G;

import java.util.Random;

/**
 * Created by 46597 on 2018/5/14.
 *
 * 适配器模式！！！
 */
public class DuckAdapter implements Turkey {

    Duck duck;
    Random rand;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        rand = new Random();
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        if (rand.nextInt(5) == 0) {
            duck.fly();
        }
    }
}
