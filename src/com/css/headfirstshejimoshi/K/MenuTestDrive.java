package com.css.headfirstshejimoshi.K;

/**
 * Created by 46597 on 2018/5/20.
 */
public class MenuTestDrive {

    public static void main(String[] args) {

        PancakeHouseMenue pancakeHouseMenue = new PancakeHouseMenue();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pancakeHouseMenue, dinerMenu,cafeMenu);

        waitress.printMenu();


    }


}
