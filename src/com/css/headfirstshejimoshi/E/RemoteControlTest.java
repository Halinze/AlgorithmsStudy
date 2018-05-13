package com.css.headfirstshejimoshi.E;

/**
 * Created by 46597 on 2018/5/13.
 */
public class RemoteControlTest {


    public static void main(String[] args) {

        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommond lightOnCommond = new LightOnCommond(light);
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOnCommond);
        remote.buttonWasPressed();
        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();


    }
}
