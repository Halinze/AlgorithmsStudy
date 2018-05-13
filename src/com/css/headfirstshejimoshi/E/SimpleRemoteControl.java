package com.css.headfirstshejimoshi.E;

/**
 * Created by 46597 on 2018/5/
 * 遥控器
 */
public class SimpleRemoteControl {


    Command solt;

    public SimpleRemoteControl() {
    }


    public void setCommand(Command command) {
        this.solt = command;
    }

    public void buttonWasPressed(){
        solt.execute();
    }
}
