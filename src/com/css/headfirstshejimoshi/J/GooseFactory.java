package com.css.headfirstshejimoshi.J;

/**
 * Created by 46597 on 2018/5/19.
 */
public class GooseFactory extends AbstractGooseFactory{


    @Override
    public Goose createGoose() {
        return new Goose();
    }
}
