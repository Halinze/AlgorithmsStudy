package com.css.algorithms.dapter01;

import edu.princeton.cs.algs4.Point2D;
import org.junit.Test;

import java.util.Random;

/**
 * Created by 46597 on 2018/3/31.
 */
public class Ex_1_2_01 {


    /**
     * 编写一个Point2D的用例，从命令行接受一个整数N。在单位正方形中生成N个随机点，然后计算两点之间的最近距离。
     */
    public static void main(String[] args) {

     int N = 4;
        Point2D[] arr = new Point2D[N];
        for (int i = 0; i < N ; i++) {

            arr[i] = new Point2D(Math.random(),Math.random());

        }

        //正无穷大
        double mindis = Double.POSITIVE_INFINITY ;


        int count = 0 ;
        //distanceto的方法：
        for (int i = 0; i < N ; i++) {

            for (int j = i + 1; j < N; j++) {
                count ++ ;

               if (arr[i].distanceTo(arr[j]) <mindis ) {
                   mindis = arr[i].distanceTo(arr[j]);
               }

            }


        }
        System.out.println(count);
        System.out.println(mindis);






    }

    @Test
    public void test(){

//        System.out.println( (int)(Math.random()*10 + 1));


        Random random = new Random();
//        random.nextInt()
    }


}
