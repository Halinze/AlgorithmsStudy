package com.css.algorithms.dapter01.unite04;

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * Created by 46597 on 2018/4/22.
 *
 * 归并排序 + 2分查找
 */
public class TwoSumFast {


    public static int count(int[] a) {

        //计算和为0的整数对的数目
        Arrays.sort(a);
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (BinarySearch.rank(-a[i], a) > i) {
                cnt++;
            }

        }
        return cnt;
    }

    public static int count2(int[] a){

        int N = a.length;
        int cnt = 0 ;
        for (int i = 0; i < N ; i++) {
            for (int j = i + 1; j < N ; j++) {
                    if(a[i] + a[j]  == 0 )
                        cnt ++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {

        int[] a = In.readInts(args[0]);
        Stopwatch timer = new Stopwatch();
        StdOut.println(count(a));
        System.out.println(timer.elapesedTime());
        Stopwatch timer2 = new Stopwatch();
        StdOut.println(count2(a));
        StdOut.println(timer2.elapesedTime());


    }


}
