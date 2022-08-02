package com.ljw4dakeai.jinjieban.chapter05.test02list.testpackage01;

import java.util.ArrayList;

/**
 * @author ZJH
 */
public class Test01TestListFunc {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        //增加元素
        strings.add("张三丰");
        strings.add("张无忌");
        strings.add("谢逊");
        strings.add("白毛鹰王");
        strings.add("小昭");
        strings.add("俊阳公主");
        System.out.println(strings);

        System.out.println("--------------------------------");
        //指定位置添加元素
        strings.add(2, "金轮法王");
        System.out.println(strings);

        System.out.println("--------------------------------");
        //指定位置删除元素
        strings.remove(6);
        System.out.println(strings);
        System.out.println("--------------------------------");

        //指定位置修改元素
        String updateValue = strings.set(3, "金毛狮王");
        System.out.println(updateValue);
        System.out.println(strings);
        System.out.println("--------------------------------");


        //指定位置获取元素
        System.out.println(strings.get(3));
        System.out.println("--------------------------------");
    }
}
