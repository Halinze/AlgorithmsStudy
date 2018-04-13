package com.css.algorithms.dapter01;

/**
 * Created by 46597 on 2018/4/12.
 */
public class Ex_1_2_06 {


    /**
     * 如果字符串s中的字符循环移动任意位置之后能够得到另一个字符串t,那么是就被成为t的回环变位。
     * 编写一个程序检查两个给定的字符串s 和 t 是否互为回环变位。
     * 提示： 答案只需要一行用到indexOf,length()和字符串连接的代码。
     */

    public static void main(String[] args) {


        String str = "abcdefg";

        String str2 = "bcdefga";

        System.out.println(isMatch(str,str2));
    }

    //判断是否为循环变位
    private static boolean isMatch(String str, String str2) {

        String temp = str + str ;

        if(temp.indexOf(str2)!=-1 && str.length() == str2.length())
            return true ;

        return false ;
    }


}
