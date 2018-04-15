package com.css.algorithms.dapter01.unite02;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by 46597 on 2018/4/13.
 */
public class Ex_1_2_10 {

    /**
     * 编写一个类VisualCounter,支持加一和减一操作。它的构造函数接受两个参数N和max，其中N指定了
     * 操作的最大次数，max指定了计数器的最大绝对值。作为副作用，用图像显示每次计数器变化后的值。
     */


}

class VisualCounter{

 private int cnt = 0 ;

 private int opN = 0 ;
//最大值
 private int max ;
//次数
 private int N ;

 public VisualCounter(int N , int max){
     this.N = N ;
     this.max = max ;
     StdDraw.setXscale(0,N);
     StdDraw.setYscale(-max-0.1,max + 0.1);
     StdDraw.setPenColor(StdDraw.BOOK_BLUE);

 }


    private void increment() {

     if(cnt < max && opN < N ){
         cnt ++ ;
         opN ++ ;
         StdDraw.filledRectangle(opN - 0.5 ,cnt/2.0 ,0.9/2 ,Math.abs(cnt)/2.0);

     }


    }

    private void decrement() {

        if(-cnt < max && opN < N ){
            cnt -- ;
            opN ++ ;
            //不懂这个什么意思！
            StdDraw.filledRectangle(opN - 0.5 ,cnt/2.0 ,0.9/2 ,Math.abs(cnt)/2.0);

        }
    }

    public static void main(String[] args) {

     int N = 10000 ;
     int max = 100;

        VisualCounter vc = new VisualCounter(N, max);

        int i = 0 ;

        while(i<N){

            if (StdRandom.bernoulli(0.5)){
                vc.increment();
            }else {
                vc.decrement();
            }
            i ++ ;

        }


    }


}









//计数器 GO ！
class Counter {

    private final String name;
    private int count;

    public Counter(String id) {
        name = id;
    }

    public void increment() {
        count++;
    }

    public int tally() {
        return count;
    }

    public String toString() {
        return count + " " + name;
    }


}

class Flips{


    public static void main(String[] args) {


       // int T = Integer.parseInt(args[0]);
        int T = 1000000;
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");
        for (int i = 0; i < T ; i++) {

            if(StdRandom.bernoulli(0.5)){
                heads.increment();
            }else{
                tails.increment();
            }

        }
        StdOut.println(heads);
        StdOut.println(tails);

        int d = heads.tally() - tails.tally();

        StdOut.println("delta:" + Math.abs(d));

    }


}










