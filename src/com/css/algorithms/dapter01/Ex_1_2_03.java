package com.css.algorithms.dapter01;

import edu.princeton.cs.algs4.*;

/**
 * Created by 46597 on 2018/4/11.
 */
public class Ex_1_2_03 {


    /**
     * 编写一个Interval2D的用例， 从命令行接受参数N ，min 和 max 。 生成N个随机的2D间隔，其宽
     * 和高均匀地分布在单位正方形中的min 和 max 之间 。用StdDraw画出它们并打印出相交的间隔对的数量
     * 以及有包含关系的间隔对数量。
     */
    public static void main(String[] args) {
        int N = 20;
        double min = 0.05;
        double max = 0.1;
        int containCnt = 0;
        int intersectCnt = 0;
        Interval2D[] arr = new Interval2D[N];
        Interval1D[] arrx = new Interval1D[N];
        Interval1D[] arry = new Interval1D[N];
        for (int i = 0; i < N; i++) {

            double x = StdRandom.uniform(0.0, 1 - max);
            arrx[i] = new Interval1D(x, x + StdRandom.uniform(min, max));
            double y = StdRandom.uniform(0.0, 1 - max);
            arry[i] = new Interval1D(y, y + StdRandom.uniform(min, max));
            arr[i] = new Interval2D(arrx[i], arry[i]);
            StdDraw.setPenColor(StdDraw.BLUE);
            arr[i].draw();

        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i].intersects(arr[j])) {
                    intersectCnt++;
                    if (iscontains(arrx[i], arry[i],arrx[j],arry[j])){
                        containCnt ++ ;
                    }
                }
            }
        }
        StdOut.printf("the intersect interval2D=%d, the contain interval2D =%d\n",intersectCnt,containCnt);
    }
    //包含关系
    public static boolean iscontains(Interval1D x1, Interval1D y1, Interval1D x2, Interval1D y2) {
        //x1 包含 x2
        if (x1.left() <= x2.left() && x1.right() >= x2.right() && y1.left() <= y2.left() && y1.right() >= y2.right()) {
            return true;
        }
        //x2 包含 x1
        if (x2.left() <= x1.left() && x2.right() >= x1.right() && y2.left() <= y1.left() && y2.right() >= y1.right()) {
            return true;
        }
        return false;
    }


}
