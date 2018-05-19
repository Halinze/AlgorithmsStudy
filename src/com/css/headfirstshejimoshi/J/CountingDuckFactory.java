package com.css.headfirstshejimoshi.J;

/**
 * Created by 46597 on 2018/5/19.
 */
public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallarDuck() {
        return new QuackCount(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCount(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCount(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCount(new RubberDuck());
    }
}
