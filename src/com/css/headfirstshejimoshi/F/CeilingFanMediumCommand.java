package com.css.headfirstshejimoshi.F;

/**
 * Created by 46597 on 2018/5/13.
 */
public class CeilingFanMediumCommand implements Command {

    CellingFan ceilingFan;

    int prevSpeed;

    public CeilingFanMediumCommand(CellingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {

        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();

    }

    @Override
    public void undo() {

        if(prevSpeed == CellingFan.HIGH){
            ceilingFan.high();
        }else if(prevSpeed == CellingFan.MEDIUM){
            ceilingFan.medium();
        }else if(prevSpeed == CellingFan.LOW){
            ceilingFan.low();
        }else if(prevSpeed == CellingFan.OFF){
            ceilingFan.off();
        }

    }
}
