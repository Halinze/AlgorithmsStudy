package com.css.headfirstshejimoshi.J;

import com.css.headfirstshejimoshi.A.Quack;

/**
 * Created by 46597 on 2018/5/19.
 */
public class DuckSimulator {


    public static void main(String[] args) {

        DuckSimulator duckSimulator = new DuckSimulator();
        CountingDuckFactory countingDuckFactory = new CountingDuckFactory();
        GooseFactory gooseFactory = new GooseFactory();
        duckSimulator.simulate(countingDuckFactory, gooseFactory);

    }


    void simulate(AbstractDuckFactory duckFactory, AbstractGooseFactory abstractGooseFactory) {

        Quackable mallardDuck = duckFactory.createMallarDuck();
        //Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        GooseAdapter gooseAdapter = new GooseAdapter(abstractGooseFactory.createGoose());

        System.out.println("\nDuck Simulator : With Compsite - Flocks");

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(mallardDuck);
        //flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);

        Flock flockOfMallards = new Flock();

        Quackable mallardOne = duckFactory.createMallarDuck();
        Quackable mallarDuckTwo = duckFactory.createMallarDuck();
        Quackable mallarDuckThree = duckFactory.createMallarDuck();
        Quackable mallarDuckFour = duckFactory.createMallarDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallarDuckTwo);
        flockOfMallards.add(mallarDuckThree);
        flockOfMallards.add(mallarDuckFour);

        flockOfDucks.add(flockOfMallards);

        //System.out.println("\nDuck Simulator: Whole Flock Simulation");
        //simulate(flockOfDucks);

        //System.out.println("\nDuck Simulator: Mallard Flock Simulation");
        //simulate(flockOfMallards);

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);
        simulate(flockOfDucks);

        System.out.println("\nThe ducks quacked " + QuackCount.getCount() + " times");
        

    }


    void simulate(Quackable duck) {
        duck.quack();
    }
}
