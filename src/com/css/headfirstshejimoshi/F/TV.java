package com.css.headfirstshejimoshi.F;

/**
 * Created by 46597 on 2018/5/13.
 */
public class TV {


    private String name ;

    public  TV(String name ){
        this.name = name ;
    }

    public void on(){
        System.out.println("Living Room TV is on");
        setInputChannel();
    }


    public void off(){
        System.out.println("Living Room TV is off");
    }

    public void setInputChannel(){
        System.out.println("Living Room Tv channel is set for DVD");
    }

    public void setVolume(){


    }
}
