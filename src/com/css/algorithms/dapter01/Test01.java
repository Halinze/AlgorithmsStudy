package com.css.algorithms.dapter01;

import com.sun.org.apache.xpath.internal.SourceTree;
import edu.princeton.cs.algs4.*;
import org.junit.Test;

/**
 * Created by 46597 on 2018/3/26.
 */
public class Test01 {


    public static void main(String[] args) {


        double xlo = Double.parseDouble(args[0]);
        double xhi = Double.parseDouble(args[1]);
        double ylo = Double.parseDouble(args[2]);
        double yhi = Double.parseDouble(args[3]);
        int T = Integer.parseInt(args[4]);

        Interval1D xinterval = new Interval1D(xlo, xhi);
        Interval1D yinterval = new Interval1D(ylo, yhi);
        Interval2D box = new Interval2D(xinterval, yinterval);
        box.draw();

        Counter c = new Counter("hits");

        for (int t = 0; t < T; t++) {
            double x = Math.random();
            double y = Math.random();
            Point2D p = new Point2D(x,y);
            if (box.contains(p)){
                c.increment();
            }else{
                p.draw();
            }

        }
        StdOut.println(c);
        StdOut.println(box.area());

    }

    @Test
    public void test(){

//        System.out.println(true && false || true && true );
//        System.out.println(2.0e-6 * 100000000.1 );
//        System.out.println((0 + 15) / 2);

        System.out.println((1 + 2.236) / 2 );


        System.out.println(1  + 2 + 3 + 4.0);

        //System.out.println(1 _+  2 + "3");

    }

    @Test
    public  void test02(){

        System.out.println('b');

        System.out.println('b' + 'c');
        System.out.println("css");

        System.out.println((char) ('a' + '4'));

        System.out.println("css");

    }









}
