package com.css.headfirstshejimoshi.F;

import com.css.headfirstshejimoshi.F.Command;

/**
 * Created by 46597 on 2018/5/13.
 */
public class RemoteControlWithUndo {


    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];


        NoCommand noCommand = new NoCommand();

        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }


    public void setCommand(int solt, Command onCommand, Command offCommand) {
        onCommands[solt] = onCommand;
        offCommands[solt] = offCommand;

    }


    public void onButtonWasPushed(int solt){
        onCommands[solt].execute();
        undoCommand = onCommands[solt];
    }

    public void offButtonWasPushed(int solt){
        offCommands[solt].execute();
        undoCommand = offCommands[solt];
    }


    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

    public String toString() {

        StringBuffer sb = new StringBuffer();
        sb.append("\n --------Remote Control--------\n");
        for (int i = 0; i < onCommands.length; i++) {
            sb.append("[solt " + i + "] " + onCommands[i].getClass().getSimpleName()
                    + " " + offCommands[i].getClass().getSimpleName() + "\n");


        }
        sb.append(undoCommand.getClass().getSimpleName());
        return sb.toString();
    }


}

