package com.css.algorithms.dapter01.unite03;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 定容字符串的是实现
 * Created by 46597 on 2018/4/15.
 */
public class FixedCapacityStackOfString {


    private String[] a ;//stack entries

    private int N ;//size

    public FixedCapacityStackOfString(int cap){
        a = new String[cap];
    }

    public boolean isEmpty(){
        return N == 0 ;
    }

    public int size(){
        return N ;
    }

    public void push(String item){
        a[N++] = item ;
    }

    public String pop(){
        return a[--N];
    }


    public static void main(String[] args) {

        FixedCapacityStackOfString s ;
        s = new FixedCapacityStackOfString(100);

        while(!StdIn.isEmpty()){

            String item = StdIn.readString();
            if (item.equals("end")) {
                break;
            } else if(!item.equals("-")){
                s.push(item);
            }else if (!s.isEmpty()){
                StdOut.print(s.pop() + " ");
            }
        }

        StdOut.println("(" + s.size() + "left on stack ");

    }




}
