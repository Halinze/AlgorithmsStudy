package com.css.headfirstshejimoshi.J;

/**
 * Created by 46597 on 2018/5/19.
 *
 * 装饰类
 */
public class QuackCount implements  Quackable {


    private  Quackable quackable;

    private  static  int  count ;

    public QuackCount(Quackable quackable){
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        count ++ ;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void registerObserver(Observer observer) {
        quackable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        quackable.notifyObservers();
    }
}
