package com.css.headfirstshejimoshi.D;

/**
 * Created by 46597 on 2018/5/8.
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {

        Berverage espresso = new Espresso();

        System.out.println(espresso.getDescription() + " $ "  + espresso.cost());

        Berverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast) ;
        System.out.println(darkRoast.getDescription() + " $ " + darkRoast.cost());


        Berverage houserBlend = new HouserBlend();
        houserBlend = new Soy(houserBlend);
        houserBlend = new Mocha(houserBlend);
        houserBlend = new Whip(houserBlend);
        System.out.println(darkRoast.getDescription() + " $ " + darkRoast.cost());


    }
}
