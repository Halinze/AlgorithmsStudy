package com.css.headfirstshejimoshi.F;

/**
 * Created by 46597 on 2018/5/13.
 */
public class StereoOnWithCDCommand implements  Command{

    Stereo stereo ;

    public StereoOnWithCDCommand(Stereo stereo){
        this.stereo =stereo ;
    }

    @Override
    public void execute() {
        stereo.on();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
