package com.css.algorithms.dapter01.unite03;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by 46597 on 2018/4/15.
 * 栈实现的终极版！
 */
public class Stack<Item> implements Iterable<Item> {

    private Node first; //栈顶 or 最近添加的元素

    private int N;//元素数量

    @Override
    public Iterator<Item> iterator() {
        return new Iterator<Item>() {

            private int i = N;

            private Node current = first;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            //哇我是弱智啊
            @Override
            public Item next() {

                Item item = current.item;
                 current = current.next;
                return item;
            }
        };
    }

    private class Node {
        //定义了结点的嵌套类
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public void push(Item item) {
        //项栈顶添加元素 第一步很关键
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }

    public Item pop() {

        Item item = first.item;
        first = first.next;
        N--;
        return item;

    }

    //返回栈中最近添加的元素而不弹出它
    public Item peek(){
        if(isEmpty()) throw new NoSuchElementException("Stack underflow");
        Item item = first.item ;
        return item;
    }

    public static Stack copy(Stack stack){
        Stack a = stack ;
        return a;
    }



    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        while(!StdIn.isEmpty()){

            String item = StdIn.readString();
            if (item.equals("end")) {
                break;
            } else if(!item.equals("-")){
                stack.push(item);
            }else if (!stack.isEmpty()){
                StdOut.print(stack.pop() + " ");
            }
        }

        StdOut.println("(" + stack.size() + "left on stack ");

    }


}
