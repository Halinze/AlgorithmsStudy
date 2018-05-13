package com.css.headfirstshejimoshi.F;

/**
 * Created by 46597 on 2018/5/13.
 */
public class TVOffCommand implements Command {

    TV tv;

    public TVOffCommand(TV tv){
        this.tv = tv ;
    }


    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
