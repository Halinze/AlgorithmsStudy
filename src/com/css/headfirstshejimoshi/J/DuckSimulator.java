package com.css.headfirstshejimoshi.J;

/**
 * Created by 46597 on 2018/5/19.
 */
public class DuckSimulator  {


    public static void main(String[] args) {

        DuckSimulator duckSimulator = new DuckSimulator();
        CountingDuckFactory countingDuckFactory = new CountingDuckFactory();
        GooseFactory gooseFactory = new GooseFactory();
        duckSimulator.simulate(countingDuckFactory,gooseFactory);

    }



    void simulate(AbstractDuckFactory abstractDuckFactory,AbstractGooseFactory abstractGooseFactory){

        Quackable mallardDuck =abstractDuckFactory.createMallarDuck() ;
        Quackable redheadDuck = abstractDuckFactory.createRedheadDuck();
        Quackable duckCall = abstractDuckFactory.createDuckCall();
        Quackable rubberDuck = abstractDuckFactory.createRubberDuck();
        GooseAdapter gooseAdapter = new GooseAdapter(abstractGooseFactory.createGoose());

        System.out.println("\nDuck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseAdapter);
        System.out.println( "The ducks quacked " + QuackCount.getCount() + " times");
    }


    void simulate(Quackable duck){
        duck.quack();
    }
}
