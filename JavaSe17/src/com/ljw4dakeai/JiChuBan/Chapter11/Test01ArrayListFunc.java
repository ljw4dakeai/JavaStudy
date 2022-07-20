package com.ljw4dakeai.JiChuBan.Chapter11;

import java.util.ArrayList;

/**
 * @author ZJH
 * @info Arraylist 常用方法
 */
public class Test01ArrayListFunc {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();

        //add方法
        strings.add("zoujiahao");
        strings.add("lijingwen");
        strings.add("heiheihei");
        strings.add("ikun");

        //add 在指定索引位置放置元素
        strings.forEach(System.out::println);
        System.out.println(strings);

        System.out.println("==================");

        strings.add(0, "ljw4dakeai");

        strings.forEach(System.out::println);
        System.out.println(strings);

        //remove
        String removeValue = strings.remove(3);
        System.out.println(removeValue);
        System.out.println("==================");

        //set 集合中的ikun 为IKUN

        String setValue = strings.set(3, "IKUN");
        System.out.println(setValue);
        System.out.println("==================");
        strings.forEach(System.out::println);
        System.out.println(strings);

        //get 查询
        System.out.println(strings.get(2));


        System.out.println("===========================================");

        //size() 查看元素个数
        System.out.println(strings.size());

        //contains()  判断是不是有这个元素
        boolean listContainsLijingwen = strings.contains("lijingwen");
        System.out.println(listContainsLijingwen);

        boolean listContainsXiaoSB = strings.contains("xiaoSB");
        System.out.println(listContainsXiaoSB);

        //isEmpty() 判断是不是为空集合
        boolean listIsEmpty = strings.isEmpty();
        System.out.println(listIsEmpty);

        //clear()清空元素
        strings.clear();

        boolean listIsEmpty_ = strings.isEmpty();
        System.out.println(listIsEmpty_);


        //会出现空指针异常
        strings = null;
        System.out.println(strings.isEmpty());


    }
}
