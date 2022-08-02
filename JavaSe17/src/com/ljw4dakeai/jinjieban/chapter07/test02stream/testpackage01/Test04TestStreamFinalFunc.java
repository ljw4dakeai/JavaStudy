package com.ljw4dakeai.jinjieban.chapter07.test02stream.testpackage01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author ZJH
 */
public class Test04TestStreamFinalFunc {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "张三", "李四", "张无忌", "张三丰", "周芷若", "小昭", "金毛狮王", "白眉鹰王");


        //forEach
        strings
                .stream()
                .forEach(System.out::println);

        //count
        System.out.println(
                strings
                .stream()
                .filter(val -> val.length() == 3)
                .count()
        );

        //toList
        System.out.println(
                strings
                .stream()
                .sorted(Comparator.reverseOrder())
                .toList()
        );


    }
}
