package com.css.algorithms.dapter01.unite03;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by 46597 on 2018/4/15.
 */
public class Stats {


    //标准差公式： 所有数减去平均值，它的平方和除以数的个数（或个数减一)，再把所得值开根号，就是1/2次方，得到的数就是这组数的标准差。
    public static void main(String[] args) {

        Bag<Double> numbers = new Bag<>();
        double num ;
        while(!StdIn.isEmpty()){
            if((num =StdIn.readDouble()) == -1){
                break;
            }
            System.out.println(num);
            numbers.add(num);
        }
        int N = numbers.size();
        System.out.println(N);

        double sum = 0.0 ;
        for (Double x : numbers) {
            sum += x ;
        }
      //  StdOut.println(sum + " " + N );
        double mean =sum /N ;

        sum = 0.0 ;

        for (Double x : numbers) {
            sum += (x - mean)*(x - mean );
        }
        double std = Math.sqrt(sum/(N-1));

        StdOut.printf("Mean: %.2f\n",mean);
        StdOut.printf("Std dev:%.2f\n",std);




    }





}
