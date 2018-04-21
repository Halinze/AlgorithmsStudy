package com.css.algorithms.dapter01.unite03;

import edu.princeton.cs.algs4.StdIn;

/**
 * Created by 46597 on 2018/4/13.
 */
public class Ex_1_3_09 {


    /**
     * 编写一段程序，从标准输入得到一个缺少左括号的表达式并打印出不全括号之后的中序表达式；
     * <p>
     * 例如，给定输入；
     * 1 + 2 ） + 3 - 4 ） * 5 - 6 ） ） ）
     * <p>
     * 你的程序应该输出；
     * <p>
     * （ （ 1 + 2 ） * （ （ 3 - 4 ） *（ 5 - 6 ） ） ）
     */

    public static void main(String[] args) {
        Stack<String> opt = new Stack<>();
        Stack<String> val = new Stack<>();
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if (s.equals("end")) {
                break;
            } else if (s.equals("+")) {
                opt.push(s);
            } else if (s.equals("-")) {
                opt.push(s);
            } else if (s.equals("*")) {
                opt.push(s);
            } else if (s.equals("/")) {
                opt.push(s);
            } else if (s.equals(")")) {
                //这才是精华
                String d2 = val.pop();
                String d1 = val.pop();
                //构造（ 2 + 1 )
                String temp = "(" + d1 + opt.pop() + d2 + ")";
                //再将temp 压入值栈
                val.push(temp);
            } else {
                val.push(s);
            }
        }
        System.out.println(val.peek());


    }


}


