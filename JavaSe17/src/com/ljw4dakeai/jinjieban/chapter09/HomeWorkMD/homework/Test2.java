package com.ljw4dakeai.jinjieban.chapter09.HomeWorkMD.homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileInputStream和FileOutputStream复制文件的几种操作
 *      FileInputStream： 读取文件中的字节
 *      FileOutputStream: 往文件中写入字节
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        //1.创建流对象
        FileInputStream fis = new FileInputStream("day09_file_io\\b.txt");
        FileOutputStream fos = new FileOutputStream("day09_file_io\\a.txt");

        //2.读、写数据
        //一次读取多个字节，一次写多个字节
        byte[] bytes  = new byte[1024];
        int len; //每次读取的有效字节个数
        /*
         * read(bytes): 读取文件中的字节，把读取到的字节存入数组中，返回值代表读取到的有效字节个数。
         */
        while ((len = fis.read(bytes))!=-1){
            //把读取到的有效字节，写到目标文件中去
            fos.write(bytes,0,len);
        }

        //3.是否资源
        fis.close();
        fos.close();
    }
}
