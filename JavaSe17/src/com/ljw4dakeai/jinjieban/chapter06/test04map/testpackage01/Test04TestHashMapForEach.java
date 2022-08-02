package com.ljw4dakeai.jinjieban.chapter06.test04map.testpackage01;


import java.util.HashMap;
import java.util.Map;

/**
 * @author ZJH
 * @info 遍历map集合
 */
public class Test04TestHashMapForEach {
    public static void main(String[] args) {
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("小明", "小花");
        stringStringHashMap.put("小黑", "小白");
        stringStringHashMap.put("邹家豪", "李静雯");

        //通过keySet获取所有键遍历
        for (String s : stringStringHashMap.keySet()) {
            System.out.println(s + "-> " + stringStringHashMap.get(s));
        }




        //转化为entrySet() 键值对
        for (Map.Entry<String, String> stringStringEntry : stringStringHashMap.entrySet()) {
            System.out.println(stringStringEntry.getKey() + "->" + stringStringEntry.getValue());
        }

        //forEach遍历
        stringStringHashMap.forEach((k,v) -> System.out.println(k + "->" + v));
        stringStringHashMap.entrySet().forEach(System.out :: println);

    }
}
