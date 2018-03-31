package com.css.baseStudy;

/**
 * Created by 46597 on 2018/3/26.
 */


class Demo01 {
    int a;
}

public class TestDemo {


    public static void update(Demo01 d) {
        d.a += 10;
    }

    public static void update(int a) {
        a += 10;
        System.out.println(a);
    }

    public static void main(String[] args) {
        Demo01 d = new Demo01();
        d.a = 10;
        update(d);
        System.out.println(d.a);//20

        //要记住啊 这是坑点！
        int a = 10;
        update(a);
        System.out.println(a);//10
    }


}
