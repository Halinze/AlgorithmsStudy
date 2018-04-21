package com.css.algorithms.dapter01.unite03;

import java.util.Iterator;

/**
 * Created by 46597 on 2018/4/16.
 */
public class Queue<Item> implements Iterable<Item> {

    private Node first;

    private Node last ;

    private int N ;

    private class Node {
         Item item ;
         Node next ;
    }

    public boolean isEmpty(){
        return first == null ;
    }

    public  int size(){
        return N ;
    }

    //从表头删除元素
    public Item dequeue(){

        Item item = first.item;
        first = first.next;
        //为什么要加这个啊
        if(isEmpty()) last = null;
        N-- ;
        return item ;

    }

    //向表尾添加元素
    public void enqueue(Item item ){

        Node oldlast = last ;
        last = new Node() ;
        last.item = item ;
        last.next = null;
        //这里也要注意
        if(isEmpty()){
            first = last ;
        }else{
            oldlast.next = last ;
        }
        N++;
    }

    @Override
    public Iterator<Item> iterator() {
        return new Iterator<Item>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Item next() {
                return null;
            }
        };
    }
}
