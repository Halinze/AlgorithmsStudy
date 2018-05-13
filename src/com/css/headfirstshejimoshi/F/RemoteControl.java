package com.css.headfirstshejimoshi.F;

import com.css.headfirstshejimoshi.F.Command;

/**
 * Created by 46597 on 2018/5/13.
 */
public class RemoteControl {


    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];


        NoCommand noCommand = new NoCommand();

        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }


    public void setCommand(int solt, Command onCommand, Command offCommand) {
        onCommands[solt] = onCommand;
        offCommands[solt] = offCommand;

    }


    public void onButtonWasPushed(int solt){
        onCommands[solt].execute();
    }

    public void offButtonWasPushed(int solt){
        offCommands[solt].execute();
    }



    public String toString() {

        StringBuffer sb = new StringBuffer();
        sb.append("\n --------Remote Control--------\n");
        for (int i = 0; i < onCommands.length; i++) {
            sb.append("[solt " + i + "] " + onCommands[i].getClass().getSimpleName()
                    + " " + offCommands[i].getClass().getSimpleName() + "\n");


        }
        return sb.toString();
    }


}
