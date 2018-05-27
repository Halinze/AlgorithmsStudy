package com.css.headfirstshejimoshi.L;

/**
 * Created by 46597 on 2018/5/26.
 */
public class NoQuarterState implements State {

    GumballMachineTwo gumballMachine;

    public NoQuarterState(GumballMachineTwo gumballMachine){
        this.gumballMachine = gumballMachine ;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuartState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("Yout turned , but there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }
}
