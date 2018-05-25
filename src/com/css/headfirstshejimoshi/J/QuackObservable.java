package com.css.headfirstshejimoshi.J;

/**
 * Created by 46597 on 2018/5/21.
 */
public interface QuackObservable {

    public void registerObserver(Observer observer);

    public void notifyObservers();
}
