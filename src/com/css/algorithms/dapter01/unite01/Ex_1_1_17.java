package com.css.algorithms.dapter01.unite01;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by 46597 on 2018/4/1.
 */
public class Ex_1_1_17 {

    public static String exR2(int n ){

        String s = exR2(n-3) + n + exR2(n-2) + n ;
        if (n <= 0 ){
            return "";
        }
        return  s ;
    }

    public static void main(String[] args) {
        System.out.println(exR2(6));
    }





}
