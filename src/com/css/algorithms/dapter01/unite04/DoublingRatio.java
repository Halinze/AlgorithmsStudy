package com.css.algorithms.dapter01.unite04;

import com.sun.org.apache.xpath.internal.SourceTree;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by 46597 on 2018/4/22.
 */
public class DoublingRatio {


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

        double prev = timeTrial(125);

        // for(int N = 250 ; true ; N += N){

        //    double time = timeTrial(N);
        //    StdOut.printf("%6d %7.1f" , N , time);
        //    StdOut.printf("%5.1f\n" , time/prev);
        //   prev = time;
        //   }


        String a = "caoshisheng";
        String b = "caoshi";

        System.out.println(a.hashCode());
        System.out.println(b);


    }


}
