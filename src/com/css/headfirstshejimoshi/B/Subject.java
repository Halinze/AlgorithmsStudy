package com.css.headfirstshejimoshi.B;


/**
 * Created by 46597 on 2018/5/7.
 */
public interface Subject {


    public void registerObserver(Observer O);


    public void removeObserver(Observer O);


    public void notifyObservers();

}
