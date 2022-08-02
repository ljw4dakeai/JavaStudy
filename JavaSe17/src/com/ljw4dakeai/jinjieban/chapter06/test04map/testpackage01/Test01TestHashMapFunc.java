package com.ljw4dakeai.jinjieban.chapter06.test04map.testpackage01;

import java.util.HashMap;

/**
 * @author ZJH
 */
public class Test01TestHashMapFunc {
    public static void main(String[] args) {
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("王宝强", "山东");
        stringStringHashMap.put("贾乃亮", "湖南");
        stringStringHashMap.put("吴亦凡","加拿大");


        System.out.println(stringStringHashMap);

        //键如果重复, 会覆盖原来的值,并返回被覆盖的值
        //返回值是被覆盖的值
        stringStringHashMap.put("吴亦凡", "朝阳海淀监狱");

        System.out.println(stringStringHashMap);

        //移除键值对
        String removeValue = stringStringHashMap.remove("吴亦凡");
        //返回被移除的值
        System.out.println(removeValue);
        System.out.println(stringStringHashMap);


        //get方法 获取值
        String getValue = stringStringHashMap.get("王宝强");
        System.out.println(getValue);

        //判断是否包含指定的键
        boolean isContainsKey = stringStringHashMap.containsKey("王宝强");
        System.out.println(isContainsKey);


        //判断是否包含指定的值
        boolean isContainsValue = stringStringHashMap.containsValue("湖北");
        System.out.println(isContainsValue);

        //判断是否为空
        boolean isEmpty = stringStringHashMap.isEmpty();
        System.out.println(isEmpty);

        //清空map
//        stringStringHashMap.clear();
//        System.out.println(stringStringHashMap.isEmpty());

        //键值对的长度
        System.out.println(stringStringHashMap.size());
    }
}
