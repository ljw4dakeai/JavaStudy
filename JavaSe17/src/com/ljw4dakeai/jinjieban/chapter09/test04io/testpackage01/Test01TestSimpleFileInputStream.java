package com.ljw4dakeai.jinjieban.chapter09.test04io.testpackage01;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author ZJH
 */
public class Test01TestSimpleFileInputStream {
    public static void main(String[] args) throws IOException {
        //创建流
        FileInputStream fileInputStream = new FileInputStream("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter09test04io/io.txt");
        //每次读取的一个字节
        int read;
        while ((read = fileInputStream.read()) != -1) {
            System.out.println(read);
            System.out.println((char) read);
        }

        //关闭流
        fileInputStream.close();

        //不关闭会被程序一直使用
    }
}
