package com.css.headfirstshejimoshi.K;

import java.util.ArrayList;

/**
 * Created by 46597 on 2018/5/19.
 * 对象村煎饼
 */
public class PancakeHouseMenue {

    ArrayList menuItems;


    public PancakeHouseMenue() {

        menuItems = new ArrayList<>();

        addItem("K&B's Pancake Breakfast","Pancakes with scrambled eggs, and toast" , true , 2.99);

        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage",false , 2.99  );

        addItem("Blueberry Pancakes","Pancakes made with fresh buleberries" , true , 3.49);

        addItem("Waffles","Waffles,with you choice of blueberries or strawberries", true , 3.59);


    }


    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);

    }


    public ArrayList getMenuItems() {
        return menuItems;
    }

}
