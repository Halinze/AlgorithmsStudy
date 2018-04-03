package com.css.algorithms.dapter01;

import org.junit.Test;

/**
 * Created by 46597 on 2018/4/1.
 */
public class Ex_1_1_16 {
    /**
     *
     */

    public static String exR1(int n) {

        if (n <= 0) return "";
        return exR1(n - 3) + n + exR1(n - 2) + n;


    }

    @Test
    public void test(){
        System.out.println(exR1(6));
    }
}
