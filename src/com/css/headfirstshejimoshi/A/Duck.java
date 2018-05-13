package com.css.headfirstshejimoshi.A;

/**
 * Created by 46597 on 2018/5/4.
 */
public abstract class Duck {

    protected FlyBehavior flyBehavior;

    protected QuackBehavior quackBehavior;


    public  abstract void  display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void perfromQuack(){
        quackBehavior.quack();
    }
    
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void swim(){
        System.out.println("All ducks float , even decoys !");
    }

}
