package com.css.algorithms.dapter01.unite01;

import org.junit.Test;

/**
 * Created by 46597 on 2018/3/31.
 */
public class Ex_1_1_09 {


    /**
     * 编写段代码，将一个正整数N用二进制表示并转换为一个String类型的值S；
     */
    @Test
    public void test() {

        String s = f(2);
        System.out.println(s);

//        int[] a = new int[10];

//        for(int i = 0 ; i < 10 ; i ++){
//            a[i] = i * i ;
//        }

//        System.out.println(a);


    }

    public String f(int N) {


        String s = "";

        for(int n = N ; n > 0 ; n /=2){
            //这个写法就有点厉害！8
            s= (n%2) +s ;
        }
        System.out.println(2%2);


        return s;
    }


}
