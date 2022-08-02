package com.ljw4dakeai.jinjieban.chapter05.test01collection.testpackage02;

import java.util.ArrayList;

/**
 * @author ZJH
 * @info 增强for循环 , 知识语法格式和迭代器不一样,本质也是迭代器
 */
public class Test02TestCollectionForAppend {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        //增加元素
        strings.add("张三丰");
        strings.add("张无忌");
        strings.add("谢逊");
        strings.add("白毛鹰王");
        strings.add("小昭");
        strings.add("俊阳公主");

        //第二种遍历方式
        for (String string : strings) {
            System.out.println(string);
        }

    }
}
