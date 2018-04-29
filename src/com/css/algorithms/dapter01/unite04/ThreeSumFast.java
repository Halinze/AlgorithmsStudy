package com.css.algorithms.dapter01.unite04;

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * Created by 46597 on 2018/4/22.
 * 假设文件中的数据是 不重复的 =。=；
 */
public class ThreeSumFast {


    public static int count(int[] a) {

        Arrays.sort(a);
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (BinarySearch.rank(-a[i] - a[j], a) > j) {
                    cnt++;
                }

            }

        }
        return cnt;
    }


    public static void main(String[] args) {
        int[] a = In.readInts(args[0]);
        Stopwatch timer = new Stopwatch();
        //0.9s
        StdOut.println(count(a));
        System.out.println(timer.elapesedTime());
        //18s
        timer = new Stopwatch();
        StdOut.println(ThreeSum.count(a));
        System.out.println(timer.elapesedTime());
    }
}
