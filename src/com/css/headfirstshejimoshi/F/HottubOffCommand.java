package com.css.headfirstshejimoshi.F;

/**
 * Created by 46597 on 2018/5/13.
 */
public class HottubOffCommand implements Command {

    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.jetsOn();
    }

    @Override
    public void undo() {
        hottub.jetsOff();
    }
}
