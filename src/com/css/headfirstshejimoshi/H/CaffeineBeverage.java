package com.css.headfirstshejimoshi.H;

/**
 * Created by 46597 on 2018/5/14.
 * 算法模式
 */
public abstract class CaffeineBeverage {

    public final void  prepareRecipe(){

        boilWater();
        brew();
        pourInCup();
        if(customerWantersCondiments()) {
            addCondiments();
        }
    }

    protected abstract void addCondiments();

    protected abstract void brew();

    void boilWater(){
        System.out.println("Boiling water");
    }

    void pourInCup(){
        System.out.println("Pouring into cup");
    }

    //钩子
    protected boolean customerWantersCondiments() {
        return true;
    }




}
