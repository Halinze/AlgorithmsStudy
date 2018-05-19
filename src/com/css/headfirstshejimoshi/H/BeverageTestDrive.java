package com.css.headfirstshejimoshi.H;

/**
 * Created by 46597 on 2018/5/14.
 */
public class BeverageTestDrive {

    public static void main(String[] args) {


        TeaWithHook teaWithHook = new TeaWithHook();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        System.out.println("\nMaking tea ...");
        teaWithHook.prepareRecipe();

        System.out.println("\nMaking coffee ...");
        coffeeWithHook.prepareRecipe();
    }

}
