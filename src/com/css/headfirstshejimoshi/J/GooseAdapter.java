package com.css.headfirstshejimoshi.J;

/**
 * Created by 46597 on 2018/5/19.
 */
public class GooseAdapter implements Quackable {

    private Goose goose;

    public GooseAdapter(Goose goose){
        this.goose = goose ;
    }
    @Override
    public void quack() {
        goose.honk();
    }
}
