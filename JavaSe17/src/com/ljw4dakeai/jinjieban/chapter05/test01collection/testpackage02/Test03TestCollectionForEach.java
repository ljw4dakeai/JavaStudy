package com.ljw4dakeai.jinjieban.chapter05.test01collection.testpackage02;

import java.util.ArrayList;

/**
 * @author ZJH
 */
public class Test03TestCollectionForEach {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        //增加元素
        strings.add("张三丰");
        strings.add("张无忌");
        strings.add("谢逊");
        strings.add("白毛鹰王");
        strings.add("小昭");
        strings.add("俊阳公主");

        //第三种遍历方式
        strings.forEach(System.out::println);
    }
}
