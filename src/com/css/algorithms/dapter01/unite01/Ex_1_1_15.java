package com.css.algorithms.dapter01.unite01;

import java.util.*;

/**
 * Created by 46597 on 2018/4/1.
 */
public class Ex_1_1_15 {
    /**
     *编写一个静态方法histogram(),接受一个整型数组a[] 和 一个整数M 为参数并返回一个大小
     * 为M的数组，其中第i个元素的值为整数i在参数数组中出现的次数。如果a[]中的值均在0到M-1
     * 之间，返回数组中所有元素之和应该和a.length相等；
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5};
        int[] result = histogram(arr, 8);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
    //a[] = {1,2,3,4,5,6};  8  7;
    //{0,1,1,1,1,1,1,0}
    //todo  比较与别人的执行效率
    public  static int[] histogram(int[] arr , int M) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ints = new int[M];
        for (int i = 0; i < M ; i++) {
            int count = 0 ;
            for (int val : arr) {
                if(val == i){
                   // ++count  ;
                    ints[i] = ++count ;
                }
            }
        }
        return ints;
    }
}


