package com.ljw4dakeai.jinjieban.chapter07.HomeWorkCode;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * @author ZJH
 */
public class WorkTwo {
    public static void main(String[] args) {
        //1.定义一个字符串数组
        Integer[] arr = {123, 456, 777, 345, 345, 222, 999, 222, 110, 120, 567};
        //3.对元素按照降序排列（可以使用流的sort方法，虽然我没讲，但是我相信你会用的）
        Stream
                .of(arr)
                .sorted(Comparator.reverseOrder())
        //4.截取前面8个
                .limit(8)
        //5.跳过前面3个
                .skip(3)
        //6.去除重复元素
                .distinct()
        //7.过滤保留偶数元素
                .filter(val -> val % 2 == 0)
        //8.遍历打印剩余元素
                .forEach(System.out::println);
    }
}
