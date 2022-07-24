package com.ljw4dakeai.jichuban.Chapter10;

/**
 * @author ZJH
 * @info StringBuilder的使用
 */
public class Test03StringBuilder {
    public static void main(String[] args) {
        //空的可变字符串 容量是16
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder);
        //开创一个zoujiahao + 16长度的字符串
        StringBuilder zoujiahao = new StringBuilder("zoujiahao");
        System.out.println(zoujiahao);


    }
}
