package com.css.headfirstshejimoshi.L;

/**
 * Created by 46597 on 2018/5/26.
 */
public class GumballMachineTwo {

    State soldOutState ;
    State noQuarterState ;
    State hasQuartState ;
    State soldState;
    State winnerState;

    State state = soldOutState;
    int count = 0 ;

    public GumballMachineTwo(int numberGumballs){
         soldOutState = new SoldOutState(this);
         noQuarterState = new NoQuarterState(this);
         hasQuartState = new HasQuarterState(this);
         soldState = new SoldState(this);
         winnerState = new WinnerState(this);
         this.count = numberGumballs ;
         if(numberGumballs > 0){
             state = noQuarterState ;
         }
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    void setState(State state){
        this.state = state ;
    }


    void releaeseBall(){
        System.out.println("A gumball comes rollling out the slot...");
        if(count != 0 ){
            count = count - 1 ;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuartState() {
        return hasQuartState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }
}
