package com.ljw4dakeai.jinjieban.chapter04.test04arrays.testpackage01;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author ZJH
 */
public class Test01TestArraysFunc {
    public static void main(String[] args) {
        Integer[] ints = {10, 8, 6, 9, 4, 2, 13};
        //第一次输入  输出原来的数组
        System.out.println(Arrays.toString(ints));
        Arrays.sort(ints);
        //第二次默认使用sort的升序,输出升序排列数组
        System.out.println(Arrays.toString(ints));

        Arrays.sort(ints, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 -o1;
            }
        });

        //第三次自定义降序排序器,输出降序排列数组
        System.out.println(Arrays.toString(ints));
        //stream流排序 lambda实现排序 升序排序
        System.out.println(Arrays.toString(Arrays.stream(ints).sorted((value1, value2) -> value1 - value2).toArray()));


    }
}
