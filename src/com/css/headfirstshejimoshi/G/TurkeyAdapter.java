package com.css.headfirstshejimoshi.G;

/**
 * Created by 46597 on 2018/5/14.
 */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey ;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5 ; i++) {
            turkey.fly();
        }
    }
}
