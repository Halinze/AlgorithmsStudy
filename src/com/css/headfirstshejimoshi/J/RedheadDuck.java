package com.css.headfirstshejimoshi.J;

/**
 * Created by 46597 on 2018/5/19.
 */
public class RedheadDuck implements Quackable {

    QuackObservable observable;

    public RedheadDuck(){
        observable = new Observable(this);

    }


    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        notifyObservers();
    }
}
