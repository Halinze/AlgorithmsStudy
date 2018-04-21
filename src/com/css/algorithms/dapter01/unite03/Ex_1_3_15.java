package com.css.algorithms.dapter01.unite03;

import org.junit.Test;

import java.util.Scanner;

/**
 * Created by 46597 on 2018/4/14.
 */
public class Ex_1_3_15 {

    /**
     *
     * 编写一个Queue的用例，接受一个命令行参数K并打印出标准输入中的倒数第K个字符串
     * （假设标准输入中至少有K个字符串）
     */

    public static void main(String[] args) {

        Queue<String> queue = new Queue<>();

        Scanner scanner = new Scanner(System.in);


        while(scanner.hasNext()){
            String val = scanner.next();
            if(val.equals("end")){
                break;
            }else{
                System.out.println(val);
                queue.enqueue(val);
            }
        }
        scanner.close();

        int k = Integer.parseInt(args[0]);

        //System.out.println(queue.size() + " " + k);


        //好tm经典的错误

        //for (int i = 0; i < queue.size() ; i++) {

        //  System.out.println(queue.dequeue());

        //}
        int size = queue.size();
        for(int i = 0 ; i < size - k ; i ++){
            queue.dequeue();
        }
        System.out.println(queue.dequeue());


    }

    @Test
    public void test(){

        Queue<String> queue = new Queue<>();
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");

        for (int i = 0; i < 3 ; i++) {

            System.out.println(queue.dequeue());
        }

    }



}
