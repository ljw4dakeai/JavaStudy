package com.ljw4dakeai.jinjieban.chapter05.test01collection.testpackage01;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author ZJH
 */
public class Test01TestCollectionFunc {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        //增加元素
        strings.add("张三丰");
        strings.add("张无忌");
        strings.add("谢逊");
        strings.add("白毛鹰王");
        strings.add("小昭");
        strings.add("俊阳公主");


        //输出集合
        System.out.println(strings);

        System.out.println("----------------------------------------");

        //删除存在元素
        System.out.println(strings.remove("张三丰"));
        System.out.println(strings);
        //删除不存在元素
        System.out.println(strings.remove("邹家豪"));
        System.out.println(strings);
        System.out.println("----------------------------------------");

        //判断是否包含
        System.out.println(strings.contains("邹家豪"));
        System.out.println(strings.contains("张无忌"));
        System.out.println("----------------------------------------");
        //清空集合
        System.out.println("清空集合之前");
        System.out.println(strings);
        //获取集合数据个数
        System.out.println(strings.size());
        System.out.println("清空集合之后");
        strings.clear();
        System.out.println(strings);
        System.out.println(strings.size());


        System.out.println("----------------------------------------");
        //清空后添加元素
        strings.add("张三丰");
        strings.add("张无忌");
        strings.add("谢逊");
        strings.add("白毛鹰王");
        strings.add("小昭");
        strings.add("俊阳公主");

        //转换为数组
        System.out.println(strings.toArray().getClass().getSimpleName());
        System.out.println(Arrays.toString(strings.toArray()));


    }
}
