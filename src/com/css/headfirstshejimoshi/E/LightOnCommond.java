package com.css.headfirstshejimoshi.E;

/**
 * Created by 46597 on 2018/5/13.
 */
public class LightOnCommond implements Command  {

    Light light ;

    public LightOnCommond(Light light){
        this.light = light ;
    }

    public void execute() {
        light.on();
    }
}
