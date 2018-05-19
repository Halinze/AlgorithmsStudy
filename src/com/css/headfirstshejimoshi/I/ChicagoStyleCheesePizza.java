package com.css.headfirstshejimoshi.I;

/**
 * Created by 46597 on 2018/5/19.
 */
public class ChicagoStyleCheesePizza extends  Pizza {


    public ChicagoStyleCheesePizza(){

        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");


    }

    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }


}
