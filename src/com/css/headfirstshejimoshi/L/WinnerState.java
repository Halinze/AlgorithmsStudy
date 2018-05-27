package com.css.headfirstshejimoshi.L;

/**
 * Created by 46597 on 2018/5/27.
 */
public class WinnerState implements State{

    GumballMachineTwo gumballMachine ;

    public WinnerState(GumballMachineTwo gumballMachine){
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
        System.out.println("YOU'RE A WINNER ! You get two grmballs for your quarter");
        gumballMachine.releaeseBall();
        if(gumballMachine.getCount() == 0 ){
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }else{
            gumballMachine.releaeseBall();
            if(gumballMachine.getCount() > 0 ){
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            }else{
                System.out.println("Oops , out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
