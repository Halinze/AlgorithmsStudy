package com.css.algorithms.dapter01;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by 46597 on 2018/3/27.
 */
public class VisualAccumulator {

    private double total ;
    private int N ;

    public VisualAccumulator(int trials , double max ){
        StdDraw.setXscale(0,trials);
        StdDraw.setYscale(0,max);
        StdDraw.setPenRadius(.005);
    }

    public void addDataValue(double val){
        N++;
        total += val ;
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.point(N,val);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(N,total/N);
    }

    public double mean(){
        return total/N;
    }

    public String toString(){
        return "Mean (" + N + " values): " + String.format("%7.5f",mean());
    }


    public static void main(String[] args) {

        int T = Integer.parseInt(args[0]);
        VisualAccumulator a = new VisualAccumulator(T, 1.0);
        for (int t = 0; t < T ; t++) {
            a.addDataValue(StdRandom.random());
        }
        StdOut.println(a);
    }

}
