package com.ljw4dakeai.jinjieban.chapter05.test01collection.testpackage02;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author ZJH
 * @info 迭代器遍历集合(通用方法)
 */
public class Test01TestCollectionIterator {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        //增加元素
        strings.add("张三丰");
        strings.add("张无忌");
        strings.add("谢逊");
        strings.add("白毛鹰王");
        strings.add("小昭");
        strings.add("俊阳公主");

        //第一种遍历方式
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("-----------------------------------------------------");

        //第二种便利方式
        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println("-----------------------------------------------------");

        //第三种遍历方式
        strings.forEach(System.out::println);
    }
}
