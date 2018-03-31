package com.css.baseStudy;

import edu.princeton.cs.algs4.StdOut;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by 46597 on 2018/3/22.
 */
public class DiGuiTest {


    //不死神兔  1 1 2 3 5 8 13 。。。
    public  static int   f(int n ){

        if(n == 1 || n == 2){
            return 1;
        }


        return  f(n-2) + f(n-1);
    }

    public static void main(String[] args) {

        System.out.println(f(15));

    }

    @Test
    public void test01(){

        int f = 0 ;

        int g = 1 ;

        for (int i = 0; i <= 15 ; i++) {

            StdOut.print(f + " ");

            f = f + g;

            g = f - g;

        }



    }

    @Test
    public void test02(){

       /*
        int a = 1;
        int b = 1 ;
        int c = 1;
        if(a==b && a==c ){

            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
        */

       int a = 2 ;
       int b = 1 ;
       int c = 0  ;
//       if(a > b ) then c = 0 ;

//        if a > b {c = 0 ;}
        //if ( a > b) c= 0 ;
//        if(a > b ) c = 0 else b = 0 ;


        int sum = 0 ;

        for (int i = 1; i < 1000 ; i *= 2) {

            for (int j = 0; j < 1000 ; j++) {

                sum++ ;

            }

        }
        StdOut.println(sum );


    }

    @Test
    public void test03(){

        int sum = 0 ;

        for (int i = 1; i < 1000 ; i++) {

            for (int j = 0; j < i ; j++) {

                sum ++ ;

            }

        }
        System.out.println(1000*999/2);
        StdOut.println(sum);



    }

    @Test
    public void test04(){

        double t = 9.0;

        while(Math.abs(t - 9.0/t) > .001){

            t = (9.0/t + t)/2.0;
        }
        StdOut.printf("%.5f\n",t);

    }

    @Test
    public void test05(){

        //double d = 0.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001;
        double d = 1.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001;

        if (0 < d && 1 > d){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }



}
