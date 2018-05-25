package com.css.headfirstshejimoshi.J;

/**
 * Created by 46597 on 2018/5/19.
 */
public class MallardDuck implements Quackable {

    QuackObservable observable;

    public MallardDuck(){
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        observable.notifyObservers();
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
