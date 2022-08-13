package com.ljw4dakeai.jinjieban.chapter09.HomeWorkMD.homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileInputStream和FileOutputStream复制文件的几种操作
 *      FileInputStream： 读取文件中的字节
 *      FileOutputStream: 往文件中写入字节
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        //1.创建流对象
        FileInputStream fis = new FileInputStream("day09_file_io\\b.txt");
        FileOutputStream fos = new FileOutputStream("day09_file_io\\a.txt");

        //2.读、写数据
        //一次读取全部，一些写全部
        fos.write(fis.readAllBytes());

        //3.是否资源
        fis.close();
        fos.close();
    }
}
