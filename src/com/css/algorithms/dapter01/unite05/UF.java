package com.css.algorithms.dapter01.unite05;


import java.io.FileInputStream;

/**
 * Created by 46597 on 2018/4/22.
 */
public abstract class UF {

    private int[] id; //分量id
    private int count;//分量数量

    public UF(int N) {
        //初始化分量id数组
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }

    }

    public int count() {
        return count;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }


    public abstract int find(int p);

    public abstract void union(int p, int q);



}
