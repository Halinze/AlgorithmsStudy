package com.css.headfirstshejimoshi.I;

/**
 * Created by 46597 on 2018/5/15.
 * 工厂模式
 */
public abstract class PizzaStore {


    public Pizza orderPizza(String type){

        Pizza pizza ;

        pizza = createPizza(type);

        pizza.prepare();

        pizza.bake();

        pizza.cut();

        pizza.box();

        return pizza;

    }

     abstract Pizza createPizza(String type);


}
