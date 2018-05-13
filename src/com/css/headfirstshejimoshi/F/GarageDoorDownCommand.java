package com.css.headfirstshejimoshi.F;

import com.css.headfirstshejimoshi.E.GarageDoorOpenCommand;

/**
 * Created by 46597 on 2018/5/13.
 */
public class GarageDoorDownCommand implements Command {

    GarageDoor garageDoor ;

    public GarageDoorDownCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor ;
    }


    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
