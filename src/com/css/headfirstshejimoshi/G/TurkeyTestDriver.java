package com.css.headfirstshejimoshi.G;

/**
 * Created by 46597 on 2018/5/14.
 */
public class TurkeyTestDriver {



    public static void main(String[] args) {

        MallarDuck mallarDuck = new MallarDuck();
        mallarDuck.quack();
        mallarDuck.fly();


        WildTurkey wildTurkey = new WildTurkey();
        wildTurkey.gobble();
        wildTurkey.fly();

        DuckAdapter duckAdapter = new DuckAdapter(mallarDuck);
        duckAdapter.gobble();
        duckAdapter.fly();




    }




}
