package com.css.headfirstshejimoshi.F;


import org.junit.Test;

/**
 * Created by 46597 on 2018/5/13.
 */
public class RemoteLoader {

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CellingFan cellingFan = new CellingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRommLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRommLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);


        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(cellingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(cellingFan);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);


        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereOff = new StereoOffCommand(stereo);


        remoteControl.setCommand(0,livingRommLightOn,livingRommLightOff);
        remoteControl.setCommand(1,kitchenLightOn,kitchenLightOff);
        remoteControl.setCommand(2,ceilingFanOn,ceilingFanOff);
        remoteControl.setCommand(3,stereoOnWithCD,stereOff);


        System.out.println(remoteControl);


        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);




    }

    @Test
    public void test(){

        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("Living Room");

        LightOnCommand lightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOff = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0,lightOn, lightOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        System.out.println("============================================================");
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

    }


    @Test
    public void test01(){

        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
        CellingFan cellingFan = new CellingFan("Living Room");
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(cellingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(cellingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(cellingFan);

        remoteControl.setCommand(0 , ceilingFanMedium , ceilingFanOff);
        remoteControl.setCommand(1,ceilingFanHigh,ceilingFanOff);


        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();



    }
    
    @Test
    public void test03(){

        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();


        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);


        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TVOffCommand tvOff = new TVOffCommand(tv);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);


        Command[] partyOn = {lightOn,stereoOn,tvOn, hottubOn};
        Command[] partuOff = {lightOff, stereoOff, tvOff, hottubOff} ;

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partuOff);

        remoteControl.setCommand(0, partyOnMacro,partyOffMacro);
        System.out.println(remoteControl);
        System.out.println("------Pushing Macro On ---------");
        remoteControl.onButtonWasPushed(0);
        System.out.println("------Pushing Macro Off ---------");
        remoteControl.offButtonWasPushed(0);


    }



}
