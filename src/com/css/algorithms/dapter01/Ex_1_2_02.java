package com.css.algorithms.dapter01;

import edu.princeton.cs.algs4.*;
import org.junit.Test;

import java.util.Random;

/**
 * Created by 46597 on 2018/3/31.
 */
public class Ex_1_2_02 {


    /**
     * 编写一个Interval1D的用例，从命令行接受一个整数N。
     * 从标准输入中读取N个间隔（每个间隔由一对double值定义)并打印出所有相交的间隔对。
     */
    public static void main(String[] args) {


        int N = 3;
        Interval1D[] arr = new Interval1D[N];

        for (int i = 0; i < N; i++) {

            StdOut.println("please input an interval 1D");

            double lo = StdIn.readDouble();
            double hi = StdIn.readDouble();
            while (lo > hi) {
                StdOut.println("the input is illegal, please input again");
                lo = StdIn.readDouble();
                hi = StdIn.readDouble();
            }
            arr[i] = new Interval1D(lo, hi);


        }

        for (int i = 0; i < N - 1; i++) {

            for (int j = i + 1; j < N; j++) {

                if (arr[i].intersects(arr[j])) {
                    StdOut.printf("the interval %s is intersected to interval %S\n", arr[i].toString(), arr[j].toString());
                }

            }


        }


    }

    @Test
    public void test(){

        Interval1D a = new Interval1D(.2, .5);
        Interval1D b = new Interval1D(.2, .3);



    }





}
