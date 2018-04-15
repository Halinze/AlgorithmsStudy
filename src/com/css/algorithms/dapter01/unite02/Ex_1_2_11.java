package com.css.algorithms.dapter01.unite02;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by 46597 on 2018/4/13.
 */
public class Ex_1_2_11 {

    /**
     * 根据Date的API实现一个SmartDate类型，在日期非法是抛出一个异常。
     */
    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);


        Date date = new Date(m, d, y);
        StdOut.println((-12) % 7);
        StdOut.println(date);

    }


}

class Date {

    private final int value;


    public Date(int m, int d, int y) {
        value = y * 512 + m * 32 + d;
    }

    public int month() {
        return (value / 32) % 16;
    }

    public int day() {
        return value % 32;
    }

    public int year() {
        return value / 512;
    }

    public String toString() {
        return month() + "/" + day() + "/" + year();
    }
}

class SmartDate {

    // 年 月 日  月<=12 日<=31 ? 30 ? 29

    private int year;
    private int month;
    private int day;


    public SmartDate(int y, int m, int d) {
        if (!isllegal(y, m, d))
            throw new IllegalArgumentException("illegal date!!");
        else {
            year = y;
            month = m;
            day = d;
        }

    }


    public SmartDate(String date) {

        String[] arr = date.split("/");
        int m = Integer.parseInt(arr[0]);
        int d = Integer.parseInt(arr[1]);
        int y = Integer.parseInt(arr[2]);

        if (!isllegal(y, m, d)) {
            throw new IllegalArgumentException("illegal date!!");
        } else {
            year = y;
            month = m;
            day = d;
        }
    }


    public int year() {
        return year;
    }

    public int month() {
        return month;
    }

    public int day() {
        return day;
    }

    public String toString() {
        return month() + "/" + day() + "/" + year();
    }

    /**
     * 运用蔡勒公式--判断该日的星期
     * W = [C/4] - 2C + y + [y/4] + [13 * (M+1) / 5] + d - 1
     *
     * @return
     */
    public String dayOfWeek() {
        if(month==1) {month=13;}
        if(month==2) month=14;

        int week=(day+2*month+3*(month+1)/5+year+year/4-year/100+year/400)%7;

        switch (week) {
            case 1:
                return "Monday";
            case 2:
                return "TuesDay";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            default:
                return "Sunday";
        }

    }


    //判断年月日是否合法  三方面 年月日  这样考虑蛮简单的 我怎么没想到 =。=
    private boolean isllegal(int y, int m, int d) {

        if (m < 0 || m > 12 || d < 0 || d > 31) {
            return false;
        }

        int[] monthOfDay = {0, 31, -1, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        //判断是否为闰年
        if (isRunNian(y)) {
            monthOfDay[2] = 29;
        } else {
            monthOfDay[2] = 28;
        }

        if (monthOfDay[m] < d) {
            return false;
        }

        return true;
    }


    //判断是否为闰年
    public boolean isRunNian(int year) {

        if (year % 100 != 0 && year % 4 == 0) {
            return true;
        } else if (year % 100 == 0 && year % 400 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        SmartDate date = new SmartDate(2018, 2, 29);
        StdOut.println(date.toString() + " " + date.dayOfWeek());

    }
}
