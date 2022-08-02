package com.ljw4dakeai.jinjieban.chapter07.test02stream.testpackage01;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author ZJH
 * @info Stream 流简单使用
 */
public class Test01TestStreamSimpleUse {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "张三", "李四", "张无忌", "张三丰", "周芷若", "小昭");

        ArrayList<String> zhangStrings = new ArrayList<>();
        for (String string : strings) {
            if (string.startsWith("张")) {
                zhangStrings.add(string);
            }
        }
        ArrayList<String> zhangThreeStrings = new ArrayList<>();
        for (String zhangString : zhangStrings) {
            if (zhangString.length() == 3) {
                zhangThreeStrings.add(zhangString);
            }
        }

        zhangThreeStrings.forEach(System.out::println);


        //stream流
        strings
                .stream()
                .filter(val -> val.startsWith("张"))
                .filter(val -> val.length() == 3)
                .forEach(System.out::println);



    }
}
