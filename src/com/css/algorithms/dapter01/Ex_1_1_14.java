package com.css.algorithms.dapter01;

import org.junit.Test;

/**
 * Created by 46597 on 2018/3/31.
 */
public class Ex_1_1_14 {


    /**
     * soga I know ;
     * 编写一个静态方法lg(),接受一个整型参数N，返回不大于log2N 的最大整数。不要使用Math 库；
     *
     *
     * 思路？ 利用将利用将公式k=log2N转化为N=2k的原理，不断的逼近其输入的值N，当N<2k时，其（K-1）即为所求的值。
     */


    public static void main(String[] args) {
        System.out.println(lg(7));
    }

    public  static int lg(double N ){

        int k = 0 ;
        if(N>0&&N<1){

            double count = 1 ;
            while(count >= N){
                count *= 1/2.0 ;
                k-=1;

            }
            return k+1;
        }else if(N>1){

            double count = 1;
            while(count <= N){
                count *= 2.0 ;
                k+=1;
            }


            return k-1;
        }else {
            return -1;
        }

    }






}
