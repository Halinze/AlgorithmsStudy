package com.css.headfirstshejimoshi.A;

/**
 * Created by 46597 on 2018/5/4.
 */
public class MallardDuck extends  Duck {

    public MallardDuck(){

        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();

    }


    @Override
    public void display() {
        System.out.println(" I'm a real Mallard duck !");
    }



}
