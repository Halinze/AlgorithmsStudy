package com.css.headfirstshejimoshi.F;

/**
 * Created by 46597 on 2018/5/13.
 */
public class LightOnCommand implements  Command {

    Light light ;

    public LightOnCommand(Light light){
        this.light = light ;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
