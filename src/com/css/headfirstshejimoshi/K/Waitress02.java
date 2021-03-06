package com.css.headfirstshejimoshi.K;

import java.util.Iterator;

/**
 * Created by 46597 on 2018/5/20.
 */
public class Waitress02 {

    MenuComponent allMenus;

    public Waitress02(MenuComponent allMenus){
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }

    public void printVegetarianMenu(){
        Iterator iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n-----");

        while(iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            }catch (UnsupportedOperationException e){

            }
        }
    }


}
