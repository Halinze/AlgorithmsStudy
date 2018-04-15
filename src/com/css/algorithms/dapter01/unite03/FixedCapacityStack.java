package com.css.algorithms.dapter01.unite03;

import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

/**
 * Created by 46597 on 2018/4/15.
 *
 * 1.加入泛型的栈
 * 2.自动调整数组大小的栈
 * 3.可迭代的栈
 * 牛逼！
 */
public class FixedCapacityStack<Item> implements  Iterable<Item> {

    private Item[] a ;

    private int N ;

    //这里要值得注意下 ！！！
    public  FixedCapacityStack(int cap){
        a = (Item[])new Object[cap];
    }

    public boolean isEmpty(){
        return N == 0 ;
    }

    public int Size(){
        return N ;
    }

    public void push(Item item){
        //将元素压入栈顶
        if(N == a.length){
            resize(2*a.length);
        }
        a[N++] = item ;
    }

    public Item pop(){
        //从栈顶删除元素
        Item item = a[--N];
        a[N] = null ; //避免对象游离
        if(N > 0 && N == a.length/4){
            resize(a.length/2);
        }
        return item;
    }


    //加入调整数组大小的功能
    private void resize(int max){
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N ; i++) {
            temp[i] = a[i];
        }
        a = temp ;
    }

    //迭代功能
    @Override
    public Iterator<Item> iterator() {
        return new Iterator<Item>() {

            private int i = N ;

            @Override
            public boolean hasNext() {
                return i > 0 ;
            }

            @Override
            public Item next() {
                return a[--i];
            }
        };
    }


    public static void main(String[] args) {
        FixedCapacityStack<String> stack = new FixedCapacityStack<>(10);
        stack.push("c");
        stack.push("s");
        stack.push("s");

        for (String s : stack) {

            StdOut.println(s);

        }

    }



}
