package com.css.baseStudy;

/**
 *
 * 单例模式 饿汉式
 * Created by 46597 on 2018/3/21.
 */
public class Moon {

    private static Moon  moon = new Moon();

    private Moon(){

    }

    public static Moon getMoon(){
        return moon;
    }


    public static void main(String[] args) {
        Moon moon1 = Moon.getMoon();

        System.out.println(moon1);

        Moon moon2 = Moon.getMoon();
        System.out.println(moon2);
    }

}
