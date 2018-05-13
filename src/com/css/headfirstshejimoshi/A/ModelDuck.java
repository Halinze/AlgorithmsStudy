package com.css.headfirstshejimoshi.A;

/**
 * Created by 46597 on 2018/5/4.
 */
public class ModelDuck extends  Duck {


    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }


    @Override
    public void display() {
        System.out.println(" I'm a model duck !");
    }
}
