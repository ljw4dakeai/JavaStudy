package com.ljw4dakeai.jinjieban.chapter10.test02conventio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ZJH
 * 转换流,将字节流转换为字符流
 * 如果没有指定转换格式, 默认使用utf-8, 转换时需要认清文件编码格式
 */
public class Test02TestConventInputStreamReader {
    public static void main(String[] args) throws IOException {
//        InputStreamReader InputStreamReaderinputStreamReader = new InputStreamReader(new FileInputStream("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/test02conventio/utf-8.txt"));
        InputStreamReader inputStreamReader = new InputStreamReader(
                new FileInputStream("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/test02conventio/GBK.txt"),
                "GBK"
        );

        //再进一步包装
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        //注意使用对应的编码格式!
//        int len;
//        char[] chars = new char[1024];
//        while ((len = inputStreamReader.read(chars)) != -1) {
//            System.out.println(new String(chars, 0, len));
//        }
//        inputStreamReader.close();

        String line;
        while((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }

        bufferedReader.close();
    }
}
