package com.css.headfirstshejimoshi.J;

/**
 * Created by 46597 on 2018/5/24.
 */
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}
