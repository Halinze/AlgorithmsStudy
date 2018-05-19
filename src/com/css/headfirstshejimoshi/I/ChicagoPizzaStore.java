package com.css.headfirstshejimoshi.I;

/**
 * Created by 46597 on 2018/5/19.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("cheese")) {
          return  pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
          return   pizza = new ChicagoStylePepperoniPizza();
        } else if (type.equals("clam")) {
           return pizza = new ChicagoStyleClamPizza();
        } else if (type.equals("veggie")) {
           return  pizza = new ChicagoStyleVeggiePizza();
        } else {
           return  null;
        }
    }

}
