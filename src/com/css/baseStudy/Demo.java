package com.css.baseStudy;

/**
 * Created by 46597 on 2018/3/26.
 */
public class Demo {
    int x;
    int y = 3;
    static int z = 10;
    static {
        System.out.println("z=" + z);//10
    }

    Demo() {
        System.out.println("x=" + x);//0
        System.out.println("y=" + y);//3
    }

    {
        System.out.println("caoshisheng");
    }
}


class DemoTest2 {
    public static void main(String[] args) {
        Demo d = new Demo();
    }
}
