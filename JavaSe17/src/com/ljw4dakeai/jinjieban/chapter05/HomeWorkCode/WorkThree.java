package com.ljw4dakeai.jinjieban.chapter05.HomeWorkCode;

import java.util.ArrayList;

/**
 * @author ZJH
 * @info
 *  需求 : ArrayList有以下元素: "a","f","b","c","a","d"  对ArrayList集合去重
 *  不允许使用 Set 集合 (因为是明天学的东西)
 */
public class WorkThree {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("a");
        strings.add("d");
        strings.add("c");

//        //方法1
//        ArrayList<String> newStrings = new ArrayList<>();
//        strings.forEach(val -> {
//            if(!newStrings.contains(val)){
//                newStrings.add(val);
//            }
//        });
//        System.out.println(newStrings);


        //方法2
        System.out.println(strings.stream().distinct().toList());


    }
}
