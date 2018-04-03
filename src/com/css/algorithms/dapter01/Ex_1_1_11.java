package com.css.algorithms.dapter01;

import org.junit.Test;

/**
 * Created by 46597 on 2018/3/31.
 */
public class Ex_1_1_11 {

    /**
     * 编写一段代码，打印出一个二维布尔数组的内容。
     * 其中，使用*表示真，空格表示假；打印出行号和列号；
     *
     * true, false
     * true , false ,false
     *
     */

    @Test
    public void test() {

        Boolean[][] arr = {{true, false}, {true, false, false}};

        String str = "[";

        for (Boolean[] booleans : arr) {

            if (booleans != null && booleans.length > 0) {

                str += "[";
                for (Boolean aBoolean : booleans) {

                    if (aBoolean == true) {
                        str += "*,";
                    } else {
                        str += " ,";
                    }
                }
                str = str.substring(0,str.length()-1) + "],";
            }

        }
        str  = str.substring(0,str.length()-1) + "]";
        System.out.println(str);
    }





}
