package com.css.algorithms.dapter01.unite03;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.management.RuntimeMBeanException;
import java.util.Iterator;



/**
 * Created by 46597 on 2018/4/13.
 */
public class Ex_1_3_10 {


    /**
     * 编写一个过滤器InfixToPostfix,将算数表达式由中序表达式转为后序表达式。
     */


}

//css所写
class  ResizingArrayQueueOfString{


    private String[] arr = new String[1];


    private int N ;

    private int T ;


    public int Size(){
        return N ;
    }

    //入列
    public void enqueue(String val){
        if( N  == arr.length){
            resizing(2*arr.length);
        }
        arr[N++] = val;
    }


    //出列
    public String dequeue() throws RuntimeException {
        if(T < N )
       return arr[T++];
        throw new ArrayIndexOutOfBoundsException();
    }


    //扩容
    public void resizing(int MAX){

        String[] arr2 = new String[MAX];
        for (int i = 0; i < N ; i++) {
            arr2[i] = arr[i];
        }
        arr = arr2;
    }


    public static void main(String[] args) {


        ResizingArrayQueueOfString queue = new ResizingArrayQueueOfString();
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println(queue.dequeue());

    }


    class ResizingArrayQueue<Item> implements Iterable<Item>{


        private Item[] q ;
        private int N = 0 ;
        private int first = 0 ;
        private int last = 0 ;

        public ResizingArrayQueue() {q = (Item[]) new Object[2];}

        private void resize(int max){
            assert max >= N ;
            Item[] temp = (Item[])new Object[max];

            //这个比较吊啊
            for (int i = 0; i < N ; i++) {
                temp[i] = q[(first + i) % q.length];
            }
            q= temp ;
            first = 0 ;
            last = N ;
        }


        public void enqueue(Item item){
            if(N == q.length) resize(2*q.length);
            q[last++] = item;
            //这个是什么意思啊?
            if(last == q.length) last = 0 ;
            N++;
        }


        public Item dequeue(){

            if(isEmpty()) throw new RuntimeException("Queue underflow");
            Item item = q[first];
            q[first] = null;
            N -- ;
            first ++ ;
            if(first == q.length) first = 0 ;
            if(N > 0 && N == q.length/4) resize(q.length/2);
            return item ;


        }

        public Boolean isEmpty()
        { return N == 0 ;}

        public int Size(){
            return   N ;
        }



        @Override
        public Iterator<Item> iterator() {



            return null;
        }
    }






}