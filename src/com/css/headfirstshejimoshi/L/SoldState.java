package com.css.headfirstshejimoshi.L;

/**
 * Created by 46597 on 2018/5/26.
 */
public class SoldState implements  State {

    GumballMachineTwo gumballMachine;

    public SoldState(GumballMachineTwo gumballMachine){
        this.gumballMachine = gumballMachine ;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait , we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball");
    }

    @Override
    public void dispense() {
        gumballMachine.releaeseBall();
        if(gumballMachine.getCount() > 0 ){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else{
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }

    }
}
