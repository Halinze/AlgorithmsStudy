package com.css.algorithms.dapter01.unite04;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by 46597 on 2018/4/22.
 */
public class ThreeSum {

 public static int count(int[] a){

     int N = a.length;
     int cnt = 0 ;
     for (int i = 0; i < N ; i++) {
         for (int j = i + 1; j < N ; j++) {
             for (int k = j+1; k < N ; k++) {
                 if(a[i] + a[j] + a[k] == 0 )
                     cnt ++;
             }
         }
     }
     return cnt;
 }

    public static void main(String[] args) {

     //nice 这里填文件路径
     int[] a = In.readInts(args[0]);
        StdOut.println(count(a));
    }







}
