package com.css.algorithms.dapter01;

import org.junit.Test;

/**
 * Created by 46597 on 2018/3/31.
 */
public class Ex_1_1_12 {

    @Test
    public void test(){

        int[] a = new int[10];

        for (int i = 0; i < 10 ; i++) {
            a[i] = 9 - i ;
        }

        for (int i = 0; i < 10 ; i++) {
            a[i] = a[a[i]];
        }

        for (int i = 0; i < 10 ; i++) {
            System.out.println(a[i]);
        }


    }




}
