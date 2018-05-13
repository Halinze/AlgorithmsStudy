package com.css.headfirstshejimoshi.F;

/**
 * Created by 46597 on 2018/5/13.
 */
public class CeilingFanOnCommand implements  Command {

    CellingFan cellingFan ;


    public CeilingFanOnCommand(CellingFan cellingFan){
        this.cellingFan = cellingFan ;
    }

    @Override
    public void execute() {
        cellingFan.high();
    }

    @Override
    public void undo() {
        cellingFan.off();
    }
}
