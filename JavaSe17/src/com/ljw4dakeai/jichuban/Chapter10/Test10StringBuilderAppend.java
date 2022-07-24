package com.ljw4dakeai.jichuban.Chapter10;

/**
 * @author ZJH
 * @info StringBuilder append 方法
 */
public class Test10StringBuilderAppend {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(123);
        stringBuilder.append(10.5);
        stringBuilder.append("heiheihei");
        System.out.println(stringBuilder);
    }
}
