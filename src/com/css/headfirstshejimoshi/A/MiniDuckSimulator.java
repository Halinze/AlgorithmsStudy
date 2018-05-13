package com.css.headfirstshejimoshi.A;

/**
 * Created by 46597 on 2018/5/4.
 */
public class MiniDuckSimulator {



    //测试
    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.perfromQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();


    }




}
