package com.css.headfirstshejimoshi.I;

/**
 * Created by 46597 on 2018/5/19.
 */
public class PizzaTestDrive  {

    public static void main(String[] args) {

        NYPizzaStore nyStore = new NYPizzaStore();
        ChicagoPizzaStore chicagoStore = new ChicagoPizzaStore();


        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a "  + pizza.getName() + "\n");

         pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");



    }
}
