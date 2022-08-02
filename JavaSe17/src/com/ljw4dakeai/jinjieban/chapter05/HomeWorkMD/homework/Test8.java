package com.itheima.d4_homework;

import java.util.ArrayList;
import java.util.Collections;

public class Test8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("e");
        list.add("f");
        list.add("d");
        list.add("a");

        //对集合中的元素去重
        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list) {
            //如s元素再list2中不包含，添加到list2中
            if(!list2.contains(s)){
                list2.add(s);
            }
        }
        System.out.println(list2);
    }
}
