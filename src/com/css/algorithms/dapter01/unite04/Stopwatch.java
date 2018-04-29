package com.css.algorithms.dapter01.unite04;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by 46597 on 2018/4/22.
 * 计时器
 */
public class Stopwatch {

    private final long start ;

    public Stopwatch(){
        start = System.currentTimeMillis();
    }

    public double elapesedTime(){
        long now =System.currentTimeMillis();
        return (now -start) / 1000.0;
    }


    public static void main(String[] args) {

        int N = Integer.parseInt(args[0]);
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.uniform(-1000000,1000000);
        }
        Stopwatch timer = new Stopwatch();
        int cnt = ThreeSum.count(a);
        double time = timer.elapesedTime();
        StdOut.println(cnt + "triples " + time  + "second" );


    }
}


