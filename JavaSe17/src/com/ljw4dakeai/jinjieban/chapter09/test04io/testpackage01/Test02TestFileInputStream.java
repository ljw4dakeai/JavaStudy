package com.ljw4dakeai.jinjieban.chapter09.test04io.testpackage01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author ZJH
 * @info 一次读取多个字节
 */
public class Test02TestFileInputStream {
    public static void main(String[] args) throws IOException {
//        FileInputStream fileInputStream = new FileInputStream("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter09test04io/io.txt");
        FileInputStream fileInputStream = new FileInputStream("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter09test04io/testpackage01/Test02TestFileInputStream.java");


        //一般设置为1024个字节
        byte[] bytes = new byte[1024];
//        //把读取到的字节读取到字节数组中去, 并且返回有效字节个数
//        int read = fileInputStream.read(bytes);
//        System.out.println(Arrays.toString(bytes) + "有效字节个数" + read);
//        //有效数为1
//        read = fileInputStream.read(bytes);
//        System.out.println(Arrays.toString(bytes) + "有效字节个数" + read);
//
//        //有效数据为 -1
//        read = fileInputStream.read(bytes);
//        System.out.println(Arrays.toString(bytes) + "有效字节个数" + read);


        //len 为有效字节的个数
        int len;
        while ((len = fileInputStream.read(bytes) )!= -1 ){
            String s = new String(bytes, 0, len);
            System.out.println(s);
        }


        FileInputStream fileInputStreamOther = new FileInputStream("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter09test04io/testpackage01/Test01TestSimpleFileInputStream.java");

        System.out.println(new String(fileInputStreamOther.readAllBytes()));
        fileInputStream.close();
        fileInputStreamOther.close();

    }
}
