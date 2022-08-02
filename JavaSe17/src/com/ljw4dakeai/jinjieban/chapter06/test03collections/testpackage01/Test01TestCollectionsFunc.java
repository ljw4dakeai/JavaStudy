package com.ljw4dakeai.jinjieban.chapter06.test03collections.testpackage01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author ZJH
 */
public class Test01TestCollectionsFunc {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "张三", "王五", "嘿嘿嘿!");
        System.out.println(strings);


        Collections.shuffle(strings);
        System.out.println(strings);


        //自然排序 升序
        Collections.sort(strings);
        System.out.println(strings);


        Collections.sort(strings, (val1, val2) -> val2.compareTo(val1));
        System.out.println(strings);

        ArrayList<String> nums = new ArrayList<>();
        Collections.addAll(nums, "10", "20", "40", "80");

        System.out.println(nums.stream().map(Integer::parseInt).toList());
    }
}
