package com.css.headfirstshejimoshi.F;

/**
 * Created by 46597 on 2018/5/13.
 */
public class CeilingFanOffCommand implements Command {

    CellingFan cellingFan ;

    int prevSpeed;

    public CeilingFanOffCommand(CellingFan cellingFan){
        this.cellingFan = cellingFan;
    }

    @Override
    public void execute() {
        prevSpeed = cellingFan.getSpeed();
        cellingFan.off();
    }

    @Override
    public void undo() {
        if(prevSpeed == CellingFan.HIGH){
            cellingFan.high();
        }else if(prevSpeed == CellingFan.MEDIUM){
            cellingFan.medium();
        }else if(prevSpeed == CellingFan.LOW){
            cellingFan.low();
        }else if(prevSpeed == CellingFan.OFF){
            cellingFan.off();
        }
    }
}
