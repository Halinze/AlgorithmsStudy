package com.css.headfirstshejimoshi.K;

import java.util.Iterator;

/**
 * Created by 46597 on 2018/5/20.
 */
public class Waitress {

    BuildIterator pancakeHouseMenu;
    BuildIterator dinerMenu ;
    BuildIterator cafeMenu ;

    public Waitress(BuildIterator pancakeHouseMenu , BuildIterator dinerMenu , BuildIterator cafeMenu){
        this.pancakeHouseMenu = pancakeHouseMenu ;
        this.dinerMenu = dinerMenu ;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu(){

        Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator dinerMenuIterator = dinerMenu.createIterator();
        Iterator cafeMenuIterator = cafeMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeHouseMenuIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerMenuIterator);
        System.out.println("\nDINNER");
        printMenu(cafeMenuIterator);



    }

    private void printMenu(Iterator iterator) {

        while (iterator.hasNext()){
            MenuItem next = (MenuItem) iterator.next();
            System.out.println(next.getName() + ",");
            System.out.println(next.getPrice() + " -- ");
            System.out.println(next.getDescription());
        }
    }


}
