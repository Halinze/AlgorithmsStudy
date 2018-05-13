package com.css.headfirstshejimoshi.A;

/**
 * Created by 46597 on 2018/5/4.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
