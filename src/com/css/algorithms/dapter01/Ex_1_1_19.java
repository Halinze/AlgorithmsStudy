package com.css.algorithms.dapter01;

import com.sun.org.apache.xpath.internal.SourceTree;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by 46597 on 2018/4/1.
 * 我去 电脑怎么算的这么慢；
 *
 * 搞清楚为什么这么慢，怎么解决；
 * 开发F(N)的一个更好实现，用数组保存已经计算过的值；
 */
public class Ex_1_1_19 {

    //递归的实现  1 1 2 3 5 8 13 21
    public static long F(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        return F(N-1) + F(N-2);
    }

    //计算结果用数组保存
    public static long f(int N ){
        long[] f = new long[N + 1];
        return f(N,f);
    }
    public static long f(int N ,long[] f ){
        //这才是==0才是关键代码；
        if(f[N] == 0 ){
            if (N == 1){
                f[N] = 1;
            }else if(N > 1){
                f[N] = f(N-1 ,f) + f(N-2 ,f );
            }
        }
        return f[N];
    }

    public static void main(String[] args) {
        for (int N = 0; N < 3; N++) {
            StdOut.println(N + " "  + f(N));
        }
    }





}


