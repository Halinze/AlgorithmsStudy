package com.css.headfirstshejimoshi.E;

/**
 * Created by 46597 on 2018/5/13.
 */
public class GarageDoorOpenCommand implements Command{

    GarageDoor garageDoor;

   public GarageDoorOpenCommand(GarageDoor garageDoor){
       this.garageDoor = garageDoor;
   }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
