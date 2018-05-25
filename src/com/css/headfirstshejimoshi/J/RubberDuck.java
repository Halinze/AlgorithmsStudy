package com.css.headfirstshejimoshi.J;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by 46597 on 2018/5/19.
 */
public class RubberDuck implements Quackable {

    QuackObservable observable;

    public RubberDuck(){
        observable = new Observable(this);
    }



    @Override
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
