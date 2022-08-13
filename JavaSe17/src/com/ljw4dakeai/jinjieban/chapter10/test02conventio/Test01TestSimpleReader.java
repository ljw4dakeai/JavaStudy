package com.ljw4dakeai.jinjieban.chapter10.test02conventio;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author ZJH
 * @info
 * 字符流默认以utf-8读取文件,直接读取其他字符集文件会出现乱码
 */
public class Test01TestSimpleReader {
    public static void main(String[] args) throws IOException {
        //邹家豪
        FileReader fileReader = new FileReader("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/test02conventio/utf-8.txt");

//        //�޼Һ�
//        FileReader fileReader = new FileReader("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/test02conventio/GBK.txt");
        int len;
        char[] chars = new char[1024];
        while ((len = fileReader.read(chars)) != -1){
            System.out.println(new  String(chars, 0 ,len));
        }
        fileReader.close();


    }
}
