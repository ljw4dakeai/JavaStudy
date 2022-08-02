package com.ljw4dakeai.jinjieban.chapter05.test03set.testpackage01;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author ZJH
 * @info
 * -- HashSet                     无序
 *      --LinkedHashSet         有序
 * --TreeSet                       排序
 */
public class Test01TestSet {
    public static void main(String[] args) {
        //无序
        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("唐僧");
        stringHashSet.add("孙悟空");
        stringHashSet.add("猪八戒");
        stringHashSet.add("沙和尚");
        stringHashSet.add("小白龙");

        System.out.println(stringHashSet);


        //有序
        LinkedHashSet<String> stringsLinkedHashSet = new LinkedHashSet<>();
        stringsLinkedHashSet.add("唐僧");
        stringsLinkedHashSet.add("孙悟空");
        stringsLinkedHashSet.add("猪八戒");
        stringsLinkedHashSet.add("沙和尚");
        stringsLinkedHashSet.add("小白龙");

        System.out.println(stringsLinkedHashSet);


        //排序
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("唐僧");
        stringTreeSet.add("孙悟空");
        stringTreeSet.add("猪八戒");
        stringTreeSet.add("沙和尚");
        stringTreeSet.add("小白龙");

        System.out.println(stringTreeSet);

    }
}
