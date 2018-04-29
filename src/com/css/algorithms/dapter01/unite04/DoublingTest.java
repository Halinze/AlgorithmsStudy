package com.css.algorithms.dapter01.unite04;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;


/**
 * Created by 46597 on 2018/4/22.
 */
public class DoublingTest {


    public static double timeTrial(int N){

        int MAX = 1000000;
        int[] a = new int[N];
        for (int i = 0; i < N ; i++) {
            a[i] = StdRandom.uniform(-MAX,MAX);
        }
        Stopwatch timer = new Stopwatch();
        int count = ThreeSum.count(  a);
        return timer.elapesedTime();


    }


    public static void main(String[] args) {

        //我去厉害啊！！
        for (int N = 250 ; true ; N += N){
            // 打印问题规模为N的程序的用时
            double time = timeTrial(N);
            StdOut.printf("%7d %5.1f\n" ,N ,time);

        }
    }


}
