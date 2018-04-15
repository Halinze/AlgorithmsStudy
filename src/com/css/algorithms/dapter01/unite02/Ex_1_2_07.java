package com.css.algorithms.dapter01.unite02;

/**
 * Created by 46597 on 2018/4/12.
 */
public class Ex_1_2_07 {

    public static void main(String[] args) {

        String s  = "abcdefg";

        System.out.println(mystery(s));



    }

    private static String mystery(String s) {

        int N  = s.length();
        if(N <= 1) return s ;
        String a = s.substring(0,N/2);
        String b = s.substring(N/2,N);
        return mystery(b) + mystery(a);
    }


}
