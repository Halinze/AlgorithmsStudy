package com.css.headfirstshejimoshi.K;

import java.util.Calendar;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Created by 46597 on 2018/5/20.
 */
public class AlteratingDinerMenuIterator implements Iterator {


    MenuItem[] items ;

    int position ;


    public AlteratingDinerMenuIterator(){
        this.items = items ;
        Calendar rightNow = Calendar.getInstance();
        position =  rightNow.get(Calendar.DAY_OF_WEEK)%2 ;
    }

    @Override
    public boolean hasNext() {

        if(position >= items.length || items[position]  == null ){

            return false  ;
        }else {
            return true ;
        }

    }

    @Override
    public Object next() {

        MenuItem menuItem = items[position];
        position = position +  2;
        return menuItem ;


    }

    public void remove(){
        throw new UnsupportedOperationException("Alternating Diner Menu Iterator does not support remove()");
    }
}
