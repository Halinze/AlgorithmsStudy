package com.css.headfirstshejimoshi.L;

import java.util.Random;

/**
 * Created by 46597 on 2018/5/26.
 */
public class HasQuarterState implements State{

    Random random = new Random(System.currentTimeMillis());
    GumballMachineTwo gumballMachine;

    public HasQuarterState(GumballMachineTwo gumballMachine){
        this.gumballMachine = gumballMachine ;
    }


    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned ...");
        int winner = random.nextInt(2);
        if((winner == 0 )&& (gumballMachine.getCount() > 1)){
            gumballMachine.setState(gumballMachine.getWinnerState());
        }else{
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
