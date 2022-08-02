package com.ljw4dakeai.jinjieban.chapter05.test02list.testpackage01;

import java.util.LinkedList;

/**
 * @author ZJH
 * @info 底层数据结构 双向链表
 */
public class Test03linkListFunc {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        //增加元素(默认添加到尾部节点)
        strings.add("Python");
        strings.add("MySQL");
        strings.add("JAVA");
        strings.add("MongoDB");
        strings.add("Redis");
        System.out.println(strings);

        //添加数据到头部节点

        strings.addFirst("Hello");
        System.out.println(strings);

        //添加数据到尾部节点
        strings.addLast("Word");
        System.out.println(strings);
        //获取头部节点
        System.out.println(strings.getFirst());
        //获取尾部节点
        System.out.println(strings.getLast());
        //删除头部节点数据
        strings.removeFirst();
        System.out.println(strings);
        //删除尾部节点数据
        strings.removeLast();
        System.out.println(strings);


    }
}
