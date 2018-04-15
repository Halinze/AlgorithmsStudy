package com.css.algorithms.dapter01.unite01;

import org.junit.Test;

import static jdk.nashorn.internal.objects.Global.print;

/**
 * Created by 46597 on 2018/3/31.
 */
public class Ex_1_1_13 {

    /**
     * 编写一段代码，打印一个M行N列的二维数组的转置（交换行和列）
     *
     * 我去想多了 人家已经说了是M行N列 的二维数组；
     *
     * 2 , 3 , 6
     * 4 , 5 , 7
     *
     * 转换为：
     *
     * 2 , 4
     * 3 , 5
     * 6 , 7
     *
     */
    @Test
    public void test(){


      int[][] arr = {{2,3,6},{4,5,7}};

        int[][] arr2 = new int[arr[0].length][arr.length];

        for (int i = 0; i <arr.length ; i++) {

            for (int j = 0; j <arr[i].length; j++) {

               arr2[j][i] = arr[i][j];



            }

        }


        for (int[] ints : arr2) {

            for (int anInt : ints) {

                System.out.println(anInt);

            }

        }
        /*

        int M=5;
        int N=5;
        int a[][];
        a=Init( M, N);
        System.out.println("转置前......");
        print(a);
        a=revere(a,M,N);
        System.out.println("转置后......");
        print(a);


        */





    }

    /**
     * 转置
     * @param a
     * @return
     */
    public static int[][] revere(int a[][],int M,int N){
        int b[][]=new int[N][M];
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                b[j][i]=a[i][j];
            }
        }

        return b;
    }
    /**
     * 初始化
     * @param M
     * @param N
     * @return
     */
    public static int[][]  Init(int M,int N){
        int[][] a;
        a=new int[M][N];
        int Init=1;
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                a[i][j]=Init++;
            }
        }
        return a;
    }
    /**
     * 打印
     * @param a
     */
    public static void print(int a[][]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }


   /* private int[][] F(int[][] arr) {

        return null;
    }*/


}
