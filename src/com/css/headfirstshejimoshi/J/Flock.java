package com.css.headfirstshejimoshi.J;

import com.css.headfirstshejimoshi.A.Quack;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by 46597 on 2018/5/20.
 */
public class Flock implements Quackable {

    ArrayList quackers = new ArrayList();

    public void add(Quackable quacker){
        quackers.add(quacker);
    }


    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();

        while(iterator.hasNext()){
            Quackable quacker =(Quackable) iterator.next();
            quacker.quack();
        }


    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator iterator = quackers.iterator();
        while(iterator.hasNext()){
            Quackable duck = (Quackable) iterator.next();
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {

    }
}
