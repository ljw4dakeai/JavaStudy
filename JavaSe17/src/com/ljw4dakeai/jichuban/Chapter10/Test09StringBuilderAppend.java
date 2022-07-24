package com.ljw4dakeai.jichuban.Chapter10;

/**
 * @author ZJH
 * @info 字符串拼接效率对比
 */
public class Test09StringBuilderAppend {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder(" ");
        String  s_ = new String(" ");

        stringAppend(s_); //速度快100倍
        stringBuilderAppend(s);

    }

    private static void stringBuilderAppend(StringBuilder s) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            s.append(i);
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println(time);
    }

    private static void stringAppend(String s) {
        //开始时间
        long start = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            s += i;
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println(time);
    }
}
