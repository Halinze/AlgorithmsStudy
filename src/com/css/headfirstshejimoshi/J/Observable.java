package com.css.headfirstshejimoshi.J;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by 46597 on 2018/5/24.
 */
public class Observable implements QuackObservable {


    ArrayList observers = new ArrayList();

    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer) iterator.next();
            observer.update(duck);
        }
    }
}
