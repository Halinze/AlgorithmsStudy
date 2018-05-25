package com.css.headfirstshejimoshi.J;

/**
 * Created by 46597 on 2018/5/19.
 */
public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
