package com.css.baseStudy;

/**
 * Created by 46597 on 2018/3/22.
 */
public class DiGuiTest {


    //不死神兔  1 1 2 3 5 8 13 。。。
    public  static int   f(int n ){

        if(n == 1 || n == 2){
            return 1;
        }


        return  f(n-2) + f(n-1);
    }

    public static void main(String[] args) {

        System.out.println(f(5));

    }




}
