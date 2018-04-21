package com.css.algorithms.dapter01;

/**
 * Created by 46597 on 2018/4/18.
 */
public class Test02 {

    //String 是不可变得该怎么理解？
    public static void main(String[] args) {

        //打印  0 + 1 + 2 + 3 + 4

        //String str = null ;
        for (int i = 0; i < 10 ; i++) {

          String str = i + " + ";
          if(i==9)
            System.out.println(str);
        }



   /*     String a = "b";
        String[] arr = new String[2];
        arr[0] = a;
        a = "c";
        arr[1] = a;

        for (String s : arr) {
            System.out.println(s);
        }


        A a1 = new A("小a",10);
       // A a2 = new A("小b", 20);

        A[] strs = new A[2];
        strs[0] = a1 ;
        a1 = new  A("小b",20);
        strs[1] = a1;

        for (A str : strs) {
            System.out.println(str);

        }*/


    }


    private static class A {

        private String name;
        private int age ;

        public A(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "A{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }


}
