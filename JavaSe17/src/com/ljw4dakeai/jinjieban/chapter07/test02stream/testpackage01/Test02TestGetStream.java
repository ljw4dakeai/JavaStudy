package com.ljw4dakeai.jinjieban.chapter07.test02stream.testpackage01;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author ZJH
 */
public class Test02TestGetStream {
    public static void main(String[] args) {

        //单列集合
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "Hello", "Java", "Word");
        //通过集合.stream()
        strings
                .stream()
                .forEach(System.out::println);


        //双列集合
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("李四", "湖北");
        stringStringHashMap.put("赵四", "山东");
        stringStringHashMap.put("大表哥", "江西");
        stringStringHashMap.put("嘿嘿嘿", "湖南");

        stringStringHashMap
                .keySet()
                .stream()
                .forEach(System.out::println);

        stringStringHashMap
                .values()
                .stream()
                .forEach(System.out::println);

        stringStringHashMap
                .entrySet()
                .stream()
                .forEach(System.out::println);


        //数组获取流(工具类)
        int[] ints = {60, 50, 40, 20, 10};
       Arrays
               .stream(ints)
               .sorted()
               .forEach(System.out::println);



        //数组获取流of方法
        Integer[] integers = {10, 20, 40, 50,60};
        System.out.println(
                Stream
                .of(integers)
                .sorted((val1, val2) -> val2 - val1)
                .reduce(Integer::sum)
        );

    }
}
