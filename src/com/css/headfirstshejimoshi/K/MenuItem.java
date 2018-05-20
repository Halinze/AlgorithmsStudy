package com.css.headfirstshejimoshi.K;

import java.util.Iterator;

/**
 * Created by 46597 on 2018/5/19.
 */
public class MenuItem extends   MenuComponent{

    String name;
    String description;
    boolean vegetarian;
    double price;


    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;


    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void print(){
        System.out.print(" " + getName());

        if(isVegetarian()){
            System.out.print("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("     --" + getDescription());
    }

    public Iterator createIterator(){
        return new NullIterator();
    }
}
