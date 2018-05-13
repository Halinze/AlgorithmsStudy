package com.css.headfirstshejimoshi.F;

/**
 * Created by 46597 on 2018/5/13.
 */
public class Stereo {

    public String name ;

    public Stereo(String name ){
        this.name = name ;
    }

    public void on(){
        System.out.println("Living Room stereo is on");
        setCd();
        setVolume();
    }


    public void off(){
        System.out.println("Living Room stereo is off");
    }

    public void setCd(){}

    public void serDvd(){
        System.out.println("Living Room Stereo is set for CD input");
    }


    public void setRadio(){}

    public void setVolume(){
        System.out.println("Living Room Stereo set to 11");
    }

}
