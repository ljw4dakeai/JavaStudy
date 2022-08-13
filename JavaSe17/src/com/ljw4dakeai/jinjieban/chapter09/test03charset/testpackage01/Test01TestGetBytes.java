package com.ljw4dakeai.jinjieban.chapter09.test03charset.testpackage01;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * @author ZJH
 * @info
 * 按照什么方式编码 就必须按照什么方式解码
 *
 */

public class Test01TestGetBytes {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "中国牛逼!";

        //默认按按照utf-8, 把字符串转化为字节数组
        byte[] defaultBytes = s.getBytes();
        byte[] gbkBytes = s.getBytes("GBK");
        byte[] utfBytes = s.getBytes(StandardCharsets.UTF_8);

        System.out.println(Arrays.toString(defaultBytes));
        System.out.println(Arrays.toString(gbkBytes));
        System.out.println(Arrays.toString(utfBytes));


        //按照原来的方案解码
        String defaultS = new String(defaultBytes);
        String gbkS = new String(gbkBytes, "GBK");
        String utfS = new String(utfBytes, StandardCharsets.UTF_8);

        System.out.println(defaultS);
        System.out.println(gbkS);
        System.out.println(utfS);
    }
}
