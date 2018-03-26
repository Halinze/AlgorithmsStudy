package com.css.baseStudy;

import org.junit.Test;

import java.io.*;

/**
 * Created by 46597 on 2018/3/19.
 */
public class IOStudy {

   // 将一个字节byte数组{97,98,65,66}中的数据写到D:\\test1\\1.txt 的文件中  为什么变成了abAB
    @Test
    public void test_1() throws IOException {

       // byte[] arr = {97,98,65,66};

        String str = "97,98,65,66";

        OutputStream outputStream = new FileOutputStream(new File("D:/test/1.text"));

        outputStream.write(str.getBytes());

        outputStream.close();


    }



}
