package com.css.headfirstshejimoshi.F;

/**
 * Created by 46597 on 2018/5/13.
 */
public class CeilingFanHighCommand implements Command {


    CellingFan ceilingFan;

    int prevSpeed;

    public CeilingFanHighCommand(CellingFan cellingFan){
        this.ceilingFan = cellingFan;
    }

    @Override
    public void execute() {

        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();

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
