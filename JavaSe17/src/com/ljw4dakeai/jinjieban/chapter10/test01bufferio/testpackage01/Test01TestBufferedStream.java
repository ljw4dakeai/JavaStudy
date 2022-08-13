package com.ljw4dakeai.jinjieban.chapter10.test01bufferio.testpackage01;

import java.io.*;

/**
 * @author ZJH
 * @info 读写数据和之前基本一样
 * 只是创建流对象不一样
 */

public class Test01TestBufferedStream {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(
                "JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/test01bufferio/picture.jpg"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(
                "JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/copypicture/picture.jpg"));

        int len;
        byte[] bytes = new byte[1024];

        while ((len = bufferedInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes, 0 ,len);
        }

        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
