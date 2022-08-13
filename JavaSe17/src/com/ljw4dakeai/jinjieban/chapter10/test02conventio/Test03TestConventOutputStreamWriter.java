package com.ljw4dakeai.jinjieban.chapter10.test02conventio;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author ZJH
 */
public class Test03TestConventOutputStreamWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("JavaSe17/src/com/ljw4dakeai/jinjieban/chapter10/test02conventio/GBK.txt", true), "GBK"));
        bufferedWriter.write("我很好呀, 很棒呢!");
        bufferedWriter.close();
    }
}
