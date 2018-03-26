package com.css.baseStudy;

/**
 * 单例模式之饿汉式  之 线程安全
 * Created by 46597 on 2018/3/21.
 */
public class Sun {


    private  static  Sun sun ;


    private Sun(){

    }

    public static Sun  getSun() throws InterruptedException {


        if (sun == null) {
            synchronized ("1") {
                if (sun == null) {
                    Thread.sleep(1000);
                    sun = new Sun();
                }
            }
        }
        return sun;
    }

    public static void main(String[] args) throws InterruptedException {


        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(getSun());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


      //  Sun sun1 = getSun();
        //System.out.println(sun1);


        Sun sun2 = getSun();
        System.out.println(sun2);
    }







}
